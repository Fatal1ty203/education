package homework10_linkedList;

import lesson1_list.task2.Fruit;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.add("One");
        myLinkedList1.add("Two");
        myLinkedList1.add("Three");
        myLinkedList1.add("Four");

        for (int i = 0; i < myLinkedList1.size(); i++){
            System.out.println(myLinkedList1.get(i));
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.remove();
    }
}
