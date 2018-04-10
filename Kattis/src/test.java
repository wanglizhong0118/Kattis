
public class test {

    public static void main(String[] args) {
        System.out.println(kcombination(52, 5));

    }

    static int kcombination(int up, int down) {

        int f = 1;
        for (int i = up - down + 1; i <= up; i++) {
            f = f * i;
        }
        down = factorial(down);

        System.out.println(f);
        System.out.println(down);

        return f / down;
    }

    public static int factorial(int number) {
        if (number <= 1)
            return 1;
        else
            return number * factorial(number - 1);
    }
}
