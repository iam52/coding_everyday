import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();

        char[] c = isbn.toCharArray();

        int idx = indexM(c);
        c[idx] = '0';
        List<Integer> intList = makeItInt(c);

        int sum = 0;
        for (int i = 0; i < intList.size(); i++) {
            if (i % 2 != 0) {
                intList.set(i, intList.get(i) * 3);
            }

            sum += intList.get(i);
        }

        for (int i = 0; i < 10; i++) {
            int missing = 0;

            if (idx % 2 != 0) {
                missing = i * 3;

                if ((sum + missing) % 10 == 0) {
                    System.out.println(i);
                    break;
                }
            } else {
                missing = i;

                if ((sum + missing) % 10 == 0) {
                    System.out.println(i);
                    break;
                }

            }
        }
    }

    private static int indexM ( char[] c){
        int index = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '*') {
                index = i;
            }
        }

        return index;
    }

    private static List<Integer> makeItInt ( char[] c){
        List<Integer> intArr = new ArrayList<>();

        for (char value : c) {
            intArr.add(Character.getNumericValue(value));
        }

        return intArr;
    }
}