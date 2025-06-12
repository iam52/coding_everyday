import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long result = 0; // 4^k 누적값 (int 범위 초과 방지)
        long power = 1;  // 4의 거듭제곱 관리
        
        while (n > 0 && m > 0 && n % 2 == 1 && m % 2 == 1) {
            result += power; // 현재 단계 소 수 추가
            power *= 4;      // 다음 단계를 위해 4배
            n /= 2;          // 밭 크기 축소
            m /= 2;
        }
        
        System.out.println(result);
    }
}