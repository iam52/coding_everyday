import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong(); // n번째 단어
            System.out.println(findNthPhrase(n));
        }
        scanner.close();
    }

    public static String findNthPhrase(long n) {
        long position = 0;
        long number = 1;

        // n번째 단어가 속한 숫자 그룹 찾기
        while (true) {
            // 현재 숫자 그룹의 단어 수: 3*number
            long groupSize = 3 * number;

            if (position + groupSize >= n) {
                // 이 그룹 안에 n번째 단어가 있음
                break;
            }

            position += groupSize;
            number++;
        }

        // 그룹 내에서의 위치 계산
        long positionInGroup = n - position;

        // 단어 종류 결정 (dolphins, jumps, splash)
        long type = (positionInGroup - 1) / number;

        if (type == 0) {
            // dolphins
            if (number == 1) {
                return number + " dolphin";
            } else {
                return number + " dolphins";
            }
        } else if (type == 1) {
            // jumps
            if (number == 1) {
                return number + " jump";
            } else {
                return number + " jumps";
            }
        } else {
            // splash
            return "splash";
        }
    }
}