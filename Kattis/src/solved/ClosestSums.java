package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://open.kattis.com/problems/closestsums
 * 
 * @author allwi
 *
 */
public class ClosestSums {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> elements = new ArrayList<>();
        String line;
        int caseNr = 0;
        while ((line = r.readLine()) != null) {
            caseNr++;
            w.write("Case " + String.valueOf(caseNr) + ": \n");
            elements.clear();
            int n = Integer.parseInt(line);
            for (int i = 0; i < n; i++) {
                elements.add(Integer.parseInt(r.readLine()));
            }
            Collections.sort(elements);
            int m = Integer.parseInt(r.readLine());
            for (int i = 0; i < m; i++) {
                int target = Integer.parseInt(r.readLine());
                int closestSum = getClosetSum(elements, target);
                String re = "Closest sum to " + target + " is " + closestSum + ".\n";
                w.write(re);
                w.flush();
            }
        }

        w.close();
        r.close();
    }

    private static int getClosetSum(List<Integer> elements, int target) {
        if (target < elements.get(0)) {
            return elements.get(0) + elements.get(1);
        }
        int resum = -1;
        int leftPoint = 0;
        int rightPoint = elements.size() - 1;
        int minDiff = Integer.MAX_VALUE;
        while (leftPoint < rightPoint) {
            int cursum = elements.get(leftPoint) + elements.get(rightPoint);
            int diff = Math.abs(cursum - target);
            if (diff == 0) {
                return cursum;
            }
            if (diff < minDiff) {
                minDiff = diff;
                resum = cursum;
            }
            if (cursum > target) {
                rightPoint--;
            } else {
                leftPoint++;
            }
        }
        return resum;
    }

}