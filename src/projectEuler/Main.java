/******************************************************
 * Evan Tellep                                        *
 * Assignment Last                                    *
 * 04/19/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * The main method of the project                     *                                                    
 * Ref:Notes/Hints given by Bill                      *
 ******************************************************/

package projectEuler;

public class Main {

	public static void main(String[] args) {
		//Instantiating a new p object
		Problem30 p = new Problem30();
		//Creating answer variable to store the returned value from the p30 method
		int answer = p.p30();
		//Printing out the answer
		System.out.println("The answer to project euler problem 30 is:" + answer);
		//System.out.println(1 % 10);
	}

}
