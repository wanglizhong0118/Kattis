import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/yoda
 * 
 * @author allwi
 *
 */
public class Yoda {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String tempFirst = r.readLine();
        String tempSecond = r.readLine();
        int diff = tempFirst.length() - tempSecond.length();
        if (diff < 0) {
            StringBuilder tempSB = new StringBuilder();
            for (int i = 0; i < Math.abs(diff); i++) {
                tempSB.append("0");
            }
            tempSB.append(tempFirst);
            tempFirst = tempSB.toString();
        }
        if (diff > 0) {
            StringBuilder tempSB = new StringBuilder();
            for (int i = 0; i < Math.abs(diff); i++) {
                tempSB.append("0");
            }
            tempSB.append(tempSecond);
            tempSecond = tempSB.toString();

        }
        StringBuilder firstSB = new StringBuilder(tempFirst);
        StringBuilder secondSB = new StringBuilder(tempSecond);

        StringBuilder resultFirst = new StringBuilder();
        StringBuilder resultSecond = new StringBuilder();

        for (int i = 0; i < firstSB.length(); i++) {
            int firstInt = Character.getNumericValue(firstSB.charAt(i));
            int secondInt = Character.getNumericValue(secondSB.charAt(i));
            if (firstInt > secondInt) {
                resultFirst.append(firstInt);
            }
            if (firstInt < secondInt) {
                resultSecond.append(secondInt);
            }
            if (firstInt == secondInt) {
                resultFirst.append(firstInt);
                resultSecond.append(secondInt);
            }
        }

        String f = resultFirst.toString();
        String s = resultSecond.toString();

        if (f.length() == 0) {
            f = "YODA";
        } else if (f.charAt(0) == '0') {
            f = "0";
        }

        if (s.length() == 0) {
            s = "YODA";
        } else if (s.charAt(0) == '0') {
            s = "0";
        }
        w.write(f + "\n");
        w.write(s);
        w.flush();
        w.close();
        r.close();
    }

}
