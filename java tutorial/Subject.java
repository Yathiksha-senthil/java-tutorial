import java.util.Scanner;
public class Subject{
    public static void main (String args[]){
        Scanner scan=new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int s4 = scan.nextInt();
        int s5 = scan.nextInt();

        int totalmark = s1+s2+s3+s4+s5;
        int avg=totalmark/5;
        if(avg<35)
        {
            System.out.print("Coaching class");
        }
        else{
            System.out.print("Self Study");
        }
    }
}