import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number : ");
        int decimal_num = sc.nextInt();
        System.out.print("Enter binary number : ");
        int binary_num = sc.nextInt();

        int ans = 0;
        int power = 1;

        while(binary_num > 0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * power);
            power *= 2;
            binary_num /= 10;
        }
        int m = decimal_num * ans;
        System.out.println("Multiplication : " + m);
    }
}
