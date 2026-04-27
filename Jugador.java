public class Jugador {
    private Habitacio posicioActual;

    public Jugador(Habitacio inici) {
        this.posicioActual = inici;
    }

    public Habitacio getPosicioActual() { return posicioActual; }

    public void moureA(Direccio direccio) {
        Habitacio seguent = posicioActual.getSortida(direccio);
        if (seguent != null) {
            posicioActual = seguent;
            System.out.println("T'has mogut cap al " + direccio.toString().toLowerCase() + ".");
            System.out.println(posicioActual);
        } else {
            System.out.println("No hi ha cap sortida en aquesta direcció!");
        }
    }
}