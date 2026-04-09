// Program 2: Filter names ending with "n"

import java.util.*;

class Program2 {
    public static void main(String[] args) {
        List<String> names = List.of("sanyam","rahul","aman","rohan");

        names.stream()
                .filter(n -> n.endsWith("n"))
                .forEach(System.out::println);
    }
}