// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = "Ron";
		String name2 = "Lisa";
		String name3 = "Dan";
		String name4 = "100";
		int sum = Integer.parseInt(name4);
		double sumeach = (double)sum/3; 

		System.out.print("dear " +name3 +", " + name2 + ", and " + name1 +
		 ": pay " + Math.ceil(sumeach) + " Shekels each" );
	       
	}
}
