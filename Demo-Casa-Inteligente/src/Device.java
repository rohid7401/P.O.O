
public abstract class Device implements Switch{
	
	private static int deviceCount = 0;
	private String name;
	private String mark;
	private Boolean status;
	public int id;
	
	
	public Device(String name, String mark) {
		super();
		this.name = name;
		this.mark = mark;
		this.status = false;
		this.id = ++deviceCount;
	}

	@Override
	public String toString() {
		String text = id + " " + name + " " + mark;
		if(status) {
			text += " " + "[on]";
		}
		else {
			text += " " + "[off]";
		}
		return text;
	}
	
	public void on() {
		this.status = true;
	}
	
	public void off() {
		this.status = false;
	}

	public int getId() {
		return id;
	}
}
