import java.util.Scanner;

public class java_4101 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 1000; i++ ){

            int a = scanner.nextInt();
            int j = scanner.nextInt();
            if (a == 0 && j == 0)
                break;
            if(a > j){
                System.out.println("Yes");
            }else if(a <= j){
                System.out.println("No");
            }
        }
    }
}
