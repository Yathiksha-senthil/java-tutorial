public class Score{
public static void main(String args[]){
    int score=90;
    if(score<50)
    {
        System.out.print("You need to improve");
    }
    else if(score>=50 && score<=70)
    {
        System.out.print("Good job");
    }
    else {
        System.out.print("Excellent");
    }
}
}