import java.util.Scanner;

public class Swap {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int a=10;
        int b=20;
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);

        System.out.println("Enter four digit number");
        int number=sc.nextInt();
        int rev=0;
        while(number!=0){
            rev=rev*10 +number%10;
            number=number/10;
        }
        System.out.println("reverse number of given number is :"+ rev);

        StringBuffer str=new StringBuffer(String.valueOf(1234));
        str.reverse();
        System.out.println(str);






    }
}
