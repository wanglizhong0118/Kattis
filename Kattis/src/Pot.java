import java.util.Scanner;

/**
 * https://open.kattis.com/problems/pot
 * 
 * @author allwi
 *
 */
public class Pot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = a % 10;
            int c = (a - b) / 10;
            sum += Math.pow(c, b);
        }

        System.out.println(sum);
        sc.close();
    }

}
