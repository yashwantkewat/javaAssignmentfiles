package LearnBasics;

public class Checkprimenumber
{
    public static void main(String[] args) {
        int num = 9;
        boolean checkprime = true;
        for (int i = 2; i <num; i++)
        {
            if (num%2==0)
              { 
                  checkprime = false;
              }
        }
        if (checkprime=true)
        {
            System.out.println("not prime");
        }
        else
        {
            System.out.println("prime");
        }
         // wap to count all prime number between 1 to 100
//        int  i,j,chk;
//     for (i=2;i<=100;i++)
//     {
//         chk = 0;
//         for (j=2;j<i;j++)
//         {
//             if (i%j==0)
//             {
//                 chk++;
//                 break;
//             }
//         }
//         if (chk==0)
//         {
//             System.out.println(i);
//         }
//     }

        
        int i,j,chk;
        for (i=2;i<=1000;i++)
        {
              chk=0;
            for (j=2;j<i;j++)
            {
                chk=0;
                if (i%j==0)
                {
                    chk++;
                    break;
                }
            }
            if (chk==0)
            {
                System.out.println(i);
            }
       }
       
    }
}
