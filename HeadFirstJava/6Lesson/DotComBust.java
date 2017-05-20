import java.util.*;

public class DotComBust {
	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setGames() {
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		dotComsList.add(one);
		dotComsList.add(two);
		dotComsList.add(three);

		for ( DotCom dotComToSet : dotComsList ) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void startPlaying(){
		while(!dotComsList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {
		numOfGuesses++;

		String result = "miss";

		for(int x =0; x<dotComsList.size(); x++) {
			result = dotComsList.get(x).checkYourself(userGuess);

			if(result.equals("hit")){
				break;
			}

			if(result.equals("kill")){
				dotComsList.remove(x);
				break;
			}
		}
		System.out.println("line 51 ComBust" + result);
	}
	private void finishGame() {
		System.out.println("All dot coms dead"+ numOfGuesses);
	}

	public static void main(String[] args){
		DotComBust game = new DotComBust();

		game.setGames();
		game.startPlaying();

	}
}