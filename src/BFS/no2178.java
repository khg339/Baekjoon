package BFS;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class no2178 {

    static class Location {
        int x;
        int y;

        Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[][] road = new int[N][M];
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                road[i][j] = str.charAt(j) - '0'; //길 입력
            }
        }

        Queue<Location> q = new LinkedList<>(); //지나갈 위치를 담을 큐
        q.add(new Location(0, 0));

        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        while (!q.isEmpty()) { //큐가 빌 때까지
            Location now = q.poll(); //큐에서 현재 위치 빼기

            for (int i = 0; i < 4; i++) {
                int x = now.x + dx[i];
                int y = now.y + dy[i];

                if (x >= 0 && x < N && y >= 0 && y < M) { //이동한 위치가 범위 내에 있으면
                    if (road[x][y] == 1) { //이동 가능하고, 이동하지 않은 길이라면
                        q.add(new Location(x, y)); //큐에 담기
                        road[x][y] = road[now.x][now.y] + 1; //이동 횟수 담기
                    }
                }
            }
        }

        System.out.println(road[N - 1][M - 1]);

    }
}
