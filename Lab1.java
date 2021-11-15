import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 4 числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int m = a;
        if (m > b) {
            m = b;
        } else if (m > c) {
            m = c;
        } else if (m > d) {
            m = d;
        }
        System.out.print("Наименьшее число: " + m);
        in.close();
    }
}
