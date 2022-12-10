package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class no2751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<N; i++) list.add(sc.nextInt());

        Collections.sort(list);

        for(int value : list){
            sb.append(value).append('\n');
        }

        System.out.println(sb);
    }
}