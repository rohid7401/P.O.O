import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args){
        Cuenta[] cuentas = new Cuenta[10];
        Scanner s = new Scanner(System.in);
        
        for(byte i=0; i<10; i++){
            cuentas[i] = new Cuenta(i, 100000, 4.5);                       
        }
        
        while(true){            
            System.out.println("Ingrese su id: ");
            byte nid = s.nextByte();
            
            for(Cuenta j: cuentas){
                if (j.getId() == nid){
                    boolean salir = false;
                    while(true){
                        System.out.println("|Menú Principal|\n"
                                + "1. Ver el balance actual\n"
                                + "2. Retirar Dinero\n"
                                + "3. Depositar Dinero\n"
                                + "4. Salir\n"
                                + "Ingrese su selección: ");
                        byte seleccion = s.nextByte();
                        
                        switch(seleccion){
                            case 1: System.out.println("El balance es de " + j.getBalance() + "\n");
                                    break;
                            case 2: System.out.println("Ingrese una cantidad para retirar: ");
                                    double a = s.nextDouble();
                                    j.retirarDinero(a);
                                    break;
                            case 3: System.out.println("Ingrese una cantidad para depositar: ");
                                    double b = s.nextDouble();
                                    j.depositarDinero(b);
                                    break;
                            case 4: salir = true;
                                    break;
                            default: System.out.println("---seleccion invalida---");
                                    break;
                        }                        
                        if(salir) break;                        
                    }
                    break;
                }
            }
        }
    }    
}