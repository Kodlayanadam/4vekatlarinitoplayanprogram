import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 4 == 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
