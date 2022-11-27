package Recursive;

import java.util.Scanner;

public class no24060 {
    static int N; //A의 크기
    static int K;//저장 횟수
    static int[] A, tmp;
    static int count = 0;
    static int result = -1;

    static void merge_sort(int[] A, int p, int r){
        if (count > K) return ; //count가 K보다 크면 재귀 탈출
        if(p<r){
            int mid = (p+r)/2;
            merge_sort(A, p, mid); //전반부 정렬
            merge_sort(A, mid+1, r); //후반부 정렬
            merge(A, p, mid, r); //병합
        }
    }

    static void merge(int[] A, int p, int mid, int r){
        int i = p;
        int j = mid+1;
        int t = 0;

        while(i<= mid && j<=r){
            if(A[i]<=A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        while(i<=mid){ //배열 왼쪽 부분이 남은 경우
            tmp[t++] = A[i++];
        }

        while(j<=r){ //배열 오른쪽 부분이 남은 경우
            tmp[t++] = A[j++];
        }
        i = p; t = 0;

        while(i<=r){ //결과를 A[]에 저장
            count++;
            if(count == K) { //count가 K와 같으면 result에 저장 후 탈출
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        A = new int[N];
        tmp = new int[N];

        for(int i=0; i<N; i++){ //입력
            A[i] = sc.nextInt();
        }

        sc.close();

        merge_sort(A, 0, N-1); //병합정렬

        System.out.println(result);
    }
}
