package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * https://open.kattis.com/problems/natrij
 * 
 * @author allwi
 *
 */
public class Natrij {

    public static void main(String[] args) throws IOException, ParseException {

        final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Date date1 = dateFormat.parse(r.readLine());
        Date date2 = dateFormat.parse(r.readLine());

        String ttime = "";

        if (date2.after(date1)) {
            Instant start = Instant.ofEpochMilli(date1.getTime());
            Instant end = Instant.ofEpochMilli(date2.getTime());
            Duration timeBetween = Duration.between(start, end);
            long seconds = timeBetween.getSeconds();
            ttime = String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 60));

        } else if (date2.before(date1)) {
            Date temp1 = dateFormat.parse("24:00:00");
            Date temp2 = dateFormat.parse("00:00:00");

            Instant start1 = Instant.ofEpochMilli(date1.getTime());
            Instant end1 = Instant.ofEpochMilli(temp1.getTime());
            Duration interval1 = Duration.between(start1, end1);

            Instant start2 = Instant.ofEpochMilli(temp2.getTime());
            Instant end2 = Instant.ofEpochMilli(date2.getTime());
            Duration interval2 = Duration.between(start2, end2);
            Duration timeBetween = interval1.plus(interval2);
            long seconds = timeBetween.getSeconds();
            ttime = String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, (seconds % 60));
        } else {
            ttime = "24:00:00";
        }

        w.write(ttime);
        w.flush();
        w.close();
        r.close();
    }
}
