import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] pieces = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < pieces.length; i++) {
            pieces[i] = scanner.nextInt();
        }

        int[] fullPieces = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] == fullPieces[i]) {
                pieces[i] = 0;
            } else if (pieces[i] > fullPieces[i]) {
                pieces[i] = -(pieces[i] - fullPieces[i]);
            } else if (pieces[i] < fullPieces[i]) {
                pieces[i] = fullPieces[i] - pieces[i];
            }
        }

        for (int piece : pieces) {
            System.out.print(piece + " ");
        }
    }
}