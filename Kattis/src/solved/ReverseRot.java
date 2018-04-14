package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/reverserot
 * 
 * @author allwi
 *
 */
public class ReverseRot {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        int len = alp.length();

        while (true) {
            String line = r.readLine();
            if (line.equals("0")) {
                break;
            }
            String[] sts = line.split(" ");
            int n = Integer.parseInt(sts[0]);
            String s = sts[1];

            for (int i = s.length() - 1; i >= 0; i--) {
                char ch = s.charAt(i);
                int pos = (alp.indexOf(ch) + n) % len;
                char chh = alp.charAt(pos);
                w.write(String.valueOf(chh));
            }
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}
