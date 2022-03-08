package ui;


import ext.DaoImplv2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        Injection des dépendances par Instanciation statique =>new
         */
        DaoImplv2 dao = new DaoImplv2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Res=>"+metier.calcul());

    }
}
