package solved;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/**
 * https://open.kattis.com/problems/sellingspatulas
 * 
 * @author allwi
 *
 */
public class SellingSpatulas {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(r.readLine());
            if (n == 0) {
                break;
            }
            int[] minutes = new int[n];
            long[] money = new long[n];
            long totalProfit = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer s = new StringTokenizer(r.readLine());
                minutes[i] = Integer.parseInt(s.nextToken());
                money[i] = (int) Math.round(Double.parseDouble(s.nextToken()) * 100);
                totalProfit += money[i];
            }
            long totalCost = 8 * (minutes[n - 1] - minutes[0] + 1) - totalProfit;
            long[] savedByCuttingUntil1 = new long[n];
            for (int i = 1; i < n; i++) {
                savedByCuttingUntil1[i] = savedByCuttingUntil1[i - 1] + (minutes[i] - minutes[i - 1]) * 8
                        - money[i - 1];
            }
            long[] savedByCuttingUntil2 = new long[n];
            for (int i = n - 2; i >= 0; i--) {
                savedByCuttingUntil2[i] = savedByCuttingUntil2[i + 1] + (minutes[i + 1] - minutes[i]) * 8
                        - money[i + 1];
            }
            long[] bestSecondChoice = new long[n];
            int[] bestSecondChoiceJ = new int[n];
            bestSecondChoice[n - 1] = savedByCuttingUntil2[n - 1];
            bestSecondChoiceJ[n - 1] = n - 1;
            for (int i = n - 2; i >= 0; i--) {
                if (savedByCuttingUntil2[i] >= bestSecondChoice[i + 1]) {
                    bestSecondChoice[i] = savedByCuttingUntil2[i];
                    bestSecondChoiceJ[i] = i;
                } else {
                    bestSecondChoice[i] = bestSecondChoice[i + 1];
                    bestSecondChoiceJ[i] = bestSecondChoiceJ[i + 1];
                }
            }
            int bestI = 0;
            int bestJ = 0;
            int bestLength = Integer.MIN_VALUE;
            long bestValue = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                long value = savedByCuttingUntil1[i] + bestSecondChoice[i];
                int length = minutes[bestSecondChoiceJ[i]] - minutes[i] + 1;
                if (i == 0 || value > bestValue || (value == bestValue && length < bestLength)) {
                    bestI = i;
                    bestJ = bestSecondChoiceJ[i];
                    bestLength = length;
                    bestValue = value;
                }
            }
            long profit = bestValue - totalCost;
            if (profit <= 0) {
                w.write("no profit\n");
            } else {
                w.write(df.format(profit / 100d + 0.000000001) + " ");
                w.write(minutes[bestI] + " ");
                w.write(minutes[bestJ] + "\n");
            }
        }
        w.flush();
    }

    static DecimalFormat df = new DecimalFormat("0.00");

}
