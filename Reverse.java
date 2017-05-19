public class Reverse {
	public static void main(String[] args){ //constructo
	
		System.out.println(args[0]);
		char[] strToArr = args[0].toCharArray();
		for(int i=strToArr.length-1; i>=0; i--){
			System.out.print(strToArr[i]);
		}
	}
}