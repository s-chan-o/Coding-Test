import java.math.BigInteger;
import java.util.Scanner;

public class java_10757 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        BigInteger bigInt1 = new BigInteger(a);
        BigInteger bigInt2 = new BigInteger(b);

        BigInteger sum = bigInt1.add(bigInt2);

        System.out.println(sum);

    }
}
