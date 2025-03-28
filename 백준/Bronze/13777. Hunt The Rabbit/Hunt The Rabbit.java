import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // 메인 루프: 토끼 위치를 계속 입력받고 탐색
            int rabbitLocation = scanner.nextInt();

            if (rabbitLocation == 0) {
                break;
            }

            int low = 1;
            int high = 50;
            StringBuilder output = new StringBuilder();

            while (low <= high) { // 이진 탐색 루프: 범위를 좁혀가며 토끼 찾기
                int mid = low + (high - low) / 2;
                output.append(mid).append(" ");

                if (mid == rabbitLocation) {
                    System.out.println(output.toString().trim());
                    break; // 토끼 찾았으면 이진 탐색 루프 종료
                } else if (mid < rabbitLocation) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        scanner.close();
    }
}