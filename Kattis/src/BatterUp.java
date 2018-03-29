import java.util.Scanner;

/**
 * https://open.kattis.com/problems/batterup
 * 
 * @author allwi
 *
 */
public class BatterUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        int num = 0;
        for (int i = 0; i < count; i++) {
            int temp = sc.nextInt();
            if (temp >= 0) {
                sum += temp;
                num++;
            }
        }
        double ave = (double) sum / num;
        sc.close();
        System.out.println(ave);

    }

}
