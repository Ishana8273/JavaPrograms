// Program 10: Find length of each string

import java.util.*;

class Program10 {
    public static void main(String[] args) {
        List<String> list = List.of("java","stream");

        System.out.println(
                list.stream()
                        .map(String::length)
                        .toList()
        );
    }
}