// Program 3: Filter employees with salary > 50000

import java.util.*;

class Program3 {
    public static void main(String[] args) {
        List<Integer> salary = List.of(40000,60000,30000,80000);

        salary.stream()
                .filter(s -> s > 50000)
                .forEach(System.out::println);
    }
}