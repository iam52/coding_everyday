import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String CWord = sc.nextLine();
        
        String[] originCWord = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String cAlphabet : originCWord) {
            CWord = CWord.replace(cAlphabet, "A");
        }
        System.out.println(CWord.length());
    }
}