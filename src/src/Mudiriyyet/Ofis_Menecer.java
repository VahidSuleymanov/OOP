package Mudiriyyet;

public class Ofis_Menecer extends Drektor_Muavini{

    protected double maasM = maasMenecer;
    protected double maasI = maasIsci;

    @Override
    void iscilerin_hesabati() {
        System.out.println("Hesabat Menecere gonderildi");
    }

    protected Ofis_Menecer (String ad, int yas, String vezife, String erazi, String menecer){
        super(ad, yas, vezife, erazi, menecer);
    }

    protected Ofis_Menecer (String ad, int yas, String vezife, String erazi){
        super(ad, yas, vezife, erazi);
    }

    protected Ofis_Menecer (String ad, int yas, String vezife){
        super(ad, yas, vezife);
    }

    protected Ofis_Menecer (String ad, int yas){
        super(ad, yas);
    }

    protected Ofis_Menecer (String ad){
        super(ad);
    }

    protected Ofis_Menecer (){
        super();
    }
}
