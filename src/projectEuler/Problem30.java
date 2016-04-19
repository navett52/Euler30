/******************************************************
 * Evan Tellep                                        *
 * Assignment Last                                    *
 * 04/19/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * Class to determine answer to ProjectEuler p.30     *                                                    
 * Ref:Notes/Hints given by Bill                      *
 ******************************************************/

package projectEuler;

public class Problem30 {
	/**
	 * Method generates numbers and runs them through the 'check()' method to see if the fit the conditions
	 * @return The sum of the numbers that fit the condition
	 */
	public int p30() {
		//Initializing 'result' to be used for the result
		int result = 0;
		//Generating numbers to be checked
		for(int i = 2; i < 443839; i++) {
			//Checking each number to see if it can be written as it's digits to their 5th powers
			if (check(i) == true) {
				//Adding numbers that fit the condition to the result
				result = result + i;
			}
		}
		return result;
	}
	
	/**
	 * Checks if a number can be written as it's digits to their 5th power
	 * @param num The number to be checked
	 * @return True if the number meets the condition
	 */
	public boolean check(int num) {
		//Creating a tmp value since the actual number is needed for comparison later
	    int tmpNum = num;
	    //Holds the sum of the digits to their 5th powers
	    int sumOfDigits = 0;
	    //While the number is not 0 it separates it into digits and acquires their 5th power value.
	    while(tmpNum != 0){
	    	//Use modulo 10 to grab the numbers last digit
	        int digit = tmpNum % 10;
	        //Divide the original number by ten to get the original number without the last digit
	        tmpNum = tmpNum / 10;
	        //Adding the digit^5 to the sumOfDigits variable to keep track
	        sumOfDigits = (int) (sumOfDigits + Math.pow(digit,5));
	        //If the sumOfDigits is greater than the original number it does not meet the conditions
	        //so we need to get out of the loop
	        if(sumOfDigits > num){
	        	break;
	        }

	    }
	    //If the sumOfDigits is the same as the number it meets the conditions so return true
	    if(sumOfDigits == num) {
	        return true;
	    }
	    else {
	        return false;
	    }
	}
}
