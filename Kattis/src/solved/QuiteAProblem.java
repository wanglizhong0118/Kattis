package solved;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://open.kattis.com/problems/quiteaproblem
 * 
 * @author allwi
 *
 */
public class QuiteAProblem {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter w = new PrintWriter(System.out);
        while (r.ready()) {
            String str = r.readLine().toLowerCase();
            if (str.contains("problem")) {
                w.println("yes");
            } else {
                w.println("no");
            }
        }
        r.close();
        w.close();
    }

}
