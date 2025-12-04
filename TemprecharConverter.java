import java.util.*;
class TemprecharConverter {
    double Celcius(int f) {
        double c =(f-32)*5/9;
        return c;
    }
    double ferenhit(int c){
        double f = (9*c)/5+ 32;
        return f;
    }
}
class Main {
    public static void main() {
        System.out.println("what would you liketo go with ");
        System.out.println("1.celius to feranhit");
        System.out.println("2.feranhit to celius");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice ");
        int n = sc.nextInt();
        Temprechar  tp= new Temprechar();
        if(n==1){
            System.out.println("Enter the Temptrcharin celius ");
            int c = sc.nextInt();
            System.out.println("your Temprechar is in ferrante is "+ tp. ferenhit(c));
        }else if(n==2){
            System.out.println("Enter the Temptrcharin Feranhit ");
            int f = sc.nextInt();
            System.out.println("your Temprechar is in feranhit is "+ tp.Celcius(f));
        }else
            System.out.println("Please Enter valied choice ");
    }
}

