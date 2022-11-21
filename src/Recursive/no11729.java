package Recursive;

import java.util.Scanner;
import java.lang.Math;

public class no11729 {

    static int hanoi(int n){
        if(n==1) return 1;
        else return hanoi(n-1) + (int)Math.pow(2,n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(hanoi(N));

    }
}
