import java.util.Scanner;

/**
 * https://open.kattis.com/problems/bijele
 * 
 * @author allwi
 *
 */
public class Bijele {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] t = { 1, 1, 2, 2, 2, 8 };
        for (int i : t) {
            System.out.println(i - sc.nextInt() + " ");
        }
        sc.close();
    }

}
