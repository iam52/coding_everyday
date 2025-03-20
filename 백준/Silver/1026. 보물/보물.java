import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        List<Integer> index = new ArrayList<>();
        
        boolean[] removed = new boolean[n];
        
        while (true) {
            int max = -1;
            int maxIndex = -1;
            
            for (int i = 0; i < n; i++) {
                if (!removed[i] && (maxIndex == -1 || b[i] > max)) {
                    max = b[i];
                    maxIndex = i;
                }
            }
            
            if (maxIndex == -1) break;
            
            index.add(maxIndex);
            removed[maxIndex] = true;
        }
        
        Arrays.sort(a);
        
        for (int i = 0; i < n; i++) {
            if (!removed[i]) {
                index.add(i);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[index.get(i)];
        }
        
        System.out.println(sum);
    }
}