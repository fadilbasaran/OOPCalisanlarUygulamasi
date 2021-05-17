
public class Yazilimci extends Calisan{//İlk başta verdiği hata sen bunu tek başına kullanamıyorsun kendi constructor kur

    private String diller;
    
    public Yazilimci(String isim, String soyad, int id,String diller) {
        super(isim, soyad, id);
        
        this.diller=diller;//ekstra ozellik ekleme
    }
    
    public void formatAt(String isletim_sistemi){
        System.out.println(getIsim()+" "+isletim_sistemi+" yüklüyor...");
    }

   
    public void bilgileriGoster() {//Override ediyoruz
        super.bilgileriGoster();
        System.out.println("Yazılımcının Bildiği Diller :"+diller);
    }
    
}
