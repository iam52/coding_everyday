import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        String strBinary1 = toBinary(num1);
        String strBinary2 = toBinary(num2);
        String strBinary3 = toBinary(num3);

        String lsbBinary1 = toLsb(strBinary1);
        String lsbBinary2 = toLsb(strBinary2);
        String lsbBinary3 = toLsb(strBinary3);

        String attachedBinary = lsbBinary1 + lsbBinary2 + lsbBinary3;

        String decimalBinary = toDecimal(attachedBinary);

        System.out.println(decimalBinary);
    }
    
    public static String toBinary(int num) {
        if (num == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }
    
    public static String toLsb(String strBinary) {
        int place = 4;
        
        if (strBinary.length() > place) {
            return strBinary.substring(strBinary.length() - place);
        } else {
            int difference = Math.abs(place - strBinary.length());
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < difference; i++) {
                sb.append("0");
            }
            sb.append(strBinary);
            return sb.toString();
        }
    }
    
    public static String toDecimal(String binary) {
        int decimal = 0;
        
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            decimal += (binary.charAt(i) - '0') * Math.pow(2, binary.length() - 1 - i);
        }
        
        return String.format("%04d", decimal);
    }
}