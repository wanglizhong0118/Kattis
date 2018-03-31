import java.util.Scanner;

/**
 * https://open.kattis.com/problems/spavanac
 * 
 * @author allwi
 *
 */
public class Spavanac {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (b >= 45) {
            System.out.println(a + " " + (b - 45));
        } else {
            int tempA = a - 1;
            if (tempA < 0) {
                tempA = 23;
            }
            System.out.println(tempA + " " + (b + 15));
        }

    }

}
