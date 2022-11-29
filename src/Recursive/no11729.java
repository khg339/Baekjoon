package Recursive;

import java.io.*;
import java.lang.Math;

public class no11729 {

    static int N;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        bw.write((int) Math.pow(2, N) - 1 + "\n"); //하노이탑 이동 횟수

        hanoi(N, 1, 2, 3); //이동 출력

        bw.flush();
        bw.close();
    }

    static void hanoi(int n, int start, int mid, int to) throws IOException {
        if (n == 1) { //1개라면
            bw.write(start + " " + to + "\n");
            return; //재귀 멈춤
        }

        hanoi(n - 1, start, to, mid); //n-1개를 목적지가 아닌 곳에 옮김

        bw.write(start + " " + to + "\n"); //n번째 원판을 목적지로 옮김

        hanoi(n - 1, mid, start, to); //n-1개를 다시 목적지로 옮김
    }
}
