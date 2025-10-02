import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        long M = 1234567891;
        int r = 31;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine()); // 길이
        String str = br.readLine(); // 한 줄 전체 입력

        long sum = 0;
        long pow = 1; // 31^0

        for (int i = 0; i < l; i++) {
            int alphToInt = str.charAt(i) - 'a' + 1; // 'a':1, ..., 'z':26
            sum = (sum + alphToInt * pow % M) % M;
            pow = (pow * r) % M;
        }
        System.out.println(sum);
    }
}
