package solved;
import java.util.Scanner;

/**
 * https://open.kattis.com/problems/pet
 * 
 * @author allwi
 *
 */
public class Pet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int tempNum = 0;

        int result;
        int tempResult = 0;

        while (sc.hasNext()) {
            for (int i = 0; i < 5; i++) {
                result = 0;
                for (int j = 0; j < 4; j++) {
                    num = sc.nextInt();
                    result = result + num;
                }
                if (result > tempResult) {
                    tempNum = i;
                    tempResult = result;
                }
            }
            System.out.println(tempNum + 1 + " " + tempResult);
        }
        sc.close();
    }

}
