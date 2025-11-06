/*Ad Soyad: Mustafa haccar
 * Ogrenci No: 250541623
 * Tarih: 06.11.2025
 * Aciklama: Geometrik Hesaplayici
 */
import java.util.Scanner;
 public class GeometrikHesaplayici {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("==Geometrik Hesaplayici==");
    System.out.print("Dairenin yaricapini giriniz cm: ");
    double yaricap = input.nextDouble();
    float pi=3.14f;
    double alan = pi * Math.pow(yaricap,2);
    double cevre = 2 * pi* yaricap;
    double cap=2*yaricap;
    double kureHacmi=(4/3.0)*pi*Math.pow(yaricap,3);
    double kureyuzeyAlani=4*pi*Math.pow(yaricap,2);

    System.out.printf("Kurenin Yüzey Alani: %.2f cm²\n", kureyuzeyAlani);
    System.out.printf("Kurenin Hacmi: %.2f cm³\n", kureHacmi);
    System.out.printf("Dairenin Capi: %.2f cm\n", cap);
    System.out.printf("Dairenin Alani: %.2f cm²\n", alan);
    System.out.printf("Dairenin Cevresi: %.2f cm\n", cevre);
    input.close();
  }
}
