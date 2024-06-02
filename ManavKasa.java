import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo: ");
        toplam+=input.nextDouble()*armut;

        System.out.print("Elma Kaç Kilo: ");
        toplam+=input.nextDouble()*elma;

        System.out.print("Domates Kaç Kilo: ");
        toplam+=input.nextDouble()*domates;

        System.out.print("Muz Kaç Kilo: ");
        toplam+=input.nextDouble()*muz;

        System.out.print("Patlıcan Kaç Kilo: ");
        toplam+=input.nextDouble()*patlican;

        System.out.print("Ödenecek Tutar: "+toplam+" TL");
    }
}
