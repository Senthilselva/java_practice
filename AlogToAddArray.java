import java.util.ArrayList;
import java.util.Arrays;

public class AlogToAddArray {
	public static double AddArray(ArrayList<Integer> newArr){
		double sum =0;
		for(int i = 0; i < newArr.size(); i++){
			sum = sum + newArr.get(i);
			}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Double> newArr = new ArrayList<>(Arrays.asList(5,5,5));
		for(int i = 0; i< 10; i++){
			newArr.add((Double) i);
		}

    	System.out.println(AddArray(newArr));
    }
}
