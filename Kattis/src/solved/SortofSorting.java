package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/sortofsorting
 * 
 * @author allwi
 *
 */
public class SortofSorting {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n == 0) {
                break;
            }
            List<String> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ls.add(r.readLine());
            }

            ls.sort((str1, str2) -> {
                int result = 0;
                for (int i = 0; i < 2; i++) {
                    if (str1.charAt(i) > str2.charAt(i)) {
                        result = 1;
                        break;
                    } else if (str1.charAt(i) < str2.charAt(i)) {
                        result = -1;
                        break;
                    }
                }
                return result;
            });

            for (String s : ls) {
                w.write(s + "\n");
            }
            w.write("\n");
        }
        w.flush();
        w.close();
        r.close();

    }

}
