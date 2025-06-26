import java.io.*;

public class Main {
    static int fibo_recursion_count;
    static int fibo_dynamic_count;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        fibo_recursion(n);
        fibo_dynamic(n);
        
        System.out.println(fibo_recursion_count + " " + fibo_dynamic_count);
    }
    
    static int fibo_recursion(int num) {
        if (num == 1 || num == 2) {
            fibo_recursion_count++;
            return 1;
        } else {
            return fibo_recursion(num - 1) + fibo_recursion(num - 2);
        }
    }
    
    static int fibo_dynamic(int num) {
        int[] fibo_array = new int[num + 1];
        fibo_array[1] = fibo_array[2] = 1;
        for (int i = 3; i <= num; i++) {
            fibo_dynamic_count++;
            fibo_array[i] = fibo_array[i - 1] + fibo_array[i - 2];
        }
        
        return fibo_array[num];
    }
}