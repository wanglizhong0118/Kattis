import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

/**
 * https://open.kattis.com/problems/cd
 * 
 * @author allwi
 *
 */
public class CD {

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String[] sts = r.readLine().split(" ");
            if (sts.length == 2 && Integer.parseInt(sts[0]) == 0 && Integer.parseInt(sts[1]) == 0) {
                break;
            }
            int N = Integer.parseInt(sts[0]);
            int M = Integer.parseInt(sts[1]);

            HashSet<String> st = new HashSet<>();

            for (int i = 0; i < N; i++) {
                st.add(r.readLine());
            }

            for (int i = 0; i < M; i++) {
                st.add(r.readLine());
            }

            int len = st.size();
            int common = N + M - len;
            w.write(String.valueOf(common) + "\n");
        }
        w.flush();
        w.close();
        r.close();
    }

}
