package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialStateTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void new_linked_list_should_have_same_head_and_tail() {
        assertEquals(1, list.getHead().getValue());
        assertEquals(1, list.getTail().getValue());
    }

    @Test
    void new_linked_list_should_have_length_1() {
        assertEquals(1, list.getLength());
    }
}
