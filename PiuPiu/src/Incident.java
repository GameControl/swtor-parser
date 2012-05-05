
public class Incident {

	String time;
	Target source;
	Target dest;
	String name;
	String name_id;
	String incident_type;
	String incident_id;
	int magnitude;
	Boolean crit;
	int threat;
	String modify;
	
	Incident(String[] input){
		time = input[0];
		source = new Target(input[1]);
		dest = new Target(input[2]);
// need to finish these		
	}

	private String [] lineSplit(String line){
		line = line.replace("[", "");
		String[] splits = line.split("]");
		for(int i =0;i<splits.length;i++){
			splits[i]=splits[i].trim();
		}
		return splits;
	}
	
}

