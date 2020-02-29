//Mentor child class
public class Mentor extends User {
	int weightedScore;
	int academicsMatch;
	int extraCurricularMatch;
	String academics1Match;
	String academics2Match;
	String extraCurricular1Match;
	String extraCurricular2Match;

	
	
	public Mentor() {
		//temp
	}
	
	public Mentor(String name, int academics1, int academics2, int extraCurricular1, int extraCurricular2, int iD) {
		this.iD = iD;
		refID = iD + 1;
		this.name = name;
		this.academics1 = academics1;
		this.academics2 = academics2;
		this.extraCurricular1 = extraCurricular1;
		this.extraCurricular2 = extraCurricular2;

		
		switch(academics1) {
		case 1: 
			stringAcademics1 = "Computer Science";
			break;
		case 2:
			stringAcademics1 = "English";
			break;
		case 3:
			stringAcademics1 = "Business";
			break;
		case 4:
			stringAcademics1 = "Biology";
			break;
		}
		
		
		switch(academics2) {
			case 0:
				stringAcademics2 = "N/A";
				break;
			case 1: 
				stringAcademics2 = "Computer Science";
				break;
			case 2:
				stringAcademics2 = "English";
				break;
			case 3:
				stringAcademics2 = "Business";
				break;
			case 4:
				stringAcademics2 = "Biology";
				break;
			
		}
		
		switch(extraCurricular1) {
		case 1: 
			stringExtraCurricular1 = "Sports";
			break;
		case 2:
			stringExtraCurricular1 = "Arts";
			break;
		case 3:
			stringExtraCurricular1 = "Greek life";
			break;
		case 4:
			stringExtraCurricular1 = "Professional Development";
			break;
		}
		
	
		switch(extraCurricular2) {
		case 0:
			stringExtraCurricular2 = "N/A";
			break;
		case 1: 
			stringExtraCurricular2 = "Sports";
			break;
		case 2:
			stringExtraCurricular2 = "Arts";
			break;
		case 3:
			stringExtraCurricular2 = "Greek life";
			break;
		case 4:
			stringExtraCurricular2 = "Professional Development";
			break;
	}
	
	}

	
	public String toString() {
		return "Mentor ID" + iD + "\n\tName: " + name + "\n\tAcademic interest 1: " + stringAcademics1 + "\n\tAcademic interest 2: " + stringAcademics2 + "\n\tExtracurricular 1: " + stringExtraCurricular1 + "\n\tExtracurricular 2: " + stringExtraCurricular2;
	}
		
			
	
	
	
	
	
}
