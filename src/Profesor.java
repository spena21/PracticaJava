public class Profesor extends Persona {
    public Profesor (){
    }
    private double sou;

    public void setSou(double sou) {
        if (sou < 3000 && sou > 0) {
            this.sou= sou;
        }

        else {
            System.out.println ("El sou no es correcte");
        }
    }

    public String obtenirDades(){
        return super.obtenirDades() + " amb sou: " + this.sou;
    }
}
