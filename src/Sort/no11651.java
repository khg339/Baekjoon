package Sort;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class no11651 {
    static class location{
        int x;
        int y;

        location(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        location[] l = new location[N];
        for(int i=0; i<N; i++){
            l[i] = new location(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(l, new Comparator<location>() {
            @Override
            public int compare(location o1, location o2) {
                if(o1.y == o2.y) return o1.x - o2.x;
                return o1.y - o2.y;
            }
        });

        for(int i=0; i<N; i++) System.out.println(l[i].x + " " + l[i].y);
    }
}

