// Program 11: Capitalize first letter

import java.util.*;

class Program11 {
    public static void main(String[] args) {
        List<String> list = List.of("hello","java");

        System.out.println(
                list.stream()
                        .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                        .toList()
        );
    }
}