import java.util.*;
class Airline
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean seat[]=new boolean[10];
        int a=1;

        while(a==1)
        {
            System.out.println("Please type 1 for FirstClass and type 2 for Economy");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    int i;
                    for(i=0;i<5;i++)
                    {
                        if(seat[i]==false)
                        {
                            seat[i]=true;
                            break;
                        }
                    }
                    if(i==5)
                    System.out.println("FirstClass is Full");
                    else
                    {
                        System.out.println("Type\t: FirstClass\nSeat\t: "+(i+1));
                    }
                    break;
                case 2:
                    for(i=5;i<10;i++)
                    {
                        if(seat[i]==false)
                        {
                            seat[i]=true;
                            break;
                        }
                    }
                    if(i==10)
                    System.out.println("FirstClass is Full");
                    else
                    {
                        System.out.println("Type\t: Economy\nSeat\t: "+(i+1));
                    }
                    break;
                default:
                    System.out.println("Invalid entry");
            }
            System.out.println("Enter 1 to continue");
            a=sc.nextInt();
        }
    }
}