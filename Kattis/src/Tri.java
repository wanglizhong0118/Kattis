import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/tri
 * 
 * @author allwi
 *
 */
public class Tri {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int a = Integer.parseInt(sts[0]);
        int b = Integer.parseInt(sts[1]);
        int c = Integer.parseInt(sts[2]);
        String st = "";
        if (a + b == c) {
            st = a + "+" + b + "=" + c;
        } else if (a - b == c) {
            st = a + "-" + b + "=" + c;
        } else if (a * b == c) {
            st = a + "*" + b + "=" + c;
        } else if (a / b == c) {
            st = a + "/" + b + "=" + c;
        } else if (a == b + c) {
            st = a + "=" + b + "+" + c;
        } else if (a == b - c) {
            st = a + "=" + b + "-" + c;
        } else if (a == b * c) {
            st = a + "=" + b + "*" + c;
        } else if (a == b / c) {
            st = a + "=" + b + "/" + c;
        }
        w.write(st);
        w.flush();
        w.close();
        r.close();
    }

}
