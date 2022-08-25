import java.util.ArrayList;
import java.util.List;
import java.util.prefs.PreferenceChangeEvent;

public class Kassenbon {

    Adresse adresse;
    public List<Rechnungsposition> positionen;


    public Kassenbon() {
        positionen = new ArrayList<Rechnungsposition>();
    }









    public void printIt( List<Produkt> produkts) {

        double gesammt = 0.0;

        System.out.println( "Kassenbon" + '\n' + "kasse 1 " +  '\n' + "--------------------------------" );

        for( int i = 0 ; i < positionen.size() ; i++ ){
            System.out.print(positionen.get(i) + " ");

            Rechnungsposition position = positionen.get(i);

            System.out.println(Kassensystem.getPrice(position.getName(), produkts ));

            System.out.println(Kassensystem.getPrice(position.getName(), produkts ) * position.anzahl);

            gesammt = gesammt + Kassensystem.getPrice(position.getName(), produkts ) * position.anzahl;



        }

        System.out.println("-------------------------------");

        System.out.println(gesammt);





    }









//    @Override
//    public String toString() {
//        return "Kassenbon{" +
//                "adresse=" + adresse +
//                ", positionen=" + positionen +
//                '}';
//    }

//Datum
    //Zeit


}
