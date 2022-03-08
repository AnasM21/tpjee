package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    //Couplage faible
    private IDao dao;
    public double calcul() {
        double temp=dao.getData();
        double res=temp*Math.cos(temp*3.14)*600;
        return res;
    }
    // méthode pour injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
