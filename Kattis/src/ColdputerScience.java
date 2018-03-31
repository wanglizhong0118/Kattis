import java.util.Scanner;

/**
 * https://open.kattis.com/problems/cold
 * 
 * @author allwi
 *
 */
public class ColdputerScience {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int s = 0;
        for (int i = 0; i < count; i++) {
            int temp = sc.nextInt();
            if (temp < 0) {
                s++;
            }
        }
        sc.close();
        System.out.println(s);
    }

}
