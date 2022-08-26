//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nombre del cliente");
        String nombre = br.readLine();
        System.out.println("Cuanto dinero desea ingresar en la cuenta como saldo inicial");
        double s_inicial = Double.parseDouble(br.readLine());
        System.out.println("¿Qué tipo cuenta desea poseer? \n1.Cuenta Regular \n2.Cuenta Dorada");
        int opciones = Integer.parseInt(br.readLine());
        double dinero;
        if (opciones == 1) {
            C_Regular cuenta = new C_Regular(nombre, s_inicial);

            do {
                System.out.println("¿Qué tipo de operación desea realizar en la cuenta? \n1.Depositar \n2.Retirar \n3.Calcular interes \n4.Mostrar el Saldo actual de su cuenta");
                opciones = Integer.parseInt(br.readLine());
                switch (opciones) {
                    case 1:
                        System.out.println("¿Cuanto dinero desea depositar?");
                        dinero = Double.parseDouble(br.readLine());
                        cuenta.depositar(dinero);
                        break;
                    case 2:
                        System.out.println("Cuanto dinero desea retirar?");
                        dinero = Double.parseDouble(br.readLine());
                        cuenta.retirar(dinero);
                        break;
                    case 3:
                        System.out.println("Interes que produce la cuenta es de=" + cuenta.c_interes());
                        break;
                    case 4:
                        System.out.println("Su saldo actual es de=" + cuenta.s_actual());
                }
            } while(opciones <= 4);
        } else if (opciones == 2) {
            C_Dorada cuenta = new C_Dorada(nombre, s_inicial);

            do {
                System.out.println("¿Qué tipo de operación desea realizar en la cuenta? \n1.Depositar \n2.Retirar \n3.Calcular interes \n4.Mostrar el Saldo actual de su cuenta");
                opciones = Integer.parseInt(br.readLine());
                switch (opciones) {
                    case 1:
                        System.out.println("¿Cuanto dinero desea depositar?");
                        dinero = Double.parseDouble(br.readLine());
                        cuenta.depositar(dinero);
                        break;
                    case 2:
                        System.out.println("Cuanto dinero desea retirar?");
                        dinero = Double.parseDouble(br.readLine());
                        cuenta.retirar(dinero);
                        break;
                    case 3:
                        System.out.println("Interes que produce la cuenta es de=" + cuenta.c_interes());
                        break;
                    case 4:
                        System.out.println("Su saldo actual es de=" + cuenta.s_actual());
                }
            } while(opciones <= 4);
        }

    }
}
