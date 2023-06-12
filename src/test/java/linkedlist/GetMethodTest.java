package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_retrieve_element_by_index() {
        assertEquals(1, list.get(0).getValue());
    }

    @Test
    void should_return_null_when_requested_index_is_out_of_bounds() {
        assertNull(list.get(-1));
        assertNull(list.get(1));
    }
}
