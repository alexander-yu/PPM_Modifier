/*
 * EffectsTest
 * by Alex Yu (afy2103)
 * This handles I/O for choosing the desired effect that the user wants
 */
import java.util.*;

public class EffectsTest {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Effects photoshop = new Effects();
		boolean valid_input = false;
		while (!valid_input) {
			System.out.println("What effect would you like to use?");
			System.out.println("Filter (F), FlipHorizontal (FH), or GreyScale (GS)?");
			
			String response = input.next();
			if (!response.equals("F") && !response.equals("FH")
					&& !response.equals("GS")) {
				System.out.println("Invalid choice! Please try again.");
			}
			
			else {
				valid_input = true;
				if (response.equals("F")) {
					photoshop.filterEffect();
				}
				
				else if (response.equals("FH")) {
					photoshop.flipHorizontalEffect();
				}
				
				else if (response.equals("GS")) {
					photoshop.greyScaleEffect();
				}
			}
		}
		
		input.close();
	}
	

}