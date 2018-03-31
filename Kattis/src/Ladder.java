import java.util.Scanner;

/**
 * https://open.kattis.com/problems/ladder
 * 
 * @author allwi
 *
 */
public class Ladder {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        sc.close();
        int s = (int) Math.ceil(h / Math.sin(Math.toRadians(v)));
        System.out.println(s);

    }

}
