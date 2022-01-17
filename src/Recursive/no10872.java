package Recursive;

import java.util.Scanner;

public class no10872 {
    static int factorial(int n){ //팩토리얼 값 구하기
        if(n==0) return 1; //0!이면 1반환
        return n*factorial(n-1);//(자기 자신) X (이전 값들의 곱)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //정수 N입력

        System.out.println(factorial(N));
    }
}
