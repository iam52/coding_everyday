import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int t = Integer.parseInt(br.readLine());
            String iToS = String.valueOf(t);

            if (t == 0) break;

            String reverse = "";
            for (int i = iToS.length() - 1; i >= 0; i--) {
                reverse += iToS.charAt(i);

            }

            if (iToS.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}