import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("1-April");
        System.out.println("2-March");
        System.out.println("3-August");
        int n;
        System.out.println("Enter the month");
        n= input.nextInt();
        if(n>0&&n<4) {

            if(n==1)
                System.out.println("30");
            else if(n==2)
                System.out.println("29");
            else if(n==3)
                System.out.println("30");

        }
        else System.out.println("Wrong number");
    }
}
