import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int floor;
            int room;

            if (n % h == 0) {
                floor = h;
                room = n / h;
            } else {
                floor = n % h;
                room = (n / h) + 1;
            }

            int roomNumber = floor * 100 + room;

            System.out.println(roomNumber);
        }
    }
}