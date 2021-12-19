package homework10_linkedList;

import java.util.LinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T t){
        Node<T> node = new Node<>(t);
        if (head == null){
            head = node;
            tail = node;
        }else {
            tail.nextNode = node;
            tail = node;
        }
        size++;
    }

    public T get(int index){
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.nextNode;
        }
        return currentNode.value;
    }

    public boolean contains(T value){
        if (size() == 0) return false;
        Node<T> currentNode = head;
        for (int i = 0; i < size(); i++){
            if (value.equals(currentNode.value)) return true;
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public int size() {
        return size;
    }

    private T remove(){

    }

//    private E unlinkFirst(LinkedList.Node<E> f) {
//        // assert f == first && f != null;
//        final E element = f.item;
//        final LinkedList.Node<E> next = f.next;
//        f.item = null;
//        f.next = null; // help GC
//        first = next;
//        if (next == null)
//            last = null;
//        else
//            next.prev = null;
//        size--;
//        modCount++;
//        return element;
//    }

    private static class Node<T>{
        T value;
        Node<T> nextNode;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }

}
