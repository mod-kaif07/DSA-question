import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        // Corrected loop condition: i < 10
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        sc.close();

        // Corrected loop condition: i < 10
        for (int i = 0; i < 10; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
