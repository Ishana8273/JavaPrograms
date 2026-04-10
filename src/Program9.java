// Program 9: Convert strings to uppercase

import java.util.*;

class Program9 {
    public static void main(String[] args) {
        List<String> list = List.of("java","stream","api");

        System.out.println(
                list.stream()
                        .map(String::toUpperCase)
                        .toList()
        );
    }
}