import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/fizzbuzz
 * 
 * @author allwi
 *
 */
public class FizzBuzz {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int X = Integer.parseInt(sts[0]);
        int Y = Integer.parseInt(sts[1]);
        int N = Integer.parseInt(sts[2]);

        for (int i = 1; i <= N; i++) {
            if (i % X == 0 && i % Y == 0) {
                w.write("FizzBuzz\n");
            } else if (i % Y == 0) {
                w.write("Buzz\n");
            } else if (i % X == 0) {
                w.write("Fizz\n");
            } else {
                w.write(String.valueOf(i) + "\n");
            }
        }
        r.close();
        w.flush();
        w.close();

    }

}
