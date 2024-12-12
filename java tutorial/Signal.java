import java.util.Scanner;
public class Signal{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    String color=scan.nextLine();
        if(color.equals("red"))
        {
            System.out.print("Stop");
        }
        if(color.equals("yellow")){
            System.out.print("Ready");
        }
        if(color.equals("green")){
            System.out.print("Go");
        }
    }
}