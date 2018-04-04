package solved;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/planina
 * 
 * @author allwi
 *
 */
public class Planina {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p = (int) Math.pow(1 + Math.pow(2, t), 2);
        System.out.print(p);
        sc.close();
    }

}
