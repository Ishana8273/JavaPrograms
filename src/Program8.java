// Program 8: Multiply each number by 2 using map()

import java.util.*;

class Program8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);

        System.out.println(
                list.stream()
                        .map(x -> x * 2)
                        .toList()
        );
    }
}