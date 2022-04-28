import java.util.Date;
public class Main {

    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona(); //això és una instancia de persona, podem crear les que volguem
        Persona p2 = new Persona();

        p1.setNom("Marc");
        p1.setDni("XXXXXXXXX");
       // String dades =p1.obtenirDades();
       // System.out.println(dades);

        Estudiant e =new Estudiant();
        e.posarNota(7.5);
        e.posarNota(8.0);
        e.setDni("XXXXXXXXX");
        e.setNom("Joan");
     //   System.out.println(e.obtenirMitjana());
       // dades = e.obtenirDades();
       // System.out.println(dades);

        Profesor pr = new Profesor();
        pr.setSou(2500);
        pr.setNom("Sheila");
        pr.setDni("456789264P");
      // dades = pr.obtenirDades();
       // System.out.println(dades);

        Substitut s = new Substitut();
        s.setDni("45383937D");
        s.setNom("Maria");
        s.setSou(1500);
        Date dataInici = new Date(2022,04,10);
        Date dataFi = new Date(2022,06,30);
        s.setDataInici(dataInici);
        s.setDataFi(dataFi);
       // dades = s.obtenirDades();
        //System.out.println(dades);

        Institut institut= new Institut();
        institut.afegirPersona(p1);
        institut.afegirPersona(e);
        institut.afegirPersona(pr);
        institut.afegirPersona(s);
        institut.imprimirInformacio();

    }
}
