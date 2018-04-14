package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class HappyHappyPrimePrime {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            String line = r.readLine();
            String[] sts = line.split(" ");

            int m = Integer.parseInt(sts[1]);

            if (!isPrime(m)) {
                w.write(line + " NO\n");
            } else {
                if (!isHappy(m)) {
                    w.write(line + " NO\n");
                } else {
                    w.write(line + " YES\n");
                }
            }
        }
        w.flush();
        w.close();
        r.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n > 2 && n % 2 == 0) {
            return false;
        }
        int top = (int) Math.sqrt(n) + 1;
        for (int i = 3; i < top; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while (!set.contains(n)) {
            set.add(n);
            n = getSum(n);
            if (n == 1)
                return true;
        }
        return false;
    }

    public static int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

}
