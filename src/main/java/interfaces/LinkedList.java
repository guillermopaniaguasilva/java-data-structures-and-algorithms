package interfaces;

import implementations.Node;

public interface LinkedList {
    Node getHead();
    Node getTail();
    int getLength();
    LinkedList push(Object value);
    Node pop();
    LinkedList unshift(Object value);
    Node shift();
    Node get(int index);
    boolean set(int index, Object value);
    Object insert(int index, Object value);
    Object remove(int index);
    LinkedList reverse();
}
