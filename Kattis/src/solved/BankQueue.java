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
 * https://open.kattis.com/problems/bank
 * 
 * @author allwi
 *
 */
public class BankQueue {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int N = Integer.parseInt(sts[0]);
        int T = Integer.parseInt(sts[1]);

        List<Integer>[] data = new ArrayList[T];

        for (int i = 0; i < T; i++) {
            data[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            String[] stsx = r.readLine().split(" ");
            int tempA = Integer.parseInt(stsx[0]);
            int tempB = Integer.parseInt(stsx[1]);
            data[tempB].add(tempA);
        }

        List<Integer> temp = new ArrayList<>(T);
        int max = 0;
        for (int i = T - 1; i >= 0; i--) {
            temp.addAll(data[i]);
            if (!temp.isEmpty()) {
                Collections.sort(temp);
                max += temp.remove(temp.size() - 1);
            }
        }
        w.write(String.valueOf(max));
        w.flush();
        w.close();
        r.close();
    }

}
