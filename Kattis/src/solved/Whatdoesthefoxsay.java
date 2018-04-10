package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://open.kattis.com/problems/whatdoesthefoxsay
 * 
 * @author allwi
 *
 */
public class Whatdoesthefoxsay {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");
            List<String> records = new ArrayList<>();
            Collections.addAll(records, sts);

            while (true) {
                String line = r.readLine();
                if (line.equals("what does the fox say?")) {
                    break;
                }
                String[] sline = line.split(" ");
                String sound = sline[2];
                records = records.stream().filter(sou -> !sou.equals(sound)).collect(Collectors.toList());

            }
            StringBuilder sb = new StringBuilder();
            records.forEach(s -> sb.append(s + " "));
            w.write(sb.toString() + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }
}
