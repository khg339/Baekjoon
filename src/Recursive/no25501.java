package Recursive;

import java.util.Scanner;

public class no25501 {

    static void recursionCount(String s, int left, int right, int count){
        if(left >= right) {
            System.out.println(1 + " " + count);
        }
        else if(s.charAt(left) != s.charAt(right)) {
            System.out.println(0 + " " + count);
        }
        else recursionCount(s, left+1, right-1, count+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); //테스트케이스 개수(1<=T<=1000)
        String[] S = new String[T]; //문자열
        sc.nextLine();

        for(int i=0; i<T; i++){ //입력
            S[i] = sc.nextLine();
        }

        for(int i=0; i<T; i++){ //출력
            recursionCount(S[i], 0, S[i].length()-1, 1);
        }

    }
}
