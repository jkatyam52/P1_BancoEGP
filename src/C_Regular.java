
public class C_Regular extends Banco_EGP {
    double total;

    public C_Regular(String nombre, double saldoinicial) {
        super(nombre, saldoinicial);
        this.total = saldoinicial;
    }

    void depositar(double dinero) {
        this.total += dinero;
        System.out.println("Su deposito se ha completado de manera exitosa, la cuenta posee un total de =" + this.total);
    }

    void retirar(double dinero) {
        if (this.total >= dinero) {
            this.total -= dinero;
            System.out.println("Su retiro de " + dinero + " se ha realizado de manera exitosa, la cuenta tiene un total de =" + this.total);
        } else {
            System.out.println("Lo sentimos no se puede realizar un retiro porque su cuenta esta sobregirada.");
        }

    }

    double c_interes() {
        double interes = this.total * 0.06;
        this.total += interes;
        return interes;
    }

    double s_actual() {
        return this.total;
    }
}
