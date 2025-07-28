import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (!listX.contains(x)) {
                listX.add(x);
            } else {
                listX.remove(listX.indexOf(x));
            }

            if (!listY.contains(y)) {
                listY.add(y);
            } else {
                listY.remove(listY.indexOf(y));
            }
        }

        System.out.println(listX.get(0) + " " + listY.get(0));
    }
}