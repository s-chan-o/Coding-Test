import java.util.Scanner;

public class java_2753 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();

        if(i % 4 == 0 && i % 100 != 0) {
            System.out.println(1);
        }else if(i % 400 == 0){
            System.out.println(1);
        }else
            System.out.println(0);
    }
}
