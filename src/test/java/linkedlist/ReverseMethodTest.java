package linkedlist;

import implementations.LinkedListADT;
import interfaces.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseMethodTest {
    LinkedList list;

    @BeforeEach
    void initializeList() {
        list = new LinkedListADT(1);
    }

    @Test
    void should_reverse_list() {
        list.push(2);
        list.push(3);
        list.push(4);
        list.reverse();

        assertEquals(4, list.getHead().getValue());
        assertEquals(3, list.getHead().getNext().getValue());
        assertEquals(2, list.getHead().getNext().getNext().getValue());
        assertEquals(1, list.getTail().getValue());
    }
}
