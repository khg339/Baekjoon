package Recursive;

import java.io.*;

public class no2447 {

    static void star(char[][] arr, int startX, int startY, int N){
        if(N==1){  //기본 별찍기
            arr[startX][startY] = '*';
            return; //재귀 탈출
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(!(i==1 && j==1)){ //i, j가 모두 1인 경우(가운데) 빼고
                    star(arr, startX + i*(N/3), startY + j*(N/3), N/3);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine()); //3의 거듭 제곱
        char[][] arr = new char[N][N];

        for(int i=0; i<N; i++){ //배열 초기화
            for(int j=0; j<N; j++){
                arr[i][j] = ' ';
            }
        }

        star(arr, 0, 0, N); //별찍기

        // 출력
        for(int i=0; i<N; i++) {
            bw.write(arr[i]);
            bw.write('\n');
        }

        bw.flush();
        bw.close();
    }
}
