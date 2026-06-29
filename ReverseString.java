import java.util.Scanner;
public class ReverseString {
    public static void main(String []args){
        //reverse a string
        //way 1 using string buffer and string bulder
        String str="pruthviraj";
        StringBuffer str1=new StringBuffer(str);
        str1.reverse();
        System.out.println(str1);

        String rev="";

        //way2 using for loop
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);


        }
        System.out.println(rev);

        //Cheack the given number is palindrome or not
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your number :");
        int num=sc.nextInt();
        int oriNum=num;
        int revnum=0;
        int count=0;

        while(num !=0){
            revnum=revnum*10 +(num%10);
            num=num/10;
            count++;

        }
        System.out.println(revnum);
        System.out.println("count is :"+ count);
        if(revnum==oriNum){

            System.out.println("number is palindrome number");
        }else{
            System.out.println("your number is not a palindrome number");
        }

        //find the totel even number or odd number in given number
        long num2=1234569879;
        int even=0;
        int odd=0;
        while(num2!=0){
            if(num2%2==0){
                even++;

            }else{
                odd++;
            }

            num2=num2/10;
        }

        System.out.println(even);
        System.out.println(odd);





    }
}
