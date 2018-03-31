import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://open.kattis.com/problems/sevenwonders
 * 
 * @author allwi
 *
 */
public class SevenWonders {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String st = r.readLine();
        r.close();
        int sumT = 0;
        int sumC = 0;
        int sumG = 0;
        for (char c : st.toCharArray()) {
            if (c == 'T') {
                sumT++;
            }
            if (c == 'C') {
                sumC++;
            }
            if (c == 'G') {
                sumG++;
            }
        }
        List<Integer> li = new ArrayList<>();
        li.add(sumT);
        li.add(sumC);
        li.add(sumG);
        Collections.sort(li);
        int sum = li.get(0) * 7 + sumT * sumT + sumC * sumC + sumG * sumG;
        w.write(String.valueOf(sum));
        w.flush();
        w.close();
    }

}
