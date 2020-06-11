class Sistema {
	
  private Cuenta[] cuentas;
  private int size;
  private int capacity;

  public Sistema(Cuenta[] cuentas, int size, int capacity){
    this.cuentas = cuentas;
    this.size = size;
    this.capacity = capacity;
  }

  public void EntrarAlSistema(String cedula, String password){
    if(getCuenta(cedula).GetContrasenna() == password){
      System.out.println("Ingreso Exitoso");
      System.out.println("");
    } else {
      System.out.println("Cuenta o Contraseña Invalida");
      System.out.println("");
    }
  }

  public boolean VerificarCuenta(Cuenta cuenta){
    for (int i=0; i < capacity; i++){
      if(cuentas[i] != null){
        if(cuentas[i].GetCedula() == cuenta.GetCedula()){
          return false;
        }
      }
    }
    return true;
  }

  public void AgregarCuenta(Cuenta acc){
        if (size == capacity){
            aseguraCapacidad(2); 
        }
        if(VerificarCuenta(acc) == true){
          cuentas[size] = acc;
          System.out.println("Cuenta añadida exitosamente\n");
          size++;
        } else {
          System.out.println("La cuenta ya existe");
        }
        
  }

  public void aseguraCapacidad(int minCapacidad){
        Cuenta temp[] = new Cuenta[capacity*minCapacidad];
        for (int i=0; i < capacity; i++){
            temp[i] = cuentas[i];
        }
        cuentas = temp;
        capacity = capacity * minCapacidad;
  }

  public Cuenta getCuenta(String cedula){
      for (int i=0; i < capacity; i++){
        if(cuentas[i] != null){
          if(cuentas[i].GetCedula() == cedula){
            return cuentas[i];
          }
        }
      }
      System.out.println("Cuenta no encontrada");
      System.out.println("");
      return cuentas[0];
  }
}

