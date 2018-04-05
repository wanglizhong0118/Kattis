package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/anewalphabet
 * 
 * @author allwi
 *
 */
public class ANewAlphabet {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, String> temp = new HashMap<Character, String>();

        temp.put('a', "@");
        temp.put('b', "8");
        temp.put('c', "(");
        temp.put('d', "|)");
        temp.put('e', "3");
        temp.put('f', "#");
        temp.put('g', "6");
        temp.put('h', "[-]");
        temp.put('i', "|");
        temp.put('j', "_|");
        temp.put('k', "|<");
        temp.put('l', "1");
        temp.put('m', "[]\\/[]");
        temp.put('n', "[]\\[]");
        temp.put('o', "0");
        temp.put('p', "|D");
        temp.put('q', "(,)");
        temp.put('r', "|Z");
        temp.put('s', "$");
        temp.put('t', "']['");
        temp.put('u', "|_|");
        temp.put('v', "\\/");
        temp.put('w', "\\/\\/");
        temp.put('x', "}{");
        temp.put('y', "`/");
        temp.put('z', "2");

        String st = r.readLine().toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : st.toCharArray()) {
            if (temp.containsKey(c)) {
                sb.append(temp.get(c));
            } else {
                sb.append(c);
            }
        }
        w.write(sb.toString());
        w.flush();
        w.close();
        r.close();

    }

}
