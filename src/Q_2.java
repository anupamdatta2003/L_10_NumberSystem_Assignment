import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary_num = sc.nextInt();

        int ans = 0;
        int power = 1;

        while (binary_num > 0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * power);
            power *= 2;
            binary_num /= 10;
        }
        System.out.println(ans);
    }
}
