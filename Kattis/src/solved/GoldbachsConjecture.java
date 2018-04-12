package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/goldbach2
 * 
 * @author allwi
 *
 */
public class GoldbachsConjecture {

    static boolean[] isPrime;
    static int[] primeArr;
    static int count;
    static int paircount = 0;

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(r.readLine());
        buildPrimes(32000);

        for (int i = 0; i < n; i++) {
            int cur = Integer.parseInt(r.readLine());
            paircount = 0;
            StringBuilder sb = new StringBuilder();
            int left = 0, right = count - 1;
            while (left <= right) {
                if (primeArr[left] + primeArr[right] == cur) {
                    sb.append(primeArr[left] + "+" + primeArr[right] + "\n");
                    paircount++;
                    left++;
                    right--;
                } else if (primeArr[left] + primeArr[right] < cur) {
                    left++;
                } else {
                    right--;
                }

            }
            String s = cur + " has " + paircount + " representation(s)\n";
            w.write(s);
            w.write(sb.toString() + "\n");
        }

        w.flush();
        w.close();
        r.close();
    }

    // using Sieve of Eratosthenes
    private static void buildPrimes(int n) {

        isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int factor = 2; factor * factor < n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor * j < n; j++)
                    isPrime[factor * j] = false;
            }
        }

        int primes = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                primes++;
            }
        }

        primeArr = new int[primes];
        count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime[i]) {
                primeArr[count++] = i;
            }
        }
    }
}
