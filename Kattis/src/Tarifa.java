import java.io.IOException;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/tarifa
 * 
 * @author allwi
 *
 */
public class Tarifa {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int mon = sc.nextInt();
        int left = 0;
        for (int i = 0; i < mon; i++) {
            int used = min - sc.nextInt();
            left += used;
        }
        System.out.print(left + min);
        sc.close();
    }

}
