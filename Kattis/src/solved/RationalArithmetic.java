package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/rationalarithmetic
 * 
 * @author allwi
 *
 */
public class RationalArithmetic {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {

            String[] sts = r.readLine().split(" ");

            long x1 = Long.parseLong(sts[0]);
            long y1 = Long.parseLong(sts[1]);

            String op = sts[2];

            long x2 = Long.parseLong(sts[3]);
            long y2 = Long.parseLong(sts[4]);

            switch (op) {
            case "+":
                add(x1, y1, x2, y2, w);
                break;
            case "-":
                sub(x1, y1, x2, y2, w);
                break;
            case "*":
                mul(x1, y1, x2, y2, w);
                break;
            case "/":
                div(x1, y1, x2, y2, w);
                break;
            }
        }
        w.flush();
        w.close();
        r.close();

    }

    private static void div(long x1, long y1, long x2, long y2, BufferedWriter w) throws IOException {
        long up = x1 * y2;
        long down = y1 * x2;
        long gcd = getGCD(Math.abs(up), Math.abs(down));
        printResult(w, up, down, gcd);

    }

    private static void mul(long x1, long y1, long x2, long y2, BufferedWriter w) throws IOException {
        long up = x1 * x2;
        long down = y1 * y2;
        long gcd = getGCD(Math.abs(up), Math.abs(down));
        printResult(w, up, down, gcd);

    }

    private static void sub(long x1, long y1, long x2, long y2, BufferedWriter w) throws IOException {
        long up = x1 * y2 - x2 * y1;
        long down = y1 * y2;
        long gcd = getGCD(Math.abs(up), Math.abs(down));
        printResult(w, up, down, gcd);

    }

    private static void add(long x1, long y1, long x2, long y2, BufferedWriter w) throws IOException {
        long up = x1 * y2 + x2 * y1;
        long down = y1 * y2;
        long gcd = getGCD(Math.abs(up), Math.abs(down));
        printResult(w, up, down, gcd);
    }

    private static long getGCD(long a, long b) {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }

    private static void printResult(BufferedWriter w, long up, long down, long gcd) throws IOException {
        long upf = up / gcd;
        long downf = down / gcd;

        if (downf < 0) {
            upf *= -1;
            downf *= -1;
        }

        w.write(String.valueOf(upf) + " / " + String.valueOf(downf) + "\n");
    }
}
