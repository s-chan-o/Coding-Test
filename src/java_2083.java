import java.util.Scanner;

public class java_2083 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String name = scanner.next();
            int age = scanner.nextInt();
            int height = scanner.nextInt();

            if (name.equals("#") && age == 0 && height == 0) {
                break;
            } else if (age > 17 || height >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
