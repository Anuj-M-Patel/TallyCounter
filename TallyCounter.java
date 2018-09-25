/***
 * 
 * @author Anuj Patel
 * Period 6
 * 
 */

public class TallyCounter {

	//Fields
	private int count;
	
	//Constructor -- initializes fields
	public TallyCounter() {
		count = 0;	
	}
	
	public TallyCounter(int input) {
		count = input;
	}
	
	//Methods
	public void click() {
		//count = count + 1;
		count++;
		//count += 1;
	}
	
	public int getCount() {
		return count;
	}
	
	public void reset() {
		count = 0;
	}
	
	public void undoClick() {
		count -= 1;
	}
}
