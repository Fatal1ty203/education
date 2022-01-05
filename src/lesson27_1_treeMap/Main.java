package lesson27_1_treeMap;

import org.jetbrains.annotations.NotNull;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //TreeMap отличается от HashMap тем, что ключи хранятся в упорядоченном виде,а следовательно
        //Класс ключа должен реализовывать интфейс Comparable


        //TreeMap хранит ключи в виде красно-черного бинарного дерева
        TreeMap<Account, String> map = new TreeMap<>();
        map.put(new Account("login1", "pas1"), "Ivan");



    }
}
class Account implements Comparable<Account>{
    String login;
    String password;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public int compareTo(@NotNull Account o) {
        return login.compareTo(o.login);
    }
}
