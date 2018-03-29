import java.util.Scanner;

/**
 * https://open.kattis.com/problems/oddities
 * 
 * @author allwi
 *
 */
public class Oddities {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int temp = sc.nextInt();
            if (temp % 2 == 0) {
                System.out.println(temp + " is even");
            } else {
                System.out.println(temp + " is odd");
            }
        }
        sc.close();
    }

}
