package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NastyHacks {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            int adv = Integer.parseInt(sts[0]);
            int temp = Integer.parseInt(sts[1]) - Integer.parseInt(sts[2]);
            if (adv == temp) {
                w.write("does not matter\n");
            } else if (adv < temp) {
                w.write("advertise\n");
            } else {
                w.write("do not advertise\n");
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
