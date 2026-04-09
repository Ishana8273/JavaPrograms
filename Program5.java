// Program 5: Filter prime numbers

import java.util.*;

class Program5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream()
                .filter(n -> {
                    if(n < 2) return false;
                    for(int i=2;i<=Math.sqrt(n);i++)
                        if(n%i==0) return false;
                    return true;
                })
                .forEach(System.out::println);
    }
}