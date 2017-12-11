package fr.ensim.yaelboutreux.TpNote111217;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CompagnieAssurance ensiMMA = new CompagnieAssurance();
        Personne paul = new Personne();
        paul.setNom("CORDON");
        paul.setPrenom("Paul");
        paul.creerContrat(1);
        paul.creerContrat(1);
        paul.creerContrat(0);
        System.out.println(paul.toString());
        Personne florentin = new Personne();
        florentin.setNom("PAILLIER");
        florentin.setPrenom("Florentin");
        florentin.creerContrat(1);
        florentin.resilierContrat(florentin.getListeContrat().get(0));
        System.out.println(florentin.toString());
        Personne hugo = new Personne();
        hugo.setNom("SERGENT");
        hugo.setPrenom("Hugo");
        System.out.println(hugo.toString());
    }
}
