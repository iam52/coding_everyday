import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int case1 = w - x;
        int case2 = h - y;

        int[] answers = new int[4];
        answers[0] = x;
        answers[1] = y;
        answers[2] = case1;
        answers[3] = case2;

        int result = answers[0];
        for (int answer : answers) {
            if (result > answer) {
                result = answer;
            }
        }

        System.out.println(result);
    }
}
