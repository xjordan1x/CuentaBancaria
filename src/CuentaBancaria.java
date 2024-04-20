public class CuentaBancaria {
    private double saldo;
    private String nombreCliente;


    public CuentaBancaria(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.saldo = 0.0;
    }


    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que cero.");
        }
    }


    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente o cantidad inválida para el retiro.");
        }
    }


    public double obtenerSaldo() {
        return saldo;
    }


    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public static void main(String[] args) {

        CuentaBancaria miCuenta = new CuentaBancaria("Juan Pérez");
        miCuenta.depositar(1000.0);
        miCuenta.retirar(500.0);
        System.out.println("Saldo actual de " + miCuenta.obtenerNombreCliente() + ": $" + miCuenta.obtenerSaldo());
    }
}