import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal double number : ");
        double n = sc.nextDouble();
        System.out.print("Enter the number of precision digits : ");
        int k = sc.nextInt();
        int decimal_num = (int)n;
        double fractional_num = n - decimal_num;

        int ans = 0;
        int power = 1;

        while (decimal_num > 0){
            int parity = decimal_num % 2;
            ans += (parity * power);
            power *= 10;
            decimal_num /= 2;
        }
        String s = Integer.toString(ans) + ".";
        while (k > 0 && fractional_num != 0){
            fractional_num *= 2;
            int digit = (int)fractional_num;
            s += digit;
            fractional_num = fractional_num - digit;
            k--;

        }
        System.out.println("Binary string : "+s);

    }
}
