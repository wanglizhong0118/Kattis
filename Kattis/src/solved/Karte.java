package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/karte
 * 
 * @author allwi
 *
 */
public class Karte {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String greska = "GRESKA";
        String re = "";
        String line = r.readLine();
        int arrlen = line.length() / 3;
        String[] res = new String[arrlen];

        int j = 0;
        int lastIndex = res.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            res[i] = line.substring(j, j + 3);
            j += 3;
        }
        res[lastIndex] = line.substring(j);

        List<String> plist = new ArrayList<>();
        List<String> klist = new ArrayList<>();
        List<String> hlist = new ArrayList<>();
        List<String> tlist = new ArrayList<>();

        for (String s : res) {
            char c = s.charAt(0);
            if (c == 'P') {
                if (plist.contains(s)) {
                    re = greska;
                } else {
                    plist.add(s);
                }
            } else if (c == 'K') {
                if (klist.contains(s)) {
                    re = greska;
                } else {
                    klist.add(s);
                }
            } else if (c == 'H') {
                if (hlist.contains(s)) {
                    re = greska;
                } else {
                    hlist.add(s);
                }
            } else {
                if (tlist.contains(s)) {
                    re = greska;
                } else {
                    tlist.add(s);
                }
            }
        }
        int pleft = 13 - plist.size();
        int kleft = 13 - klist.size();
        int hleft = 13 - hlist.size();
        int tleft = 13 - tlist.size();
        if (re.equals(greska)) {
            w.write(re);
        } else {
            re = pleft + " " + kleft + " " + hleft + " " + tleft;
            w.write(re);
        }

        w.flush();
        w.close();
        r.close();
    }

}
