package Sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] N = sc.nextLine().split("");

        Arrays.sort(N, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        for(String i : N) System.out.print(i);
    }
}
