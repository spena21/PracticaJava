public class Persona {
    //atributs (sempre privats)
    private String nom;
    private String dni;
    //funcions (poden ser publiques o privades)
    public Persona(){
        //constructora
        //System.out.println ("Hola");
    }
    //quan son privades nomes es poden mirar des de dins de la classe.
    //Aquesta funció canvia el nom de la persona
    public void setNom(String nom) {
        this.nom = nom;
    }
    //aquesta funció obtindrà les dades
    public String obtenirDades() {
        return "Persona que es diu " + this.nom + " amb dni " + this.dni;
    }
    public void setDni(String dni) {
        if (this.dni == null) {
            this.dni = dni;
        }
        else {
            System.out.println("Aquesta persona ja te un dni assignat");
        }
    }
}
