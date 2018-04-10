package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/securedoors
 * 
 * @author allwi
 *
 */
public class SecureDoors {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        List<String> inBuilding = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");
            String name = sts[1];
            String status = sts[0];

            if (status.equals("entry")) {
                if (!inBuilding.contains(name)) {
                    inBuilding.add(name);
                    w.write(name + " entered\n");
                } else {
                    w.write(name + " entered (ANOMALY)\n");
                }
            } else {
                if (inBuilding.contains(name)) {
                    inBuilding.remove(name);
                    w.write(name + " exited\n");
                } else {
                    w.write(name + " exited (ANOMALY)\n");
                }
            }

        }
        w.flush();
        w.close();
        r.close();
    }

}
