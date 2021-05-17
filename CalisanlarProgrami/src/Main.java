
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Çalışanlar Programı
    
        Çalışan Sınıfı Şeklinde Bir Üst Sınıf
    
        Çalisan Sınıfından Türeyen Yazılımcı adında Bir Alt Sınıf
        Çalışan Sınıfından Türeyen Yönetici adında Bir Alt Sınıf
        */
    
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        
        String islemler="İşlemler...\n"
                        +"1.Yazılımcı İşlemleri\n"
                        +"2.Yönetici İşlemleri\n"
                        +"Çıkış için q'ya basın";
        
        System.out.println("******************************");
        System.out.println(islemler);
        System.out.println("******************************");
        
        while (true) {            
            System.out.print("İşlemi Seçiniz : ");
            String islem=scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci=new Yazilimci("Fadıl","Başaran",12345, "Java,Python,C#,SQL");
                String yazilimci_islem="1.Format At\n"
                                       +"2. Bilgileri Göster"
                                       +"Çıkmak için q'ya basın...";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem=scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.err.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    
                    else if (y_islem.equals("1")) {
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi=scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    
                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }
                    
                    else{
                        System.err.println("Geçersiz Yazılımcı İşlemi...");
                    }
                }
            }
            else if (islem.equals("2")) {
                Yonetici yonetici=new Yonetici("Serhat", "Demir", 1234, 10);
                
                String yonetici_islemler="Yönetici İşlemler\n"
                                        +"1. Zam Yap\n"
                                        +"2. Bilgileri Göster\n"
                                        +"Çıkış için q'ya basın...";
                System.out.println(yonetici_islemler);
                
                while (true) {                    
                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem=scanner.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.err.println("Yönetici İşlemlerinden Çıkılıyor....");
                        break;
                    }
                    
                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari=scanner.nextInt();
                        scanner.nextLine();//Scanner hatasının önüne geçmek için kullanıyoruz
                        yonetici.zamYap(zamMiktari);
                    }
                    
                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else{
                        System.err.println("Geçersiz Yönetici İşlemi...");
                    }
                }
            }
            else{
                System.err.println("Geçersiz İşlem...");
            }
        }
        
        
    
    }    
}
