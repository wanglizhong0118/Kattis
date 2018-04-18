package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * https://open.kattis.com/problems/fractionallotion
 * 
 * @author allwi
 *
 */
public class FractionalLotion {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        sieveOfEratosthenes();
        String line = r.readLine();
        while (line != null) {
            StringTokenizer s = new StringTokenizer(line);
            String str = s.nextToken();
            String deno = str.substring(2);
            int n = Integer.parseInt(deno);
            int divs = numberOfDivisors(n);
            int pairs = (divs + 1) / 2;

            w.write(String.valueOf(pairs) + "\n");
            w.flush();
            line = r.readLine();
        }
    }

    /**
     * 1/X+1/Y=1/N -> (X-N)(Y-N)=N^2. 
     * N = p1^i1 * p2^i2 * p3^i3...*pk^ik
     * divisors of N^2 = (2*i1+1)(2*i2+1)...(2*ik+1)
     * @param n
     * @return
     */
    public static int numberOfDivisors(int n) {
        int numberOfDivisor = 1;
        int currentMin = minPrime[n];
        int count = 1;
        while (n > 1) {
            n /= minPrime[n];
            if (currentMin == minPrime[n]) {
                count++;
                continue;
            }
            numberOfDivisor *= 2 * count + 1;
            currentMin = minPrime[n];
            count = 1;
        }
        return numberOfDivisor;
    }

    static int maxsize = 10001;
    static int[] minPrime = new int[maxsize];
    static boolean[] boolPrime = new boolean[maxsize];

    static void sieveOfEratosthenes() {
        for (int i = 2; i < maxsize; i += 2) {
            minPrime[i] = 2;
        }
        for (int i = 3; i < maxsize; i += 2) {
            if (boolPrime[i] == false) {
                minPrime[i] = i;
                for (int j = i; j * i < maxsize; j += 2) {
                    if (boolPrime[i * j] == false) {
                        boolPrime[i * j] = true;
                        minPrime[i * j] = i;
                    }
                }
            }
        }
    }

}
