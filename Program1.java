// Program 1: Filter numbers divisible by 3 but not by 5

import java.util.*;

class Program1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,10,15,18,20);

        list.stream()
                .filter(n -> n % 3 == 0 && n % 5 != 0)
                .forEach(System.out::println);
    }
}