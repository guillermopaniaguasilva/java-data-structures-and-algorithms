package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_change_value_of_element_in_linked_list() {
        assertTrue(list.set(0, 2));
        assertEquals(2, list.get(0).getValue());
    }

    @Test
    void should_return_false_when_requested_index_is_out_of_bounds() {
        assertFalse(list.set(-1, 2));
        assertFalse(list.set(1, 2));
    }
}
