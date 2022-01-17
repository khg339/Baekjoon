package Recursive;

import java.util.Scanner;

public class no10870 {
    static int[] F = new int[20]; //피보나치 수열을 담을 배열

    static int fibonacci(int x){
        if(x<2) return x; //0또는 1일때
        else{
            return fibonacci(x-1)+fibonacci(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //0<=n<=20

        System.out.println(fibonacci(n));
    }
}
