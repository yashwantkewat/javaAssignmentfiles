package LearnBasics;

public class Checkprimenumber
{
    public static void main(String[] args) {
        int num = 9;
        boolean checkprime = true;
        for (int i = 2; i <num; i++)
        {
         if (num%2==0)
             checkprime = false;
        }
        if (checkprime=true)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("prime");
        }
    }
}
