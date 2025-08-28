import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
        }

        Arrays.sort(nums);

        for (int num : nums) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}