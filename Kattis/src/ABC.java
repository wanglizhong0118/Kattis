import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://open.kattis.com/problems/abc
 * 
 * @author allwi
 *
 */
public class ABC {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        List<Integer> ls = new ArrayList<>();
        for (String st : sts) {
            ls.add(Integer.parseInt(st));
        }
        Collections.sort(ls);
        int A = ls.get(0);
        int B = ls.get(1);
        int C = ls.get(2);

        String ord = r.readLine();
        char[] chord = ord.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chord.length; i++) {
            if (chord[i] == 'A') {
                sb.append(A).append(" ");
            }
            if (chord[i] == 'B') {
                sb.append(B).append(" ");
            }
            if (chord[i] == 'C') {
                sb.append(C).append(" ");
            }
        }
        w.write(sb.toString());
        w.flush();
        w.close();
        r.close();
    }

}
