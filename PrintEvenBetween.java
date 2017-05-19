import java.util.ArrayList;

public class PrintEvenBetween {
	public static ArrayList printEven(int begin, int end){
		ArrayList<Integer> listTest = new ArrayList<>();

		for(int i = begin; i < end; i++){
			if(i%2 == 0){
				System.out.println(i);
				listTest.add(i);
			}
		}
		return listTest;
	}

	public static void main(String[] args) {
    	if(args.length == 0){
    		System.out.println("Enter Begining and End");
    		return;
    	}
    	int begin = Integer.parseInt(args[0]);
    	int end = Integer.parseInt(args[1]);
    	
    	System.out.println(printEven(begin, end));
    }
}
