package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class no2108 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0; //합(반올림 해야하기 때문에 double 형)

        int N = sc.nextInt();
        int[] n = new int[N];
        int[] cnt = new int[8001]; //카운팅
        for(int i=0; i<N; i++){
            n[i] = sc.nextInt(); //입력
            cnt[n[i] + 4000]++; //해당 인덱스 값 카운트
            sum+=n[i]; //합
        }

        Arrays.sort(n); //오름차순 정렬

        System.out.println(Math.round(sum/N)); //평균
        System.out.println(n[N/2]); //중앙값
        System.out.println(getFre(cnt)); //최빈값
        System.out.println(getRange(n[0], n[N-1])); //범위
    }

    public static int getFre(int[] cnt){
        ArrayList<Integer> fre = new ArrayList<>(); //최빈값들
        int max_fre = 0; //최빈값의 빈도 수

        for(int i=-4000; i<=4000; i++){ //범위값 조사
            if(cnt[i+4000] > max_fre){ //현재 최빈값보다 빈도수가 크면
                max_fre = cnt[i+4000]; //최빈값 빈도수 변경
                fre.clear(); //최빈값 비우기
                fre.add(i); //최빈값 저장
            }
            else if(cnt[i+4000] == max_fre) fre.add(i);
        }
        if(fre.size()>1) return fre.get(1); //같은 빈도수가 1개 이상이면 두번째 값
        else return fre.get(0);
    }

    public static int getRange(int min, int max){
        if(min*max > 0) return max-min; //부호가 같으면 빼기
        else return Math.abs(max) + Math.abs(min); //부호가 다르면 더한 절댓값
    }
}
