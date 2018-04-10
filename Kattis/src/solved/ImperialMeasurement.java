package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/measurement
 * 
 * @author allwi
 *
 */
public class ImperialMeasurement {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        map.put("thou", 1);
        map.put("th", 1);

        map.put("inch", 1000);
        map.put("in", 1000);

        map.put("foot", 12000);
        map.put("ft", 12000);

        map.put("yard", 36000);
        map.put("yd", 36000);

        map.put("chain", 792000);
        map.put("ch", 792000);

        map.put("furlong", 7920000);
        map.put("fur", 7920000);

        map.put("mile", 63360000);
        map.put("mi", 63360000);

        map.put("league", 190080000);
        map.put("lea", 190080000);

        String[] s = r.readLine().split(" ");

        double n = Double.parseDouble(s[0]);
        String sour = s[1];
        String dest = s[3];

        int sourIn = map.get(sour);
        int destOu = map.get(dest);

        double out = n * sourIn / destOu;

        w.write(String.valueOf(out));

        w.flush();
        w.close();
        r.close();

    }

}
