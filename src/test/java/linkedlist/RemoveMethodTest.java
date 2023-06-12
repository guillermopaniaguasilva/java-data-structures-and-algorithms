package linkedlist;

import implementations.LinkedListADT;
import implementations.Node;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_remove_element_from_the_beginning_if_index_is_0() {
        assertEquals(1, ((Node) list.remove(0)).getValue());
    }

    @Test
    void should_remove_element_from_the_end_if_index_equals_list_length_minus_1() {
        list.push(2);
        assertEquals(2, ((Node) list.remove(list.getLength() - 1)).getValue());
        assertEquals(1, list.getTail().getValue());
    }

    @Test
    void should_return_null_if_index_is_out_of_bound() {
        assertNull(list.remove(-1));
        assertNull(list.remove(2));
    }

    @Test
    void should_decrease_length_by_1() {
        int initialLength = list.getLength();
        list.remove(0);
        assertEquals(initialLength - 1, list.getLength());
    }

    @Test
    void should_return_removed_element() {
        assertEquals(1, ((Node) list.remove(0)).getValue());
    }
}
