import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x,y,n;
        System.out.println("Enter the number x");
        x= input.nextInt();

        System.out.println("Enter the number y");
        y= input.nextInt();

        System.out.println("Enter the number n");
        n= input.nextInt();



        if(x>y && y>n){
            System.out.println(1+x);
        System.out.println(1+y);
        System.out.println(1+n);}

        if(x<y && y<n){
            System.out.println(x-1);
            System.out.println(y-1);
            System.out.println(n-1);}

    }
}
