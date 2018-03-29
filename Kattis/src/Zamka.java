import java.util.Scanner;

/**
 * https://open.kattis.com/problems/zamka
 * 
 * @author allwi
 *
 */
public class Zamka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();

        for (int min = L; min <= D; min++) {
            String st = Integer.toString(min);
            char[] chars = st.toCharArray();
            int sum = 0;
            for (char c : chars) {
                sum += Integer.parseInt(Character.toString(c));
            }
            if (sum == X) {
                System.out.println(min);
                break;
            }
        }

        for (int max = D; max >= L; max--) {
            String st = Integer.toString(max);
            char[] chars = st.toCharArray();
            int sum = 0;
            for (char c : chars) {
                sum += Integer.parseInt(Character.toString(c));
            }
            if (sum == X) {
                System.out.println(max);
                break;
            }
        }
        sc.close();
    }

}
