
import java.util.Date;
import java.text.SimpleDateFormat;

public class Denuncia{
  private Cuenta cuenta = new Cuenta();
  private String descripcion = "";
  private Date fecha = new Date();
  private boolean esGeoRe = false;
  private float latitud = 0;
  private float longitud = 0;

  public Denuncia(){

  }

  public Denuncia(Cuenta cuenta, String desc, boolean esGeoRef, float latitud, float longitud){
    this.cuenta = cuenta;
    this.descripcion = desc;
    this.esGeoRe = esGeoRef;
    if(esGeoRef == true){
      this.longitud = longitud;
      this.latitud = latitud;
    }
  }

  public Denuncia(Cuenta cuenta, String desc, boolean esGeoRef){
    this.cuenta = cuenta;
    this.descripcion = desc;
    this.esGeoRe = esGeoRef;
  }

  public void Print(){
    String tostring = "";
    if(esGeoRe){
      tostring = ("Cuenta denunciante: "+cuenta.GetNombre()+"\nDescripcion: "+descripcion+"\nFecha: "+fecha+"\nGeoreferencia: "+longitud+", "+latitud);
    } else {
      tostring = ("Cuenta denunciante: "+cuenta.GetNombre()+"\nDescripcion: "+descripcion+"\nFecha: "+fecha+"\nGeoreferencia: "+longitud+", "+latitud);
    }
    System.out.println(tostring);
  }
}