import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * https://open.kattis.com/problems/hello
 * 
 * @author allwi
 *
 */
public class HelloWorld {

    public static void main(String[] args) throws IOException {
        
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        w.write("Hello World!");
        w.flush();
        w.close();
    }

}
