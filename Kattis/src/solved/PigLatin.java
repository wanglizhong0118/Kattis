package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/piglatin
 * 
 * @author allwi
 *
 */
public class PigLatin {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        List<Character> vo = new ArrayList<>();
        vo.add('a');
        vo.add('e');
        vo.add('i');
        vo.add('o');
        vo.add('u');
        vo.add('y');

        while ((line = r.readLine()) != null) {
            String[] sts = line.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String s : sts) {
                char first = s.charAt(0);
                if (vo.contains(first)) {
                    sb.append(s).append("yay ");
                } else {
                    for (int i = 1; i < s.length(); i++) {
                        if (vo.contains(s.charAt(i))) {
                            sb.append(s.substring(i)).append(s.substring(0, i)).append("ay ");
                            break;
                        }
                    }
                }
            }
            sb.append("\n");
            w.write(sb.toString());
        }
        w.flush();
        w.close();
        r.close();
    }
}
