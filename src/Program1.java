import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,10,15,18,20);

        list.stream()
                .filter(n -> n % 3 == 0 && n % 5 != 0)
                .forEach(System.out::println);
    }
}