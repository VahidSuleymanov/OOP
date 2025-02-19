import Isciler.Erazi_Meneceri;
import Isciler.Isci;
import Mudiriyyet.Ofis_Menecer;

public class Main {
    public static void main(String[] args) {

        Erazi_Meneceri E1 = new Erazi_Meneceri("Tural");
        E1.getinfo();
        System.out.println("--------------------");
        Isci I1 = new Isci("Elnur", 25);
        I1.getinfo();


    }
}