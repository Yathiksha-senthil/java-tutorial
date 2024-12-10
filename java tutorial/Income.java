import java.util.Scanner;
public class Income{
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int Income =scan.nextInt();
        if(Income>7000)
        {
            System.out.print("available");
        }else{
            System.out.print("not eligible");
        }
            }

}