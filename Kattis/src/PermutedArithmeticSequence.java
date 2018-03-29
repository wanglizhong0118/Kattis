import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://open.kattis.com/problems/permutedarithmeticsequence
 * 
 * @author allwi
 *
 */
public class PermutedArithmeticSequence {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());

        for (int i = 0; i < n; i++) {
            String[] sts = r.readLine().split(" ");
            int len = Integer.parseInt(sts[0]);

            List<Integer> ls = new ArrayList<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < sts.length; j++) {
                ls.add(Integer.parseInt(sts[j]));
                if (min > Integer.parseInt(sts[j])) {
                    min = Integer.parseInt(sts[j]);
                }
                if (max < Integer.parseInt(sts[j])) {
                    max = Integer.parseInt(sts[j]);
                }
            }

            if (min == max) {
                w.write("arithmetic\n");
            } else {
                boolean duplication = false;
                Set<Integer> tempSet = new HashSet<Integer>();
                for (int y : ls) {
                    if (!tempSet.add(y)) {
                        duplication = true;
                        break;
                    }
                }
                if (duplication) {
                    w.write("non-arithmetic\n");
                } else {
                    if ((max - min) % (len - 1) != 0) {
                        w.write("non-arithmetic\n");
                    } else {
                        List<Integer> lsMin = new ArrayList<Integer>(ls);
                        Collections.sort(lsMin);
                        List<Integer> lsMax = new ArrayList<Integer>(ls);
                        Collections.sort(lsMax);
                        Collections.reverse(lsMax);
                        if (ls.equals(lsMax) || ls.equals(lsMin)) {
                            w.write("arithmetic\n");
                        } else {
                            w.write("permuted arithmetic\n");
                        }
                    }
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }

}
