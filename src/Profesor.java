public class Profesor extends Persona {
    public Profesor (){
    }
    private double sou;

    public void setSou(double sou) {
        this.sou = sou;
    }

    public String obtenirDades(){
        return super.obtenirDades() + " amb sou: " + this.sou;
    }
}
