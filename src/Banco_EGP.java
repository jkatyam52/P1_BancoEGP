
public class Banco_EGP {
    private String nombre;
    private double saldoinicial;

    public Banco_EGP(String nombre, double saldoinicial) {
        this.nombre = nombre;
        this.saldoinicial = saldoinicial;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getSaldoinicial() {
        return this.saldoinicial;
    }
}
