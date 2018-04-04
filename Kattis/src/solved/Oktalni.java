package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

/**
 * https://open.kattis.com/problems/oktalni
 * 
 * @author allwi
 *
 */
public class Oktalni {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        String largeInteger = (new BigInteger(line, 2)).toString(8);


        w.write(largeInteger);
        w.flush();
        w.close();
        r.close();

    }

}
