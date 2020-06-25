
public class ThermalDevice extends Device{

	private int temperatureMin;
	private int temperatureMax;
	private int temperatureAct;
	public ThermalDevice(String name, String mark, int temperatureMin, int temperatureMax) {
		super(name, mark);
		this.temperatureMin = temperatureMin;
		this.temperatureMax = temperatureMax;
	}
	
	@Override
	public void on() {
		super.on();
		this.temperatureAct = (temperatureMin + temperatureMax)/2;
		System.out.println(super.toString() + " temperature " + temperatureAct + "\n");
	}
	
	@Override
	public void off() {
		super.off();
		System.out.println(super.toString()  + "\n");
	}
	
}
