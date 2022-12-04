package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class no25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //N,k 입력
        int N = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine(); //엔터값 지우기

        //점수 입력
        String[] str = sc.nextLine().split(" ");
        Integer[] n = new Integer[N];
        for(int i=0; i<N; i++) n[i] = Integer.parseInt(str[i]);

        //내림차순 정렬
        Arrays.sort(n, Collections.reverseOrder());

        System.out.println(n[k-1]);
    }
}
