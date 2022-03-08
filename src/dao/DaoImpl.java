package dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        /*
        Se connecter à la base de données pour récupérer la temperature
         */
        System.out.println("Version base de données");
        double temp=Math.random()*50;
        return temp;
    }


}
