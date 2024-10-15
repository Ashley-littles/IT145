package moduletwoassignmentwriteaclass;

public class Dog extends Pet{
	// All attributes
	private int dogSpaceNumber;
	private double dogWeight;
	private boolean grooming;
	
	// constructor empty
	public Dog() {

	}

	// accessor "getter" method
	public int getDogSpaceNumber() {
		return dogSpaceNumber;
	}
	
	// mutator "setter" method
	public void setDogSpaceNumber (int dogSpaceNumber) {
		this.dogSpaceNumber = dogSpaceNumber;
	}
	
	// accessor "getter" method
	public double getDogWeight () {
		return dogWeight;
	}
	
	// mutator "setter" method
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
	}
	
	// accessor "getter" method
	public boolean isGrooming() {
		return grooming;
	}
	
	// mutator "setter" method
	public void setGrooming(boolean grooming) {
		this.grooming = grooming;
	}
} // end dog class
