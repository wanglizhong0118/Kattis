package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/virus
 * 
 * @author allwi
 *
 */
public class VirusReplication {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        final String be = r.readLine();
        final String af = r.readLine();

        int sp = 0;
        int ep = 0;
        int re = -1;

        if (be.equals(af)) {
            re = 0;
        } else {
            if (be.length() == af.length()) {
                if (be.length() == 1) {
                    re = 0;
                } else {
                    for (int i = 0; i < be.length(); i++) {
                        if (be.charAt(i) != af.charAt(i)) {
                            sp = i;
                            break;
                        }
                    }
                    for (int i = be.length() - 1; i >= 0; i--) {
                        if (be.charAt(i) != af.charAt(i)) {
                            ep = i;
                            break;
                        }
                    }
                    re = ep - sp + 1;
                }
            } else if (be.length() < af.length()) {
                int afl = af.length() - 1;
                for (int i = 0; i < be.length(); i++) {
                    if (be.charAt(i) != af.charAt(i)) {
                        sp = i;
                        break;
                    }
                }
                for (int i = be.length() - 1; i >= 0; i--) {
                    if (be.charAt(i) != af.charAt(afl--)) {
                        ep = afl + 1;
                        break;
                    }
                }
                if (sp == 0 && ep == 0) {
                    re = af.length() - be.length();
                } else {
                    re = ep - sp + 1;
                }
            } else {
                int bel = be.length() - 1;
                for (int i = 0; i < af.length(); i++) {
                    if (af.charAt(i) != be.charAt(i)) {
                        sp = i;
                        break;
                    }
                }
                for (int i = af.length() - 1; i >= 0; i--) {
                    if (af.charAt(i) != be.charAt(bel--)) {
                        ep = i;
                        break;
                    }
                }
                if (sp == 0 && ep == 0) {
                    re = 0;
                } else if (ep < sp) {
                    re = 0;
                } else {
                    re = ep - sp + 1;
                }
            }
        }
        w.write(String.valueOf(re));
        w.flush();
        w.close();
        r.close();
    }
}
