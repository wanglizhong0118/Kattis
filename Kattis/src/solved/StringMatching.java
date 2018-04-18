package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/stringmatching
 * 
 * @author allwi
 *
 */
public class StringMatching {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String pattern = r.readLine();
        while (pattern != null) {
            String text = r.readLine();
            String st = KMPSearch(pattern, text);
            w.write(st);
            w.flush();
            pattern = r.readLine();
        }

    }

    static String KMPSearch(String pattern, String txt) {

        StringBuilder sb = new StringBuilder();
        int lps[] = computeLspTable(pattern);

        int j = 0;
        int i = 0;
        while (i < txt.length()) {
            if (pattern.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == pattern.length()) {
                sb.append((i - j) + " ");
                j = lps[j - 1];
            }
            if (i < txt.length() && pattern.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
        sb.append("\n");
        return sb.toString();
    }

    static int[] computeLspTable(String pattern) {
        int[] lsp = new int[pattern.length()];
        lsp[0] = 0;
        for (int i = 1; i < pattern.length(); i++) {
            int j = lsp[i - 1];
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = lsp[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            lsp[i] = j;
        }
        return lsp;
    }
}
