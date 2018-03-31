import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * https://open.kattis.com/problems/datum
 * 
 * @author allwi
 *
 */
public class Datum {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");
        String d = sts[0] + "/" + sts[1] + "/2009";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate ld = LocalDate.parse(d, format);
        DayOfWeek dw = ld.getDayOfWeek();
        String s = dw.getDisplayName(TextStyle.FULL, Locale.US);
        w.write(s);
        w.flush();
        w.close();
        r.close();
    }

}
