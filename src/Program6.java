// Program 6: Filter numbers whose square > 500

import java.util.*;

class Program6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10,15,20,25);

        list.stream()
                .filter(n -> n*n > 500)
                .forEach(System.out::println);
    }
}