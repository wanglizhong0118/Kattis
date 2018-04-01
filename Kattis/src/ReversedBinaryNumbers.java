import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/reversebinary
 * 
 * @author allwi
 *
 */
public class ReversedBinaryNumbers {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int in = Integer.parseInt(r.readLine());
        String binary = Integer.toBinaryString(in);
        String rbinary = new StringBuilder(binary).reverse().toString();
        int out = Integer.parseInt(rbinary, 2);

        w.write(String.valueOf(out));
        w.flush();
        w.close();
        r.close();

    }

}
