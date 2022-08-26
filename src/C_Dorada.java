
public class C_Dorada extends Banco_EGP {
    private double total;

    public C_Dorada(String nombre, double saldoinicial) {
        super(nombre, saldoinicial);
        this.total = saldoinicial;
    }

    void depositar(double dinero) {
        this.total += dinero;
        System.out.println("Su deposito se ha completado de manera exitosa, la cuenta posee un total de =" + this.total);
    }

    void retirar(double dinero) {
        this.total = this.total - dinero - 1.0;
        System.out.println("Su retiro de " + dinero + "se ha realizado de manera exitosa, la cuenta tiene un total de =" + this.total);
    }

    double c_interes() {
        double interes = this.total * 0.02;
        this.total += interes;
        return interes;
    }

    double s_actual() {
        return this.total;
    }
}
