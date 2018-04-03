import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/**
 * https://open.kattis.com/problems/aboveaverage
 * 
 * @author allwi
 *
 */
public class AboveAverage {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        DecimalFormat percentFormat = new DecimalFormat("0.000%");
        percentFormat.setDecimalSeparatorAlwaysShown(false);
        percentFormat.setMinimumFractionDigits(3);
        percentFormat.setMaximumFractionDigits(3);

        int n = Integer.parseInt(r.readLine());

        int i = 0;
        while (i++ < n) {
            String[] sts = r.readLine().split(" ");
            int m = Integer.parseInt(sts[0]);
            int sum = 0;
            for (int j = 1; j < m + 1; j++) {
                sum += Integer.parseInt(sts[j]);
            }
            double av = (double) sum / m;
            int count = 0;
            for (int j = 1; j < m + 1; j++) {
                if (Integer.parseInt(sts[j]) > av) {
                    count++;
                }
            }
            double per = (double) count / m;
            String c = percentFormat.format(per);
            w.write(String.valueOf(c) + "\n");
        }
        w.flush();
        w.close();
        r.close();

    }

}
