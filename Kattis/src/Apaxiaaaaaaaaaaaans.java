import java.io.IOException;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/apaxiaaans
 * 
 * @author allwi
 *
 */
public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        String longName = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(longName.charAt(0));

        for (int i = 1; i < longName.length(); i++) {
            if (longName.charAt(i - 1) == longName.charAt(i))
                continue;
            sb.append(longName.charAt(i));
        }
        System.out.println(sb);
        sc.close();
    }

}
