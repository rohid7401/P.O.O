import java.util.Random;

public class SignalDevice extends Device{

	private float[] signal;
	private float signalAct;
	
	public SignalDevice(String name, String mark, float[] signal) {
		super(name, mark);
		this.signal = signal;
	}

	@Override
	public void on() {
		super.on();
		Random ran = new Random();
		int signalNow = ran.nextInt(signal.length);
		this.signalAct = signal[signalNow];
		System.out.println(super.toString() + " signal " + signalAct  + "\n");
	}

	@Override
	public void off() {
		super.off();
		System.out.println(super.toString()  + "\n");
	}
	
}
