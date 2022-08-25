public class Rechnungsposition {

    String name;
    Integer anzahl;

    public Rechnungsposition(String name, Integer anzahl) {
        this.name = name;
        this.anzahl = anzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(Integer anzahl) {
        this.anzahl = anzahl;
    }





    @Override
    public String toString() {
        return anzahl+ " * " + name ;
    }
}

