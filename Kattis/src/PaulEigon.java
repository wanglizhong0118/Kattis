import java.util.Scanner;

/**
 * https://open.kattis.com/problems/pauleigon
 * 
 * @author allwi
 *
 */
public class PaulEigon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int Q = sc.nextInt();
        sc.close();
        if (((P + Q) / N) % 2 == 0) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
    }

}
