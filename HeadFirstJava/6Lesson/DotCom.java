import java.util.ArrayList;

public class DotCom {
	String dotComName;
	ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}

	public void setName(String name){
		dotComName = name;
	}
	
	public String checkYourself(String stringGuess) {
		String result = "miss";

		int idx = locationCells.indexOf(stringGuess);		
			
		if (idx >= 0) {
			result = "hit";
			locationCells.remove(idx);			

		    if (locationCells.isEmpty()){
				result = "kill";
			} else {
				result = "hit";
			}
		}

		System.out.println(result);
		return result;
	}
}