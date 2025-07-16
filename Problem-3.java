
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int limit = a % 2 == 0 ? a - 1 : a;

        for (int i = 1, count = 0; count < limit; i += 2, count++) {
            System.out.print(i);
            if (count < limit - 1) System.out.print(", ");
        }
    }
}
