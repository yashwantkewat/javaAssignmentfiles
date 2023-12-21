package Learnloops;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;

//        1) Number of digits
        int t1 = num;
        int digit = 0;//3
        while(t1>0)//0
        {
            digit++;
            t1/=10;
        }

    //    multiply and add
        int t2 = num;
        int sum = 0;//153
        while(t2>0)//0
        {
            int rem = t2%10;//1
            int multi = 1;//1
            for(int i=1;i<=digit;i++)
            {
//                    = 1*1
                multi = multi*rem;
            }
            sum = sum+multi;
            t2/=10;
        }

//        Compare original num to sum
        if(num==sum)
        {
            System.out.println("Is Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
//
//        int  num = 153;
//       int  t1 = num;
//       int digit = 0;
//        while(t1>0)
//        {
//            digit++;
//         t1/=10;
//        }
//         int t2 = num;
//        int sum = 0;
//        while(t2>0)
//        {
//            int rem = t2%10;
//            int multi = 1;
//            for (int i=1;i<=digit;i++)
//            {
//                multi = multi*rem;
//            }
//            sum=sum+multi;
//            t2/=10;
//        }
//          if (num==sum)
//        {
//            System.out.println("is armstrong ");
//        }
//      else
//       {
//           System.out.println("is not armstrong ");
//       }


//      int num = 153;
//      int t1 = num;
//      int digit = 0;
//      while (t1>0)
//      {
//          digit++;
//          t1/=10;
//      }
//      int t2 = num;
//      int sum = 0;
//      while (t2>10)
//      {
//         int rem = t2%10;
//         int multi = 1;
//          for (int i = 1;i<num;i++)
//          {
//              multi=multi*rem;
//          }
//          sum = sum+multi;
//          t2/=10;
//
//      }
//      if (num==sum)
//      {
//          System.out.println("is armstrong number");
//      }
//      else {
//          System.out.println("is not armstrong number");
//      }
//        int number = 371, originalNumber, remainder, result = 0;
//
//        originalNumber = number;
//
//        while (originalNumber != 0)
//        {
//            remainder = originalNumber % 10;
//            result += Math.pow(remainder, 3);
//            originalNumber /= 10;
//        }
//
//        if(result == number)
//            System.out.println(number + " is an Armstrong number.");
//        else
//            System.out.println(number + " is not an Armstrong number.");

//        int number = 153,originalNumber,remainder,result=0;
//        originalNumber=number;
//        while (originalNumber != 0){
//            remainder = originalNumber%10;
//            result+= Math.pow(remainder,2);
//            originalNumber /=10;
//        }
//        if (result==number)
//            System.out.println( number + "is an armstrong number");
//        else
//            System.out.println( number +h "is not armstrong number");
//
//        int number = 371, originalNumber, remainder,result=0;
//        originalNumber=number;
//        while (originalNumber!=0)
//        {
//            remainder = originalNumber%10;
//            result+= Math.pow(remainder,2);
//            originalNumber/=10;
//        }
//        if (result==number)
//            System.out.println("is armstrong");
//        else
//            System.out.println("is not armstrong");


//     int num = 153;
//     int t1 = num;
//     int digit = 0;
//     while (t1>0)
//     {
//         digit++;
//         t1/=10;
//     }
//     // multiply and add
//     int t2 = num;
//     int sum = 0;
//      while (t2>0) {
//         int rem = t2 % 10;
//         int multi = 1;
//         for (int i = 1; i < num; i++) {
//             multi = multi * rem;
//         }
//         sum = sum + multi;
//         t2 /= 10;
//      }    if (num==sum) {
//              System.out.println("is armstrong");
//           }
//      else
//        {
//            System.out.println("is not armstrong");
//        }



    }
}
