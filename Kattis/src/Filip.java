import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/filip
 * 
 * @author allwi
 *
 */
public class Filip {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int A = Integer.parseInt(new StringBuilder(sts[0]).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(sts[1]).reverse().toString());

        if (A < B) {
            w.write(String.valueOf(B));
        } else {
            w.write(String.valueOf(A));
        }
        w.flush();
        w.close();
        r.close();
    }

}
