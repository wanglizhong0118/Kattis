import java.io.IOException;

/**
 * 
 * @author allwi
 *
 */
public class EulerTotient {

    public static void main(String[] args) throws IOException {
        System.out.println(phi(9));
    }

    public static int phi(int n) {
        float result = n;
        for (int p = 2; p * p <= n; ++p) {
            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result *= (1.0 - (1.0 / (float) p));
            }
        }
        if (n > 1) {
            result *= (1.0 - (1.0 / (float) n));
        }
        return (int) result;
    }
}
