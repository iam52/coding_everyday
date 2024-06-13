import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            
            if ('A' <= ch && ch <= 'Z') {
                System.out.print((char)('a' + ch - 'A'));
            } else{
                System.out.print((char)('A' + ch - 'a'));
            }
        }
    }
}