
public class ModalityDevice extends Device{

	private String[] modality;
	private String modalityAct;
	public ModalityDevice(String name, String mark, String[] modality) {
		super(name, mark);
		this.modality = modality;
	}
	@Override
	public void on() {
		super.on();
		this.modalityAct = modality[0];
		System.out.println(super.toString() + " modality " + modalityAct  + "\n");
	}
	@Override
	public void off() {
		super.off();
		System.out.println(super.toString()  + "\n");
	}
	
	
}
