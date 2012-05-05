import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws FileNotFoundException{
		
		File myFile = new File("/home/fett/Desktop/CombatLogs/combat_2012-05-04_16_50_56_330809.txt");
		Scanner n = new Scanner(myFile);
		while(n.hasNextLine()){
			String line = n.nextLine();
			System.out.println(line);
			System.out.println();
			
			line = line.replace("[", "");
			String[] splits = line.split("]");
			for(int i =0;i<splits.length;i++){
				splits[i]=splits[i].trim();
			}
			for (String item:splits){
				System.out.println(item);

			}
			System.out.println("-----------------------------");
		}
		
		
	}

}

