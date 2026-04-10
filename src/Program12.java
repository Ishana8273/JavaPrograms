// Program 12: First 5 even numbers

import java.util.*;

class Program12 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50,60);

        list.stream()
                .filter(n -> n % 2 == 0)
                .limit(5)
                .forEach(System.out::println);
    }
}