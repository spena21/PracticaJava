public class Estudiant extends Persona {
    //hereta tots els atributs i metodes de Persona
    private double nota;
    public Estudiant(){

    };
    public void posarNota(double nota){
        if (nota > 0 && nota <10) {
            this.nota = nota;
        }
        else {
            System.out.println("La nota no es correcta");
        }
    }
    public String obtenirDades(){
        //vull que em doni el mateix que persona + la nota
        if (super.obtenirDades() == "Dades de la persona incompletes" ){
            return "Dades de la persona incompletes";
        }
        else {
            return super.obtenirDades() + " te un " + this.nota;
        }
    }
}
