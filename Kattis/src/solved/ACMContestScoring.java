package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/acm
 * 
 * @author allwi
 *
 */
public class ACMContestScoring {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int solved = 0;
        int time = 0;
        List<String> wrong = new ArrayList<>();

        while (true) {
            String line = r.readLine();
            if (line.equals("-1")) {
                break;
            }
            String[] sts = line.split(" ");
            if (sts[2].equals("right")) {
                solved++;
                int penalty = 0;
                for (int i = 0; i < wrong.size(); i++) {
                    if (wrong.get(i).equals(sts[1])) {
                        penalty++;
                    }
                }
                time = time + 20 * penalty + Integer.parseInt(sts[0]);
            } else {
                wrong.add(sts[1]);
            }

        }
        if (solved == 0) {
            time = 0;
        }
        w.write(Integer.toString(solved) + " " + Integer.toString(time));
        w.flush();
        w.close();
        r.close();
    }
}
