import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/simon
 * 
 * @author allwi
 *
 */
public class SimonSays {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            if (sts.length > 1) {
                if (sts.length == 2 && sts[0].equals("simon") && sts[1].equals("says")) {
                    w.write(" \n");
                } else if (sts.length > 2 && sts[0].equals("simon") && sts[1].equals("says")) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 2; j < sts.length; j++) {
                        sb.append(sts[j] + " ");
                    }
                    w.write(sb.toString() + "\n");
                } else {
                    w.write(" \n");
                }
            }

        }
        w.flush();
        w.close();
        r.close();
    }

}
