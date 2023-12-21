package LearnBasics;

public class Wednesdayloopstask20
{
    public static void main(String[] args)
    {
//     1     wap to print 1 to 100
//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        }
//        while ( a<101);


//        int b = 1;
//        while (b<101)
//        {
//            System.out.println(b);
//            b++;
//         }

//        for (int a=1;a<101;a++)
//        {
//            System.out.println(a);
//        }

//    2.   wap to print to 1 to 10
//        int a = 1;
//        do {
//            System.out.println(a);a++;
//        }
//        while (a<11);
//
//        int b = 1;
//        while (b<11)
//        {
//            System.out.println(b); b++;
//        }

//        for (int c=1;c<11;c++)
//        {
//            System.out.println(c);
//        }

//    3.  wap to 10 to 1
//        int a = 10;
//          do {
//              System.out.println(a); a--;
//          }
//          while (a>0);
//
//          int b = 10;
//          while (b>0)
//          {
//              System.out.println(b); b--;
//          }
//
//          for (int c=10;c>0;c--)
//          {
//              System.out.println(c);
//          }

//     4.  wap to print 1 to 100 in even number
//           int num = 2;
//          do {
//              System.out.println(num);
//              num+=2;
//          }
//          while (num<=100);

//
//        int num = 2;
//        while (num<=100)
//        {
//            System.out.println(num);
//            num+=2;
//        }

//
//        for (int num=2;num<=100;num+=2)
//        {
//            System.out.println(num);
//        }

//    5. wap to print the odd number between 98 to 34
//        int num = 97;
//        do {
//            System.out.println(num);
//            num-=2;
//        }
//        while (num>34);

//        int num = 97;
//        while (num>34)
//        {
//            System.out.println(num);
//            num-=2;
//        }
//
//        for (int num =97;num>34;num-=2)
//        {
//            System.out.println(num);
//        }

//     6.  WAP to count the total number of even numbers between 23 to 67
//        int num = 24;
//        do {
//            System.out.println(num); num+=2;
//        }
//        while (num<67);
//
//        int num = 24;
//        while (num<67)
//        {
//            System.out.println(num); num+=2;
//        }

//        for (int num = 24;num<67;num+=2)
//        {
//            System.out.println(num);
//        }

//    7.  WAP to print the sum of all natural numbers upto 10
//        int sum = 0;
//        int num = 1;
//        do {
//            sum+=num;
//            System.out.println("sum of the natural number up to 10 is" +sum); num++;
//        }
//        while (num<=10);
//
//        int sum = 0;
//        int num = 1;
//        while (num<=10)
//        { sum+=num;
//            System.out.println("sum of the natural number upto 10 is " +sum); num++;
//        }
//
//        int sum = 0;
//        for (int num = 1;num<=10;num++)
//        {
//            sum+=num;
//            System.out.println("sum of the natural number upto 10 is" +sum);
//        }

//     8.  WAP to print the product of all even numbers between 1 to 10
//         int num = 1;
//         int product = 1;
//         do {
//             System.out.println(product);
//             num++;
//         }
//         while (num<=10);

//        int num = 1;
//        int product = 1;
//        while (num<=10)
//        {
//            System.out.println(product);
//            num++;
//        }

//        for (int num=1;num<10;num++)
//        { int product = 1;
//            System.out.println(product);
//        }

//     9.  WAP to check how many digits are there in 1634
//          int num = 1634;
//          do {int count = 0;
//
//              System.out.println(num);
//          }
//          while (t1>0);


//     10.  WAP to check if a number is a prime number
//            int num =23;
//            do {
//                if (num%2==0){
//                System.out.println("is prime number ");}
//                else {
//                    System.out.println("not prime number");
//                }
//                num++;
//            }
//            while (num%2==0);

//            int num = 23;
//            while (num%2==0)
//            {
//             num++;
//                  if (num%2==0)
//                  {
//                      (System.out.println("is prime number");
//                  }
//                  else {
//                      System.out.println("not prime number");
//                  }
//            }

//       10.  WAP to check if a number is an armstrong number
//        }
//        do
//            {
//                digit++; t1/=10;
//            }
//            while(t1>0);
//        int t2 = num;
//        int sum = 0;
//        while (t2>0)
//        {
//            int rem = t2%10;
//            int multi = 1;
//            for (int i = 1;i<=digit;i++)
//            {
//                multi = multi*rem;
//            }
//            sum = sum+multi;
//            t2/=10;
//        }
//        if (num==sum)
//        {
//            System.out.println("is armstrong number");
//        }
//        else
//        {
//            System.out.println("not armstrong number");
//        }
//

////    11.  WAP to print all the prime numbers between 1 to 100
//          int num = 1;
//          do {
//              System.out.println(num); num+=2;
//          }
//          while (num<100);
////
//        int num = 1;
//        while (num<100)
//        {
//            System.out.println(num); num+=2;
//        }
//
//        for (int num = 1;num<100;num+=2)
//        {
//            System.out.println(num);
//        }

//    12.  WAP to count all the armstrong numbers between 100 to 10000
//153

        int i = 100,a,b,c;
        while (i<=10000)
        {
            a=i%10;
            b=i%100;
            b=(b-a)/10;
            c=i/100;
            if ((a*a*a)+(b*b*b)+(c*c*c)==i)
                System.out.println(i); i++;
        }
//
//        int i = 1,a,b,c;
//        do {
//            a=i%10;
//            b=i%100;
//            b=(b-a)/10;
//            c=i/100;
//            if ((a*a*a)+(b*b*b)+(c*c*c)==i)
//                System.out.println(i); i++;
//        }
//        while (i<10000);


//        for (int i = 100,a,b,c;i<10000;i++)
//        {
//            a=i%10;
//            b=i%100;
//            b=(b-a)/10;
//            c=i/100;
//            if ((a*a*a)+(b*b*b)+(c*c*c)==i)
//                System.out.println(i);
//        }



    }
}
