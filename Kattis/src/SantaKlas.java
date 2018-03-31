import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SantaKlas {

    public static void main(String[] args) throws IOException {
        
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] line = r.readLine().split(" ");
        int H = Integer.parseInt(line[0]);
        int v = Integer.parseInt(line[1]);
        if (v <= 180) {
            w.write("safe");
        } else {
            double tempV = (double) v - 180;
            double tempH = tempV * Math.PI / 180;
            int s = (int) (H / Math.sin(tempH));
            w.write(String.valueOf(s));
        }
        w.flush();
        w.close();
        r.close();
    }

}
