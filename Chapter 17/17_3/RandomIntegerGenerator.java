class RandomIntegerGenerator {

	public RandomIntegerGenerator() {
		
	}	

	public static int generateBetween(int floor, int ceil) {
		double seed = Math.random();
		return (int) (floor + (ceil-floor) * seed);
	}

}