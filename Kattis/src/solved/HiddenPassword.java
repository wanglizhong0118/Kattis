package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/hidden
 * 
 * @author allwi
 *
 */
public class HiddenPassword {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        String pass = sts[0];
        String mess = sts[1];

        StringBuilder messSB = new StringBuilder(mess);
        StringBuilder tempSB = new StringBuilder();

        for (int i = 0; i < messSB.length(); i++) {
            String curr = String.valueOf(messSB.charAt(i));
            if (pass.contains(curr)) {
                tempSB.append(String.valueOf(curr));
            }
        }

        boolean isValid = true;
        int pos = -1;
        for (int i = 0; i < pass.length(); i++) {
            String curr = String.valueOf(pass.charAt(i));
            int currpos = tempSB.indexOf(curr);
            if (currpos < 0) {
                isValid = false;
                break;
            } else {
                if (currpos > pos) {
                    pos = currpos;
                    tempSB.setCharAt(currpos, '*');
                } else {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            w.write("PASS");
        } else {
            w.write("FAIL");
        }
        w.flush();
        w.close();
        r.close();
    }
}
