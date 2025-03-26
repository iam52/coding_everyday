import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] nums = IntStream
            .range(0, 5)
            .map(i -> sc.nextInt())
            .toArray();
        
        int sum = IntStream.of(nums).sum();
        
        Arrays.sort(nums);
        
        System.out.println(sum / 5);
        System.out.println(nums[2]);

    }
}