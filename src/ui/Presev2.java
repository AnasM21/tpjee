package ui;

import dao.IDao;
import metier.IMetier;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presev2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        /*
        la classe "Class" est très importante , forName au moment de l'execution va chercher si la classe
        qu'on lui donne existe il va la charger en mémoire , sinon elle genère une exception "ClassNotFoundException"
         */

        /*
        new instance instancie la classe , cherche la classe et trouve le constructeur sans paramètres
        si le constructeur par défaut n'existe pas , l'exception InstanceNotFound se lève
        //cDao.newInstance();
         // metier.setDao(dao);
         */


        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getDeclaredConstructor().newInstance();

        // le meme traitement pour l'objet métier
        String metierClassName = scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("Resultat==>"+metier.calcul());

    }
}
