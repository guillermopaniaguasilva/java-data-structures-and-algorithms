package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PushMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_add_value_to_end_of_linked_list() {
        assertEquals(1, list.getTail().getValue());
        list.push(2);
        assertEquals(2, list.getTail().getValue());
    }

    @Test
    void should_add_value_to_head_when_linked_list_is_empty() {
        list.pop();
        assertNull(list.getHead());
        list.push(2);
        assertEquals(2, list.getHead().getValue());
    }

    @Test
    void should_increase_length_by_1() {
        int initialLength = list.getLength();
        list.push(2);
        assertEquals(initialLength + 1, list.getLength());
    }

    @Test
    void should_return_this_instance_of_linked_list() {
        assertEquals(list, list.push(2));
    }
}
