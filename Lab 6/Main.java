class Main {
	
  public static void main(String[] args) {
    Cuenta[] cuentas = new Cuenta[100];
    int size = 0;
    int capacity = 100;
    Sistema  sist = new Sistema(cuentas, size, capacity);

    Cuenta cuenta1 = new Cuenta(true, "María Laura Sánchez", "118320993", "MeGustanLosGatos", 2019046864, "Investigador");
    Cuenta cuenta2 = new Cuenta(true, "Fernando Ugalde", "118140893", "LosCarrosSonCool", 2019086540, "Transito");
    Cuenta cuenta3 = new Cuenta(false, "Andrea Zuñiga", "1020150922", "Perrito02");
    Cuenta cuenta4 = new Cuenta(false, "Amanda Gómez", "4280167421", "Carmesi19");
    
    sist.AgregarCuenta(cuenta1);
    sist.AgregarCuenta(cuenta2);
    sist.AgregarCuenta(cuenta3);
    sist.AgregarCuenta(cuenta4);

    sist.EntrarAlSistema("118320993", "MeGustanLosGatos");
    sist.EntrarAlSistema("118140893", "LosCarrosSonCool");
    sist.EntrarAlSistema("1020150922", "Perrito02");
    sist.EntrarAlSistema("4280167421", "Carmesi19");


    System.out.println("---------------------------------------------");
    sist.getCuenta("118320993").Print();
    System.out.println("---------------------------------------------");
    sist.getCuenta("118140893").Print();
    System.out.println("---------------------------------------------");
    sist.getCuenta("1020150922").Print();
    System.out.println("---------------------------------------------");
    sist.getCuenta("1020150922").Print();
    System.out.println("---------------------------------------------");


    Denuncia denuncia1 = new Denuncia(cuenta3, "Roba a mano armada", true, 10.012285f, -84.207633f);
    Denuncia denuncia2 = new Denuncia(cuenta4, "Fraude", false);

    
    denuncia1.Print();
    System.out.println("---------------------------------------------");
    denuncia2.Print();
    System.out.println("---------------------------------------------");
  }
}
