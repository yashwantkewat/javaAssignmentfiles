package Learnloops;

public class primenumber
{
    public static void main(String[] args) {
        int num = 8;
        boolean check = true;
        for (int i = 2; i<num;i++) {
            if (num%i==0)
                System.out.println(num);
        }
    }
}
