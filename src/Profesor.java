public class Profesor extends Persona {
    public Profesor (){
    }
    private double sou;

    public void setSou(double sou) throws Exception {
        if (sou < 3000 && sou > 0) {
            this.sou= sou;
        }

        else {
            throw new Exception("El sou no es correcte");
        }
    }

    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " amb sou: " + this.sou;
    }
}
