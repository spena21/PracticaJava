import java.util.ArrayList;

public class Institut {
    private String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }
    ArrayList<Persona> persones = new ArrayList<Persona>();

    public void afegirPersona(Persona persona) {
        persones.add(persona);
    }
    public void afegirProfesor(Profesor professor) {
        persones.add(professor);
    }
    public void afegirEstudiant(Estudiant estudiant){
        persones.add(estudiant);
    }
    public void afegirSubstitut(Substitut substitut){
        persones.add(substitut);
    }
    public void imprimirInformacio (){
        for (int i =0; i<persones.size(); i++){
            String dades = persones.get(i).obtenirDades();
            System.out.println(dades);
        }
    }
}
