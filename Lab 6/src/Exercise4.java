
public class Exercise4 {

	public static void main(String[] args) {
		/*
		 * Assume a binary search is performed on the following array of integers:
		 * {1,14, 15, 24, 55, 59, 73, 90, 94, 99} Trace through each iteration of the
		 * algorithm, writing the number that will be the middle element and the left
		 * and right bounds (indexes), when searching for the number 73.
		 */

		/*
		 * Method 1:
		 * 
		 * A binary search works by starting in the middle and working towards the
		 * number we're searching for. The position of an element in an array is known
		 * as it's index and starts at 0 and continues upwards. 
		 * 
		 * For this array of integers, we set min = 0 and max = 9. 
		 * The first guess would be at 55 since we have 9 indices and Java rounds down since it has to be an integer.
		 * 
		 * This creates the right hand bound at {1,14, 15, 24} and left hand bound at {59, 73, 90, 94, 99} 
		 * Since 55 < 73, we eliminate the right hand bound and then find the middle of the left hand bound. 
		 * 
		 * This creates a new middle of 90 and a right hand bound of {59, 73} and left hand bound of {94, 99}. 
		 * Since 73 < 90, we eliminate the left hand bound and then creates new bounds from {59, 73, 90} and jumps to the middle which is 73. 
		 * 
		 */

		/*
		 * Method 2:
		 * 
		 * For this array of integers, we set min = 0 and max = 9. The first guess would be at 55. Since the
		 * index value 73 is higher than the first guess ( 55 < 73 ) we update the value
		 * of the min to 5 which is 59 which is still 59 < 73 so we then update the min
		 * to 6 which is 73! This means we found the value we were searching for.
		 * 
		 * Pseudocode:
		 * 
		 * Let min = 0 and max = n-1 ( 9). Compute the guess as the average of the max &
		 * min and round down to be an integer. If the array[guess] = target, then stop
		 * If the array[guess] < target, create min = guess + 1 If the array[guess] >
		 * target, create min = guess - 1
		 * 
		 */

	}

}
