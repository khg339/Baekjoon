package BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class no7576 {

    static class Tomato {
        int x;
        int y;

        Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int day = 0; //지난 날
        int check = 0; //처음 토마토가 모두 익었는지 체크
        Queue<Tomato> q = new LinkedList<>();

        int[][] box = new int[N][M]; //토마토가 담긴 통(익음여부)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                box[i][j] = sc.nextInt(); //각 자리의 토마토 익음 여부
                if (box[i][j] == 1) q.add(new Tomato(i, j)); //토마토가 익었으면 큐에 추가
                if (box[i][j] == 0) check ++;
            }
        }

        while (!q.isEmpty()) { //큐가 빌 때까지
            Tomato tomato = q.poll(); //큐에서 하나 꺼냄

            int[] dx = {1, 0, 0, -1}; //상하좌우
            int[] dy = {0, 1, -1, 0};

            for (int i = 0; i < 4; i++) { //상하좌우(4번)
                int x = tomato.x + dx[i];
                int y = tomato.y + dy[i];

                if (x >= 0 && x < N && y >= 0 && y < M) { //범위 안에있고
                    if (box[x][y] == 0) { //0이면(안익었으면)
                        q.add(new Tomato(x, y)); //큐에 더함
                        box[x][y] = box[tomato.x][tomato.y] + 1; //이전 수보다 +1
                        if (box[x][y] > day) day = box[x][y]; //day 업데이트
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) { //모든 토마토가 안익었으면
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) day = 0; //day = -1
            }
        }

        if(check == 0) day = 1;

        System.out.println(day - 1); //익은 토마토 값으로 1부터 시작했기 때문에 1을 빼줌

    }
}