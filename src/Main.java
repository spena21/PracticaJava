public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona(); //això és una instancia de persona, podem crear les que volguem
        Persona p2 = new Persona();

        p1.setNom("Marc");
        p1.setDni("XXXXXXXXX");
        String dades =p1.obtenirDades();
        System.out.println(dades);

        Estudiant e =new Estudiant();
        e.posarNota(7.5);
        e.setNom("Marc");
        dades = e.obtenirDades();
        System.out.println(dades);

        Profesor pr = new Profesor();
        pr.setSou(3500);
        pr.setNom("Marc");
        pr.setDni("456789264P");
        dades = pr.obtenirDades();
        System.out.println(dades);

        Substitut s = new Substitut();
        s.setDni("45383937D");
        s.setNom("Maria");
        s.setSou(1500);
        s.setDataInici("10/04/2022");
        s.setDataFi("30/06/2022");
        dades = s.obtenirDades();
        System.out.println(dades);

    }
}
