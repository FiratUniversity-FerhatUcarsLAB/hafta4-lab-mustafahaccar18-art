/*Adı Soyad:Mustafa haccar
Oğrenci NO:250541623
Tarih:06.11.2025
Açıklama:MAAŞ HESAP
*/

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1️⃣ Bilgi girişi
        System.out.print("Çalışanın Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaati = input.nextInt();

        // 2️⃣ Gelirler
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 3️⃣ Kesintiler
        double sgk = toplamGelir * 0.14;
        double gelirVergisi = toplamGelir * 0.15;
        double damgaVergisi = toplamGelir * 0.00759;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // 4️⃣ Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 5️⃣ İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176; // 22 gün x 8 saat
        double gunlukNetKazanc = netMaas / 22;

        // 6️⃣ Bordro çıktısı
        System.out.println("\n========== MAAŞ BORDROSU ==========");
        System.out.println("Ad Soyad: " + adSoyad);
        System.out.println("-----------------------------------");
        System.out.printf("Brüt Maaş: %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti: %.2f TL%n", mesaiUcreti);
        System.out.printf("Toplam Gelir: %.2f TL%n", toplamGelir);

        System.out.println("\n---------- KESİNTİLER ----------");
        System.out.printf("SGK (%%14): %.2f TL%n", sgk);
        System.out.printf("Gelir Vergisi (%%15): %.2f TL%n", gelirVergisi);
        System.out.printf("Damga Vergisi (%%0.759): %.2f TL%n", damgaVergisi);
        System.out.printf("Toplam Kesinti: %.2f TL%n", toplamKesinti);

        System.out.println("\n---------- NET MAAŞ ----------");
        System.out.printf("Net Maaş: %.2f TL%n", netMaas);

        System.out.println("\n---------- İSTATİSTİKLER ----------");
        System.out.printf("Kesinti Oranı: %.2f %% %n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç: %.2f TL %n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç: %.2f TL %n", gunlukNetKazanc);

        System.out.println("===================================");

        input.close();
    }
}
