package Recursive;

import java.util.Scanner;

public class no25501 {

    static int recursion(String s, int left, int right){
        if(left >= right) return 1;
        else if(s.charAt(left) != s.charAt(right)) return 0;
        else return recursion(s, left+1, right-1);
    }

    static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

    static int recursionCount(String s, int left, int right, int count){
        if(left >= right) return count;
        else if(s.charAt(left) != s.charAt(right)) return count;
        else return recursionCount(s, left+1, right-1, count+1);
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
            System.out.println(isPalindrome(S[i]) + " " + recursionCount(S[i], 0, S[i].length()-1, 1) );
        }

    }
}
