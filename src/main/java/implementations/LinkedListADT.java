package implementations;

import interfaces.LinkedList;

public class LinkedListADT implements LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedListADT(Object value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    @Override
    public LinkedList push(Object value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.setNext(newNode);
        }
        this.tail = newNode;
        this.length++;
        return this;
    }

    @Override
    public Node pop() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        Node prev = this.head;
        while (temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }
        this.tail = prev;
        this.tail.setNext(null);
        this.length--;
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
        return temp;
    }

    @Override
    public LinkedList unshift(Object value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
        return this;
    }

    @Override
    public Node shift() {
        if (this.head == null) {
            return null;
        }
        Node temp = this.head;
        this.head = this.head.getNext();
        temp.setNext(null);
        this.length--;
        if (this.length == 0) {
            this.tail = null;
        }
        return temp;
    }

    @Override
    public Node get(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    @Override
    public boolean set(int index, Object value) {
        Node temp = this.get(index);
        if (temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }

    @Override
    public Object insert(int index, Object value) {
        if (index == 0) {
            return this.unshift(value);
        }
        if (index == this.length) {
            return this.push(value);
        }
        if (index < 0 || index > this.length) {
            return false;
        }
        Node newNode = new Node(value);
        Node temp = this.get(index - 1);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        this.length++;
        return true;
    }

    @Override
    public Object remove(int index) {
        if (index == 0) {
            return this.shift();
        }
        if (index == this.length - 1) {
            return this.pop();
        }
        if (index < 0 || index >= this.length) {
            return null;
        }
        Node before = this.get(index - 1);
        Node temp = before.getNext();
        before.setNext(temp.getNext());
        temp.setNext(null);
        this.length--;
        return temp;
    }

    @Override
    public LinkedList reverse() {
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
        Node next = temp.getNext();
        Node prev = null;
        for (int i = 0; i < this.length; i++) {
            next = temp.getNext();
            temp.setNext(prev);
            prev = temp;
            temp = next;
        }
        return this;
    }
}
