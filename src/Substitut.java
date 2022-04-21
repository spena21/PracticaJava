import java.util.Date;

public class Substitut extends Profesor{
    private Date dataInici;
    private Date dataFi;

    public void setDataFi(Date dataFi) {
        this.dataFi = dataFi;
    }

    public void setDataInici(Date dataInici) {
        this.dataInici = dataInici;
    }

    public String obtenirDades() {
        return super.obtenirDades() + " amb data de inici: " + this.dataInici + " i data final: " + this.dataFi;
    }
}
