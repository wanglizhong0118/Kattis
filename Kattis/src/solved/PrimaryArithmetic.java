package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/primaryarithmetic
 * 
 * @author allwi
 *
 */
public class PrimaryArithmetic {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = r.readLine();
            if (line.equals("0 0")) {
                break;
            }
            String[] sts = line.split(" ");
            String a = sts[0];
            String b = sts[1];

            if (a.length() < b.length()) {
                for (int i = a.length(); i < b.length(); i++) {
                    a = "0" + a;
                }
            }

            if (b.length() < a.length()) {
                for (int d = b.length(); d < a.length(); d++) {
                    b = "0" + b;
                }
            }

            char[] chaA = a.toCharArray();
            char[] chaB = b.toCharArray();

            int carry = 0;
            int count = 0;

            for (int i = chaA.length - 1; i >= 0; i--) {
                // ASCII table; 0 ~ 9 = 48 ~ 57
                if ((chaA[i] + chaB[i]) + carry > 105) {
                    carry = 1;
                    count++;
                } else {
                    carry = 0;
                }
            }
            String carr = " carry operations.\n";
            if (count == 0) {
                w.write("No carry operation.\n");
            } else if (count == 1) {
                w.write("1 carry operation.\n");
            } else {
                w.write(String.valueOf(count) + carr);
            }
        }
        w.flush();
        w.close();
        r.close();

    }
}
