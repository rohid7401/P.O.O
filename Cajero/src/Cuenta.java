//

import java.util.Date;

public class Cuenta {

    private int id;
    private double balance;
    private double tasaDeInteresAnual;
    private Date fechaDeCreacion = new Date();
    
    // crea cuenta por defecto
    public Cuenta(){
        id = 0;
        balance = 0.0;
        tasaDeInteresAnual = 0.0;
    }
    
    //crea cuenta con un id & su balance
    public Cuenta(int n_id, double n_bal, double n_tas){
        id = n_id;
        balance = n_bal;
        tasaDeInteresAnual = n_tas * 0.01;
    }
    
    //metodos get y set para el id
    public int getId(){
        return id;
    }
    
    public void setId(int newId){
        id = newId;
    }
    
    //metodos get y set para el balance
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double newBalance){
        balance = newBalance;
    }
  
    //metodos get y set para el tasa de interes anual
    public double getTasaDeInteresAnual(){
        return tasaDeInteresAnual;
    }
    
    public void setTasaDeInteresAnual(double newTDIA){
        tasaDeInteresAnual = newTDIA * 0.01;
    }
    
    //metodo get de la fecha de creacion
    public Date getFechaDeCreacion(){
        return fechaDeCreacion;
    }
    
    //metodos para obtener y calcular la tasa de interes mensual
    public double obtenerTasaDeInteresMensual(){
        return calcularInteresMensual();
    }
    
    public double calcularInteresMensual(){
        return balance * tasaDeInteresAnual/12;
    }
    
    //metodos para retirar y depositar dinero en el balance
    public void retirarDinero(double dinero){    
        balance -=  dinero;
    }

    public void depositarDinero(double dinero){    
        balance +=  dinero;
    }    
}