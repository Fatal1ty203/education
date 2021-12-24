package lesson25_binaryTree.ex2;

import lesson25_binaryTree.MyBinaryTree;
import org.jetbrains.annotations.NotNull;

public class Main2 {
    public static void main(String[] args) {
        //Чтобы ключ был в вдие своего класса, он должен реализовыывать Comparable
        MyBinaryTree<Fruit, Double> tree1 = new MyBinaryTree<Fruit, Double>();

    }
}

class Fruit implements Comparable<Fruit>{
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Fruit o) {
        return name.compareTo(o.name);
    }
}
