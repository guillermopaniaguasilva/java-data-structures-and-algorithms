package linkedlist;

import implementations.LinkedListADT;
import implementations.Node;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PopMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_remove_last_element_and_return_it() {
        Node removedItem = list.pop();
        assertNull(list.getTail());
        assertEquals(1, removedItem.getValue());
    }

    @Test
    void should_set_new_tail_to_have_null_as_next() {
        list.push(2);
        list.push(3);
        list.pop();
        assertNull(list.getTail().getNext());
    }

    @Test
    void should_decrease_length_by_1() {
        int initialLength = list.getLength();
        list.pop();
        assertEquals(initialLength - 1, list.getLength());
    }

    @Test
    void should_set_head_and_tail_to_null_when_linked_list_ends_empty() {
        list.pop();
        assertNull(list.getHead());
        assertNull(list.getTail());
    }
}
