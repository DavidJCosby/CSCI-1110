class EX13_11i {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octogon firstOctogon = new Octogon(5);
		Octogon secondOctogon = firstOctogon.clone();
		System.out.print(firstOctogon.compareTo(secondOctogon));
	}
}