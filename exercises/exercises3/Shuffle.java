package exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};

		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
        String[] shuffles=new String[original.length];
        for(int i=shuffles.length-1;i>=0;i--){
        	int c=(int)(Math.random()*(i+1));
        	shuffles[i]=original[c];
        	for(int j=c;j<original.length-1;j++){
        		original[j]=original[j+1];
        	}}
        
        System.out.println("");
		//
		// Follow the instructions on the web page to make a copy of
		// the original array, named shuffled, but with its elements
		// permuted from the original array.  The result is that the
		// shuffled array contains the same strings, but in a randomized
		// order.
		//
        for (int k=0; k < shuffles.length; ++k) {
			System.out.println("Shuffled at " + k + " is " + shuffles[k]);
		}
	}}
	
