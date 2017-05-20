import java.util.ArrayList;
import java.util.Arrays;

public class DotComTestDrive {
	public static void main(String[] args){
		GameHelper helper = new GameHelper();
		DotCom theDotCom = new DotCom();

		int randomNum = (int) (Math.random() * 5);

		ArrayList<String> cells = new ArrayList<String>(Arrays.asList("5","6","7"));
		
		theDotCom.setName("Test");
		theDotCom.setLocationCells(cells);
		String result = "miss";
		
		do {
		String guess = helper.getUserInput("enter a number");
		result = theDotCom.checkYourself(guess);
		} while(!result.equals("kill")); 

	}

}