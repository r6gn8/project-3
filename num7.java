import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x,y,n;
        System.out.println("Enter the number x");
        x= input.nextInt();

        System.out.println("Enter the number y");
        y= input.nextInt();

        System.out.println("Enter the number n");
        n= input.nextInt();


        if(x<y && y<n)
            System.out.println("in order");
           else System.out.println("not in order");
    }
}
