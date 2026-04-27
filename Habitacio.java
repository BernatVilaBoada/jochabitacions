import java.util.HashMap;

public class Habitacio {
    private String nom;
    private String descripcio;
    private HashMap<Direccio, Habitacio> sortides;

    public Habitacio(String nom, String descripcio) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.sortides = new HashMap<>();
    }

    public void setSortida(Direccio direccio, Habitacio vei) {
        sortides.put(direccio, vei);
    }

    public Habitacio getSortida(Direccio direccio) {
        return sortides.get(direccio);
    }

    @Override
    public String toString() {
        StringBuilder sortidesList = new StringBuilder();
        for (Direccio d : sortides.keySet()) {
            if (sortidesList.length() > 0) sortidesList.append(", ");
            sortidesList.append(d.toString().toLowerCase());
        }
        return "--- " + nom + " ---\n" +
                descripcio + "\n" +
                "Sortides visibles: " + (sortidesList.length() == 0 ? "cap" : sortidesList);
    }
}