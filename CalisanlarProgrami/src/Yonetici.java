
public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yonetici(String isim, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(isim, soyad, id);
        this.sorumlu_kisi_sayisi=sorumlu_kisi_sayisi;//Ekstra özellik ekleme
    }

    
    public void bilgileriGoster() {//Override ediyoruz
        super.bilgileriGoster(); 
        
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı :"+sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int zamMiktari){
        System.out.println(getIsim()+" çalışanlara "+zamMiktari+" tl kadar zam yapıyor...");
    }
}
