import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ADifferentProblem {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = r.readLine()) != null) {
            String[] sts = line.split(" ");
            long A = Long.parseLong(sts[0]);
            long B = Long.parseLong(sts[1]);
            long diff = Math.abs(A - B);
            w.write(String.valueOf(diff) + "\n");
            w.flush();
        }
        w.close();
        r.close();
    }

}
