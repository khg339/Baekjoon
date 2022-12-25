package Sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class no18870 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] num = new int[N];
        int[] sort_num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
            sort_num[i] = num[i];
        }
        Arrays.sort(sort_num);

        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i : sort_num){
            if(!map.containsKey(i)) {
                map.put(i, cnt);
                cnt++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i : num){
            sb.append(map.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
