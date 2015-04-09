/**
* @author Mihajlo Nesic (www.mihajlonesic.cf)
* @copy 2014
*/
package cf.mihajlonesic.hanoi;

public class HanoiRings {

	public static void main(String[] args) {
		// Solves the basic Hanoi game with 4 rings
		hanoi(4,1,2,3);
	}
	
	/**
	* params
	* n - Number of rings
	* a - Pole 1
	* b - Pole 2
	* c - Pole 3
	*/
	public static void hanoi(int n, int a, int b, int c) {
		if (n > 0) {
			hanoi(n - 1, a, c, b);
			System.out.println("Move disc "+n+" from pole "+a+" to pole "+c);
			hanoi(n - 1, b, a, c);
		}
	}
	
}
