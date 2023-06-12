package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShiftMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_return_null_when_trying_to_unshift_an_empty_linked_list() {
        list.pop();
        assertNull(list.shift());
    }

    @Test
    void should_remove_first_element() {
        list.push(2);
        list.shift();
        assertEquals(2, list.getHead().getValue());
        assertEquals(2, list.getTail().getValue());
    }

    @Test
    void should_decrease_length_by_1() {
        int initialLength = list.getLength();
        list.shift();
        assertEquals(initialLength - 1, list.getLength());
    }

    @Test
    void should_return_removed_item() {
        assertEquals(1, list.shift().getValue());
    }
}
