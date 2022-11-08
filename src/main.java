import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        if(BalancingBrackets.checkBalancedBrackets(str))
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }
}
