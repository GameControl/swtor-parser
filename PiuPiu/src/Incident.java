public class Incident {

	private String time;
	private Target source;
	private Target dest;
	private String name;
	private String name_id;
	private String incident_type;
	private String incident_id;
	private String effect;
	private String effect_id;
	private int magnitude;
	private Boolean crit;
	private String modify;
	private int threat;
	
	Incident(String line){
		String[] input = lineSplit(line);
		time = input[0];
		source = new Target(input[1]);
		dest = new Target(input[2]);
		String working = input[3].replace("}", "");
		int location = working.indexOf('{');
		if (location>0){
			name = working.substring(0, location-1);
			name_id = working.substring(location+1, working.length());
		}
		else{
			name = name_id = working;
		}
		input[4] = input[4].replace("}", "");
		String[] working2 = input[4].split(":");
		location = working2[0].indexOf('{');
		incident_type = working2[0].substring(0, location-1).trim();
		incident_id = working2[0].substring(location+1,working2[0].length()).trim();
		location = working2[1].indexOf('{');
		effect = working2[1].substring(0, location-1).trim();
		effect_id = working2[1].substring(location+1,working2[1].length()).trim();
		
		// need to finish this		
	}

	public String getTime(){return time;}
	public String getSourceName(){return source.getName();}
	public String getSourceId(){return source.getId();}
	public boolean isSourcePlayer(){return source.isPlayer();}
	public String getDestName(){return dest.getName();}
	public String getDestId(){return dest.getId();}
	public boolean isDestPlayer(){return dest.isPlayer();}
	public String getName(){return name;}
	public String getName_id(){return name_id;}
	public String getIncident_type(){return incident_type;}
	public String getIncident_id(){return incident_id;}
	public int getMagnitude(){return magnitude;}
	public Boolean isCrit(){return crit;}
	public int getThreat(){return threat;}
	public String getModify(){return modify;}
	public String getEffect(){return effect;}
	public String getEffect_id(){return effect_id;}
	
	private String [] lineSplit(String line){
		line = line.replace("[", "");
		String[] splits = line.split("]");
		for(int i =0;i<splits.length;i++){
			splits[i]=splits[i].trim();
		}
		return splits;
	}
	
}

