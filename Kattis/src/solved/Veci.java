package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * https://open.kattis.com/problems/veci
 * 
 * @author allwi
 *
 */
public class Veci {

    private static List<Integer> ls = new ArrayList<>();
    private static int orgNr = 0;
    private static int temp = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String org = r.readLine();
        String[] sts = org.split("");
        int[] digits = Stream.of(sts).mapToInt(Integer::parseInt).toArray();

        orgNr = Integer.parseInt(org);

        permute(digits, 0, digits.length - 1);
        Collections.sort(ls);

        if (temp != Integer.MAX_VALUE) {
            w.write(String.valueOf(temp));
        } else {
            w.write("0");
        }
        w.flush();
        w.close();
        r.close();
    }

    static void permute(int[] digits, int start, int end) {
        if (start == end) {
            StringBuilder sb = new StringBuilder();
            for (int dig : digits) {
                sb.append(dig);
            }
            int current = Integer.parseInt(sb.toString());
            if (current > orgNr && current < temp) {
                temp = current;
                return;
            }
        } else {
            for (int i = start; i <= end; i++) {
                swap(digits, start, i);
                permute(digits, start + 1, end);
                swap(digits, start, i);
            }
        }
    }

    static void swap(int[] digits, int previous, int next) {
        int temp = digits[previous];
        digits[previous] = digits[next];
        digits[next] = temp;
    }

}
