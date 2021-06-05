import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int number=scanner.nextInt();
        int tempNumber=number,basValue,toplam=0;

        while(tempNumber!=0){
            tempNumber/=10;
        }

        tempNumber=number;

        while(tempNumber!=0){
            basValue=tempNumber%10;
            toplam+=basValue;
            tempNumber/=10;
        }

        System.out.println("Girilen sayının basamakları toplamı : "+toplam);
    }
}
