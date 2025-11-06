/**
 Ad Soyad: Mustafa haccar
Ogrenci No: 250541623
 Tarih: 06.11.2025
 Aciklama: Ogrenci Bilgileri
 */
import java.util.Scanner;
class OgrenciBilgileri{
static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("==Ogrenci Bilgileri==");

    System.out.print("ad:");
    String ad = input.nextLine();

    System.out.print("soyad:");
    String soyad = input.nextLine();

    System.out.print("no:");
    int no = input.nextInt();

    System.out.print("yas :");
    int yas = input.nextInt();

    System.out.print("gpa(0.00-4.00):");
    double gpa = input.nextDouble();
    String durum = (gpa >= 2.00) ? "Basarili" : "Basarisiz";
    
    System.out.print("\n==Ögrenci Bilgileri==");

    System.out.printf("\nAd Soyad   : %s %s", ad, soyad);
    System.out.printf("\nNo        : %d", no);
    System.out.printf("\nYas      : %d", yas);
    System.out.printf("\nGPA      : %.2f", gpa);
    System.out.printf("\nDurum    : %s", durum);
    input.close();
    }
}
