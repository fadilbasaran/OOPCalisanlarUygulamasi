
public class Calisan {
    private String isim;
    private String soyad;
    private int id;

    public Calisan(String isim, String soyad, int id) {
        this.isim = isim;
        this.soyad = soyad;
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void bilgileriGoster(){ 
        
        System.out.println("Çalışan Bilgileri");
        
        System.out.println("Adı :"+isim);
        System.out.println("Soyadı :"+soyad);
        System.out.println("Id :"+id);
        
    }
}
