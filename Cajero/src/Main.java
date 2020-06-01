//Cuentas solicitadas por la profe para probar los metodos de la clase Cuenta.java
public class Main {
    public static void main(String[] args){
        Cuenta profCuenta = new Cuenta(1122, 500000, 4.5);
        profCuenta.depositarDinero(150000);
        profCuenta.retirarDinero(200000);
        
        System.out.println("balance: " + profCuenta.getBalance());
        System.out.println("Tasa de Interes Mensual: " + profCuenta.obtenerTasaDeInteresMensual());
        System.out.println("Fecha de Creacion: " + profCuenta.getFechaDeCreacion() + "\n");
        
        Cuenta miCuenta = new Cuenta(1234, 150000, 4.5);        
        System.out.println("balance: " + miCuenta.getBalance());
        System.out.println("Tasa de Interes Mensual: " + miCuenta.obtenerTasaDeInteresMensual());
        System.out.println("Fecha de Creacion: " + miCuenta.getFechaDeCreacion() + "\n");       
    }    
}
