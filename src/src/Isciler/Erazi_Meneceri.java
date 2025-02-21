package Isciler;

import Mudiriyyet.Ofis_Menecer;
import Mudiriyyet.Tapsiriqlar;

public class Erazi_Meneceri extends Ofis_Menecer implements Tapsiriqlar{

    @Override
    public void erazinin_temizlenmesi() {
        System.out.println("Isciler temizlenecek eraziye yonlendirildi");
    }

    @Override
    public final void erazinin_tehvil_verilmesi() {
        System.out.println("1 gun erzinde erazi tehvil verilecek");
    }

    @Override
    public final void hesabatlarin_hazirlanmasi() {
        System.out.println("Hesabatlar hazirlanir");
    }

    double maas = maasM;

    public Erazi_Meneceri (String ad, int yas, String vezife, String erazi, String menecer, double maas){
        super(ad, yas, vezife, erazi, menecer);
        this.maas = maas;
    }

    public Erazi_Meneceri (String ad, int yas, String vezife, String erazi){
        super(ad, yas, vezife, erazi);
    }

    public Erazi_Meneceri (String ad, int yas, String vezife){
        super(ad, yas, vezife);
    }

    public Erazi_Meneceri (String ad, int yas){
        super(ad, yas);
    }

    public Erazi_Meneceri (String ad){
        super(ad);
    }

    public Erazi_Meneceri (){
        super();
    }

    public void getinfo2(){
        super.getinfo();
        System.out.println("Maas: "+this.maas);
    }
}
