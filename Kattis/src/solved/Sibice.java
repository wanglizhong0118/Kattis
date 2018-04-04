package solved;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/sibice
 * 
 * @author allwi
 *
 */
public class Sibice {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        double M = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
        for (int i = 0; i < N; i++) {
            int L = sc.nextInt();
            if (L <= M) {
                w.write("DA\n");
            } else {
                w.write("NE\n");
            }
        }
        w.flush();
        w.close();
        sc.close();
    }

}
