package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/cokolada
 * 
 * @author allwi
 *
 */
public class Cokolada {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(r.readLine());
        int pow = (32 - Integer.numberOfLeadingZeros(K - 1));
        int time = pow - Integer.numberOfTrailingZeros(K);
        int bi = (int) Math.pow(2, pow);

        w.write(bi + " " + time);

        w.flush();
        w.close();
        r.close();
    }

}
