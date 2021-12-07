import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        float time;
        float meter;
        float kilometer;
        double miles;

        System.out.println("Enter distance: ");
        float distance = sc.nextFloat();

        System.out.println("Enter hour:  ");
        float hour=sc.nextFloat();

        System.out.println("Enter minutes:  ");
        float minutes =sc.nextFloat();

        System.out.println("Enter second: ");
        float second = sc.nextFloat();

        time=(hour*3600)+(minutes*60)+second;
        meter=distance/time;
        kilometer=(distance/1000)/(time/3600);
        miles=kilometer/1.609;


        System.out.println("Speed in meter "+meter );
        System.out.println("Speed in kilometer "+kilometer);
        System.out.println("Speed in miles "+miles);



    }
}

