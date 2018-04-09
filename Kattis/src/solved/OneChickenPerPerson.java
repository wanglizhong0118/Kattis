package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OneChickenPerPerson {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        int a = Integer.parseInt(sts[0]);
        int b = Integer.parseInt(sts[1]);
        int c = b - a;
        if (c < 0) {
            if (c == -1) {
                w.write("Dr. Chaz needs 1 more piece of chicken!");
            } else {
                w.write("Dr. Chaz needs " + String.valueOf(Math.abs(c)) + " more pieces of chicken!");
            }
        } else {
            if (c == 1) {
                w.write("Dr. Chaz will have 1 piece of chicken left over!");
            } else {
                w.write("Dr. Chaz will have " + String.valueOf(c) + " pieces of chicken left over!");
            }

        }

        w.flush();
        w.close();
        r.close();
    }
}
