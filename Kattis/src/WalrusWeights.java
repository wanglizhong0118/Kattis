import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/walrusweights
 * 
 * @author allwi
 *
 */
public class WalrusWeights {

    public static void main(String[] args) throws NumberFormatException, IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(r.readLine());
        int i = 0;
        List<Integer> ls = new ArrayList<>();
        while (i++ < n) {
            ls.add(Integer.parseInt(r.readLine()));
        }
    }

}
