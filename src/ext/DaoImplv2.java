package ext;

import dao.IDao;

public class DaoImplv2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Capteur");
        double temp=6000;
        return temp;
    }
}
