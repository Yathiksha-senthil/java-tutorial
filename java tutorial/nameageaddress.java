import java.util.Scanner;
class nameageaddress{
    public static void main(String args[])
    {
        Scanner janu =new Scanner(System.in);
        String Name = janu.nextLine();
        int Age = janu.nextInt();
        janu.nextLine();
        String Address = janu.nextLine();
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Address);
    }
}