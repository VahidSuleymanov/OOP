package Mudiriyyet;

abstract class Drektor_Muavini {

    abstract void iscilerin_hesabati();

    String ad;
    int yas;
    String vezife;
    String erazi;
    String menecer;
    final static double maasMenecer = 1200;
    final static double maasIsci = 650;

    Drektor_Muavini (String ad, int yas, String vezife, String erazi, String menecer){
        setad(ad);
        setyas(yas);
        setvezife(vezife);
        seterazi(erazi);
        setmenecer(menecer);
    }

    Drektor_Muavini (String ad, int yas, String vezife, String erazi){
        setad(ad);
        setyas(yas);
        setvezife(vezife);
        seterazi(erazi);
        setmenecer("X");
    }

    Drektor_Muavini (String ad, int yas, String vezife){
        setad(ad);
        setyas(yas);
        setvezife(vezife);
        seterazi("X");
        setmenecer("X");
    }

    Drektor_Muavini (String ad, int yas){
        setad(ad);
        setyas(yas);
        setvezife("X");
        seterazi("X");
        setmenecer("X");
    }

    Drektor_Muavini (String ad){
        setad(ad);
        setyas(0);
        setvezife("X");
        seterazi("X");
        setmenecer("X");
    }

    Drektor_Muavini (){
        setad("X");
        setyas(0);
        setvezife("X");
        seterazi("X");
        setmenecer("X");
    }

    void setad (String ad){
        this.ad = ad;
    }

    void setyas (int yas){
        this.yas = yas;
    }

    void setvezife (String vezife){
        this.vezife = vezife;
    }

    void seterazi (String erazi){
        this.erazi = erazi;
    }

    void setmenecer (String menecer){
        this.menecer = menecer;
    }

    public void getinfo(){
        System.out.println("Ad: "+ad);
        System.out.println("Yas: "+yas);
        System.out.println("Vesife: "+vezife);
        System.out.println("Erazi: "+erazi);
        System.out.println("Menecer: "+menecer);
    }
}
