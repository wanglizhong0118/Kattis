package solved;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * https://open.kattis.com/problems/addingwords
 * 
 * @author allwi
 *
 */
public class AddingWords {

    public static void main(String[] args) throws IOException, ParseException {

        final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> variableValue = new HashMap<>();
        Map<Integer, String> valueVariable = new HashMap<>();

        String line = r.readLine();

        while (line != null) {

            String[] sts = line.split(" ");

            if (sts[0].equals("clear")) {
                variableValue.clear();
                valueVariable.clear();
            } else if (sts[0].equals("def")) {
                valueVariable.remove(variableValue.get(sts[1]));
                valueVariable.put(Integer.parseInt(sts[2]), sts[1]);
                variableValue.put(sts[1], Integer.parseInt(sts[2]));
            } else if (sts[0].equals("calc")) {
                boolean needToCalc = true;
                String op = "+";
                int result = 0;
                if (!variableValue.containsKey(sts[1])) {
                    needToCalc = false;
                } else {
                    result = variableValue.get(sts[1]);
                    for (int i = 2; i < sts.length - 1; i++) {
                        String cur = sts[i];
                        if (cur.equals("+") || cur.equals("-")) {
                            op = cur;
                            continue;
                        }
                        if (variableValue.containsKey(cur)) {
                            needToCalc = true;
                            if (op.equals("+")) {
                                result = result + variableValue.get(cur);
                            } else {
                                result = result - variableValue.get(cur);
                            }
                        } else {
                            needToCalc = false;
                            break;
                        }
                    }
                }
                if (needToCalc && valueVariable.containsKey(result)) {
                    w.write(line.substring(5) + " " + valueVariable.get(result) + "\n");
                } else {
                    w.write(line.substring(5) + " unknown\n");
                }
            }
            w.flush();
            line = r.readLine();
        }
        // w.flush();
        w.close();
        r.close();
    }
}