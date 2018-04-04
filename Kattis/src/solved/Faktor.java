package solved;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/faktor
 * 
 * @author allwi
 *
 */
public class Faktor {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int s = a * (b - 1) + 1;
        System.out.println(s);
    }

}
