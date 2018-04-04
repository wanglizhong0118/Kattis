package solved;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/stararrangements
 * 
 * @author allwi
 *
 */
public class StarArrangements {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int stars = sc.nextInt();
        sc.close();
        System.out.println(stars + ":");

        for (int i = 2; i < Math.round((double) stars / 2) + 1; i++) {
            int j = i - 1;
            if (stars % (i + j) == i || stars % (i + j) == 0) {
                System.out.println(i + "," + j);
            }
            if (stars % i == 0) {
                System.out.println(i + "," + i);
            }
        }
    }

}
