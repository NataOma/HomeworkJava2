package HomeWork4;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("banana");
        ll.add("pear");
        ll.add("grape");
        removeOddLengthStrings(ll);
        System.out.println(ll);
        MyStack ms = new MyStack();
        ms.push("asdfas");
        ms.push("sdafasfd");
        System.out.println(ms);
        System.out.println(ms.peek());
        System.out.println(ms);
        System.out.println(ms.pop());
        System.out.println(ms);
        ms.pop();
        String value = "apple";
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("pear");
        list.add("banana");

        ListUtils ls = new ListUtils();
        System.out.println(list);
        System.out.println(ls.countOccurrences(list, value));
        Deque<Integer> deque = new LinkedList<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        int n = 2;
        System.out.println(deque);
        DequeTask dt = new DequeTask();
        dt.rotateDeque(deque, n);
        System.out.println(deque);
        Deque<String> deq = new LinkedList<>();
        deq.add("apple");
        deq.add("banana");
        deq.add("apple");
        deq.add("cherry");
        value = "apple";
        System.out.println(deq);
        dt.removeAllOccurrences(deq, value);
        System.out.println(deq);

    }

/*
Задание 1. Удаление нечетных строк
Дан LinkedList с несколькими элементами. В методе
removeOddLengthStrings класса LLTasks реализуйте удаление строк, длина
которых нечетная. Используйте LinkedList и стандартные методы.
 */
    public static void removeOddLengthStrings(LinkedList<String> list){
        list.removeIf(n -> (n.length() % 2 != 0));
//        for (int i = 0; i < list.size(); i++) {
//            if (list.removeIf())
//        }
    }

}
