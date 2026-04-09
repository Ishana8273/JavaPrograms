// Program 7: Filter valid emails

import java.util.*;

class Program7 {
    public static void main(String[] args) {
        List<String> emails = List.of("abc@gmail.com","test.com","user@site");

        emails.stream()
                .filter(e -> e.contains("@") && e.contains("."))
                .forEach(System.out::println);
    }
}