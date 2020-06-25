import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class JSONParser {
	
	private File file;
	private ObjectMapper mapper;
	private JsonNode node;
	
	public JSONParser() {
		file = new File("resources/data.json");
		mapper = new ObjectMapper();
		try {
			node = mapper.readTree(file);
		} 
		catch (JsonProcessingException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Controller loadDevice() {
		
		Controller controller = new Controller();
		
		ArrayNode devices = (ArrayNode) node.get("device"); 
		if(devices != null) {
			for(int i=0; i<devices.size(); i++) {
				JsonNode device = devices.get(i);
				String name = device.get("name").asText();
				String mark = device.get("mark").asText();
				String type = device.get("type").asText();
				
				switch(type) {
				case "thermal":
					int min = device.get("temperatureMin").asInt();
					int max = device.get("temperatureMax").asInt();
					ThermalDevice td = new ThermalDevice(name, mark, min, max);
					controller.add(td);
					break;
				case "signal":
					ArrayNode signalJSON = (ArrayNode) device.get("signal");
					if(signalJSON != null) {
						float[] signals = new float[signalJSON.size()];
						for(int k=0; k<signalJSON.size(); k++) {
							signals[k] = signalJSON.get(k).asLong();
						}
						SignalDevice sd = new SignalDevice(name, mark, signals);
						controller.add(sd);
					}
					break;
				case "modality":
					ArrayNode modalitiesJSON = (ArrayNode) device.get("modality");
					if(modalitiesJSON != null) {
						String[] modalities = new String[modalitiesJSON.size()];
						for(int j=0; j<modalitiesJSON.size(); j++) {
							modalities[j] = modalitiesJSON.get(j).asText();
						}
						ModalityDevice md = new ModalityDevice(name, mark, modalities);
						controller.add(md);
					}
					break;
				}
			}
		}
		return controller;
	}
}
