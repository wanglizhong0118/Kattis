import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/ostgotska
 * 
 * @author allwi
 *
 */
public class Ostgotska {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        String[] sts = line.split(" ");
        int len = sts.length;
        int count = 0;
        for (String st : sts) {
            if (st.contains("ae")) {
                count++;
            }
        }
        double p = (double) count / len;
        if (p >= 0.4) {
            w.write("dae ae ju traeligt va");
        } else {
            w.write("haer talar vi rikssvenska");
        }
        w.flush();
        w.close();
        r.close();
    }

}
