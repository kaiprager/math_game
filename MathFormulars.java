package math_game;

public class MathFormulars {
	
	
	// Formula for Finding the highest number
	
	public int highestNum(int[] num) {

		int superHigh = num[0];

		for (int i : num) {
			if (i > superHigh) {
				superHigh = i;
			}
		}
		return superHigh;
	}
	
	// Formula for Finding the lowest number
	
		public int lowestNum(int[] numl) {

			int superLow = numl[0];

			for (int i : numl) {
				if (i < superLow) {
					superLow = i;
				}
			}
			return superLow;
		}


}
