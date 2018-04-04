package solved;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/trik
 * 
 * @author allwi
 *
 */
public class Trik {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        boolean[] pos = { true, false, false };

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == 'A') {
                boolean temp = pos[0];
                pos[0] = pos[1];
                pos[1] = temp;
            } else if (c == 'B') {
                boolean temp = pos[1];
                pos[1] = pos[2];
                pos[2] = temp;
            } else {
                boolean temp = pos[0];
                pos[0] = pos[2];
                pos[2] = temp;
            }

        }
        for (int i = 0; i < 3; i++) {
            if (pos[i]) {
                System.out.println(i + 1);
                break;
            }
        }
    }

}
