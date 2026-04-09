// Program 4: Filter strings containing letter 'e'

import java.util.*;

class Program4 {
    public static void main(String[] args) {
        List<String> words = List.of("java","stream","code","api");

        words.stream()
                .filter(w -> w.contains("e"))
                .forEach(System.out::println);
    }
}