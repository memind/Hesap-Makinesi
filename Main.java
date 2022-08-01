import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        int n1, n2, secim;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = inp.nextInt();

        System.out.println("Ne İşlem Yapılacak?\n1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        secim = inp.nextInt();

        switch(secim) {
            case 1:
                System.out.println("Sonuç: "+(n1+n2));
            break;

            case 2:
                System.out.println("Sonuç: "+(n1-n2));
            break;

            case 3:
                System.out.println("Sonuç: "+(n1*n2));
            break;

            case 4:
                if (n2 == 0){
                    System.out.println("Sayı/0 İşlemi Tanımsızdır");
                }
                else {
                System.out.println("Sonuç: "+(n1/n2));
            }
            break;

            default:
            System.out.println("Yanlış Girdi");
        }
    }
}