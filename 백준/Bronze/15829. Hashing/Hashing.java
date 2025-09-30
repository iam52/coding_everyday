import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int l = Integer.parseInt(br.readLine());

        for (int i = 0; i < l; i++) {
            String str = br.readLine();
            sb.append(str);

            if (sb.length() == l) {
                break;
            }
        }

        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {


            char c = sb.charAt(i);

            int alphToInt = c - 96;

            if (l == 1) {
                sum += alphToInt;
            } else {
                sum += (int) (alphToInt * Math.pow(31, i));
            }
        }

        System.out.println(sum);
    }
}