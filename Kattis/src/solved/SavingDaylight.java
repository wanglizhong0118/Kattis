package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;

/**
 * https://open.kattis.com/problems/savingdaylight
 * 
 * @author allwi
 *
 */
public class SavingDaylight {

    public static void main(String[] args) throws IOException, ParseException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = r.readLine();
        while (line != null) {

            String[] sts = line.split(" ");

            String[] shm = sts[3].split(":");
            String[] ehm = sts[4].split(":");

            int starthour = Integer.parseInt(shm[0]);
            int startmin = Integer.parseInt(shm[1]);

            int endhour = Integer.parseInt(ehm[0]);
            int endmin = Integer.parseInt(ehm[1]);

            int hours = endhour - starthour;
            int minutes = endmin - startmin;

            if (minutes < 0) {
                minutes += 60;
                hours--;
            }

            String re = sts[0] + " " + sts[1] + " " + sts[2] + " " + hours + " hours " + minutes + " minutes";
            w.write(re + "\n");
            w.flush();
            line = r.readLine();
        }
        w.close();
        r.close();
    }

}
