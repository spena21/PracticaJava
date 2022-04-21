public class Estudiant extends Persona {
    //hereta tots els atributs i metodes de Persona
    private double nota;
    public Estudiant(){

    };
    public void posarNota(double nota){
        this.nota = nota;
    }
    public String obtenirDades(){
        //vull que em doni el mateix que persona + la nota
        return super.obtenirDades() + " te un " + this.nota;
    }
}
