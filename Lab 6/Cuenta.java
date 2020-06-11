public class Cuenta{
	
  private boolean esFuncionario = false;
  private String nombreUsuario = "";
  private String cedula = "";
  private String contrasenna = "";
  private int carnet = 0;
  private String puestoTrabajo = "";

  public Cuenta(){

  }

  public Cuenta(boolean esFunc, String name, String ced, String pass, int carneT, String pTrabajo){
    if(esFunc == true){
      this.esFuncionario = esFunc;
      this.nombreUsuario = name;
      this.cedula = ced;
      this.contrasenna = pass;
      this.carnet = carneT;
      this.puestoTrabajo = pTrabajo;
    } else {
      this.esFuncionario = false;
      this.nombreUsuario = name;
      this.cedula = ced;
      this.contrasenna = pass;
    }
  }

  public Cuenta(boolean esFunc, String name, String ced, String pass){
    if(esFunc == true){
      this.esFuncionario = esFunc;
      this.nombreUsuario = name;
      this.cedula = ced;
      this.contrasenna = pass;
      this.carnet = 0;
      this.puestoTrabajo = "Sin definir";
    } else {
      this.esFuncionario = esFunc;
      this.nombreUsuario = name;
      this.cedula = ced;
      this.contrasenna = pass;
    }
  }

  public void SetEsFuncionario(boolean esFunc){
    this.esFuncionario = esFunc;
  }

  public void SetNombre(String name){
    this.nombreUsuario = name;
  }

  public void SetCedula(String ced){
    this.cedula = ced;
  }

  public void SetContrasenna(String pass){
    this.contrasenna = pass;
  }

  public void SetCarnet(int carneT){
    this.carnet = carneT;
  }

  public void SetPuestoTrabajo(String pTrabajo){
    this.puestoTrabajo = pTrabajo;
  }

  public boolean GetEsFuncionario(){
    return esFuncionario;
  }

  public String GetNombre(){
    return nombreUsuario;
  }

  public String GetCedula(){
    return cedula;
  }

  public String GetContrasenna(){
    return contrasenna;
  }

  public int GetCarnet(){
    return carnet;
  }

  public String GetPuestoTrabajo(){
    return puestoTrabajo;
  }

  public void Print(){
    String esFunc1 = "";
    String tostring = "";
    if(esFuncionario){
      esFunc1 = "Si";
      tostring = ("Es funcionario: "+esFunc1+"\n\nNombre: "+nombreUsuario+"\nCedula: "+cedula+"\nCarnet: "+carnet+"\nPuesto de Trabajo: "+puestoTrabajo);
    } else {
      esFunc1 = "No";
      tostring = ("Es funcionario: "+esFunc1+"\n\nNombre: "+nombreUsuario+"\nCedula: "+cedula);
    }
    System.out.println(tostring);
  }
}

