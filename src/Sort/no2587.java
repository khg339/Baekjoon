package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class no2587 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;

        for(int i=0; i<5; i++){
            num[i] = sc.nextInt();
            sum+=num[i];
        }

        Arrays.sort(num);  //오름차순 정렬

        //출력
        System.out.println(sum/5);
        System.out.println(num[2]);
    }
}