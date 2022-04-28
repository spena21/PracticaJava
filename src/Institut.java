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
    public void imprimirInformacio () throws Exception {
        for (int i =0; i<persones.size(); i++){
            String dades = persones.get(i).obtenirDades();
            System.out.println(dades);
        }
    }
}
