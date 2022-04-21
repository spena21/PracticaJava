public class Substitut extends Profesor{
    private String dataInici;
    private String dataFi;

    public void setDataFi(String dataFi) {
        this.dataFi = dataFi;
    }

    public void setDataInici(String dataInici) {
        this.dataInici = dataInici;
    }

    public String obtenirDades() {
        return super.obtenirDades() + " amb data de inici: " + this.dataInici + " i data final: " + this.dataFi;
    }
}
