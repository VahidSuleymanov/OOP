package Isciler;

public class Isci extends Erazi_Meneceri{

    @Override
    public void erazinin_temizlenmesi() {
        System.out.println("Erazi temizlendi");
    }

    double maas2 = maasI;

    public Isci (String ad, int yas, String vezife, String erazi, String menecer, double maas2){
        super(ad, yas, vezife, erazi, menecer, maas2);
        this.maas2 = maas2;
    }

    public Isci (String ad, int yas, String vezife, String erazi){
        super(ad, yas, vezife, erazi);
    }

    public Isci (String ad, int yas, String vezife){
        super(ad, yas, vezife);
    }

    public Isci (String ad, int yas){
        super(ad, yas);
    }

    public Isci (String ad){
        super(ad);
    }

    public Isci (){
        super();
    }
}
