import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/autori
 * 
 * @author allwi
 *
 */
public class Autori {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] strs = r.readLine().split("-");
        for (String st : strs) {
            w.write(st.charAt(0));
        }
        w.flush();
        w.close();
    }
}
