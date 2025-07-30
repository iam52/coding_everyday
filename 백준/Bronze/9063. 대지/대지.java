import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] xPoints = new int[n];
        int[] yPoints = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            xPoints[i] = x;
            yPoints[i] = y;
        }

        Arrays.sort(xPoints);
        Arrays.sort(yPoints);

        int bottom = xPoints[xPoints.length - 1] - xPoints[0];
        int side = yPoints[yPoints.length - 1] - yPoints[0];

        System.out.println(bottom * side);
    }
}