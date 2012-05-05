
public class Target {
	private String name;
	private String id;
	private boolean player;
	
	Target(String input){
		player = (input.charAt(0)=='@');
		if (!player){
			int location = input.indexOf('{');
			id =(input.substring(location+1, input.length()-1));
			name = (input.substring(0, location-1));
		}	
		else
			id = name =input.substring(1, input.length());
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public boolean isPlayer() {
		return player;
	}
}
