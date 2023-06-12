package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsertMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_insert_element_at_the_beginning_if_index_is_0() {
        assertEquals(list, list.insert(0, 2));
        assertEquals(2, list.getHead().getValue());
    }

    @Test
    void should_insert_element_at_the_end_if_index_equals_list() {
        assertEquals(list, list.insert(1, 2));
        assertEquals(2, list.getTail().getValue());
    }

    @Test
    void should_return_false_if_index_is_out_of_bounds() {
        assertFalse((Boolean) list.insert(-1, 2));
        assertFalse((Boolean) list.insert(2, 2));
    }

    @Test
    void should_increase_length_by_1_if_operation_is_successful() {
        int initialLength = list.getLength();
        list.insert(0, 2);
        assertEquals(initialLength + 1, list.getLength());
    }

    @Test
    void should_return_true_if_operation_is_successful() {
        list.push(2);
        assertTrue((Boolean) list.insert(1, 2));
    }
}

