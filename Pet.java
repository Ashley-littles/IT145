package ProjectOne;

public class Pet {
		// Data type attributes
		private String petType;
		private String petName;
		private int petAge;
		private int dogSpaces;
		private int catSpaces;
		private int daysStay;
		private double amountDue;
		
		//Constructor
		public Pet() {
			petType = "None";
			petName = "NoName";
			petAge = -1;
			daysStay = -1;
		}
		
		//Mutator "setter" method
		public void setPetType(String dogOrCat) {
			petType = dogOrCat;
		}
		
		public void setPetName(String nameOfPet) {
			petName = nameOfPet;
		}
				
		public void setPetAge(int ageOfPet) {
			petAge = ageOfPet;
		}
		
		public void setDogSpaces(int numDogSpaces) {
			dogSpaces = numDogSpaces;
		}
		
		public void setCatSpaces(int numCatSpaces) {
			catSpaces = numCatSpaces;
		}
		
		public void setDaysStay(int numDaysStay) {
			daysStay = numDaysStay;
		}
		
		public void setAmountDue(double totalAmountDue) {
			amountDue = totalAmountDue;
		}
		
		// Accessors "getter" method
		public String getPetType() {
			return petType;
		}
		
		public String getPetName() {
			return petName;
		}
		
		public int getPetAge() {
			return petAge;
		}
		
		public int getDogSpaces() {
			return dogSpaces;
		}
		
		public int getCatSpaces() {
			return catSpaces;
		}
		
		public int getDaysStay() {
			return daysStay;
		}
		
		public double getAmountDue() {
			return amountDue;
	
	}

}
