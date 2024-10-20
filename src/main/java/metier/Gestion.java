package metier;
import dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gestion")
public class Gestion implements IGestion{
    @Autowired
    @Qualifier("cal1")
    private ICalcul calcul;

    @Override
    public double calcul() {
        double d=calcul.getValue() ;
        double resultat=d*10;
        return resultat;
    }
    public void setCal(ICalcul c) {
        this.calcul = c;
    }
}
