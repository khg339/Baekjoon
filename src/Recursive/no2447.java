package Recursive;

import java.util.Scanner;

public class no2447 {

    static void star(int n){
        if(n==1) System.out.print("*");

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                star(n/3);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //3의 거듭 제곱

        star(N);
    }
}
