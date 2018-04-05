package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * https://open.kattis.com/problems/backspace
 * 
 * @author allwi
 *
 */
public class Backspace {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final String s = r.readLine();
        final char[] chl = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < chl.length; i++) {
            char c = chl[i];
            if (c == '<') {
                st.pop();
            } else {
                st.push(c);
            }
        }

        for (int i = 0; i < st.size(); i++) {
            w.write(String.valueOf(st.elementAt(i)));
        }
        w.flush();
        w.close();
        r.close();
    }
}
