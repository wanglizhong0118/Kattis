import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DiceBetting {

    public static void main(String[] args) throws IOException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sts = r.readLine().split(" ");

        int thrown = Integer.parseInt(sts[0]);
        int sides = Integer.parseInt(sts[1]);
        int dist = Integer.parseInt(sts[2]);

        int poss = (int) Math.pow(sides, thrown);

    }

    static int kcombination(int up, int down) {
        int upTemp = 1;
        for (int i = up - down + 1; i <= up; i++) {
            upTemp = upTemp * i;
        }
        int downTemp = factorial(down);
        return upTemp / downTemp;
    }

    public static int factorial(int number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

}
