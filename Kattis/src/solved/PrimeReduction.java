package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * https://open.kattis.com/problems/primereduction
 * 
 * @author allwi
 *
 */
public class PrimeReduction {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int num = Integer.parseInt(r.readLine());
            if (num == 4) {
                break;
            }
            int count = 1;
            while (!isPrimeNumber(num)) {
                List<Integer> temp = primeFactors(num);
                num = 0;
                for (int i : temp) {
                    num += i;
                }
                count++;
            }
            w.write(num + " " + count + "\n");
        }
        w.flush();
    }

    public static List<Integer> primeFactors(int num) {
        int n = num;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    private static boolean isPrimeNumber(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
