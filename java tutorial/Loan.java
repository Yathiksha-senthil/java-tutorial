import java.util.Scanner;
public class Loan {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int age = scan.nextInt();
        if(salary>=20000 || age<=25)
        {
            System.out.print("required loan amount");
            int loan = scan.nextInt();
        if(loan<=50000)
        {
            System.out.print("eligible");
        }
        else
        {
            System.out.print("maximum loan amount");
        }
        }

    }
}