package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001]; //10,000까지의 수이기 때문

        for(int i=0; i<N; i++) {
            cnt[Integer.parseInt(br.readLine())]++; //입력받은 값을 인덱스로 활용
        }

        for(int i=1; i<=10000; i++){
            for(int j=1; j<=cnt[i]; j++) sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}