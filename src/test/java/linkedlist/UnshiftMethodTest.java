package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnshiftMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_insert_element_at_beginning_of_linked_list() {
        list.unshift(2);
        assertEquals(2, list.getHead().getValue());
        assertEquals(1, list.getTail().getValue());
    }

    @Test
    void should_increase_length_by_1() {
        int initialLength = list.getLength();
        list.unshift(2);
        assertEquals(initialLength + 1, list.getLength());
    }

    @Test
    void should_return_same_instance_of_linked_list() {
        assertEquals(list, list.unshift(2));
    }

    @Test
    void should_point_head_and_tail_to_the_added_element_when_linked_list_is_empty() {
        list.pop();
        list.unshift(2);
        assertEquals(2, list.getHead().getValue());
        assertEquals(2, list.getTail().getValue());
    }
}
