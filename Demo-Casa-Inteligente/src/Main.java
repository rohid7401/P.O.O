import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		Controller controller = parser.loadDevice();	
		
		Scanner s = new Scanner(System.in);
		int option;
		int id;

		do {System.out.print("|Smart-Home|\n1.Turn On a Device\n2.Turn Off a Device\n3.Show Devices\n4.Exit\n");
			option = s.nextInt();
			switch(option) {
			case 1: System.out.println("Select the Device's ID to Turn on:");
				id = s.nextInt();
				for(int i=0; i<controller.size(); i++) {
					if(id == controller.get(i).id) {
						controller.get(i).on();
						break;
					}
				}
				break;
			case 2: System.out.println("Select the Device's ID to Turn off:");
				id = s.nextInt();
				for(int j=0; j<controller.size(); j++) {
					if(id == controller.get(j).id) {
						controller.get(j).off();
						break;
					}
				}
				break;
			case 3: System.out.println(controller + "\n");
				break;
			}
		}while(option != 4);
	}
	
}
