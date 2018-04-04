package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/battlesimulation
 * 
 * @author allwi
 *
 */
public class BattleSimulation {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        List<String> ls = new ArrayList<>();
        ls.add("RBL");
        ls.add("RLB");
        ls.add("BLR");
        ls.add("BRL");
        ls.add("LRB");
        ls.add("LBR");

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int len = line.length();

        while (i < len) {

            if ((i + 3) <= len) {
                String sub = line.substring(i, i + 3);
                if (ls.contains(sub)) {
                    sb.append("C");
                    i = i + 3;
                    continue;
                }

            }
            char c = line.charAt(i);
            if (c == 'R') {
                sb.append("S");
            } else if (c == 'B') {
                sb.append("K");
            } else {
                sb.append("H");
            }
            i++;
        }
        w.write(sb.toString());
        w.flush();
        w.close();
        r.close();
    }

}
