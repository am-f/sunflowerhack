//Matching class
public class Matching {


	public Matching() {
		
	}
	
//Match method	
	public void match(Mentee mentee, Mentor[] mentors) {
		Mentor[] mentorArray = new Mentor[mentors.length];
		for(int i = 0; i < mentors.length; i++) {
			mentorArray[i] = mentors[i];
		}
		
	//Calculate match score
		for (Mentor mentor : mentorArray) {
			if((mentee.academics1 == mentor.academics1) || (mentee.academics1 == mentor.academics2)) {
				mentor.academicsMatch++;
				mentor.stringAcademics1 = mentor.stringAcademics1 + " (*Match*)";
			}
			if((mentee.academics2 == mentor.academics1) || (mentee.academics2 == mentor.academics2)) {
				mentor.academicsMatch++;
				mentor.stringAcademics2 = mentor.stringAcademics2 + " (*Match*)";
			}
			else {
				mentor.academicsMatch = 0;
			}
		
			if((mentee.extraCurricular1 == mentor.extraCurricular1) || (mentee.extraCurricular1 == mentor.extraCurricular2)) {
				mentor.extraCurricularMatch++;
				mentor.stringExtraCurricular1 = mentor.stringExtraCurricular1 + "(*Match*)";
			}
			if((mentee.extraCurricular2 == mentor.extraCurricular1) || (mentee.extraCurricular2 == mentor.extraCurricular2)) {
				mentor.extraCurricularMatch++;
				mentor.stringExtraCurricular2 = mentor.stringExtraCurricular2 + "(*Match*)";
			}
			else {
				mentor.extraCurricularMatch = 0;
			}
		
			mentor.weightedScore = (mentor.academicsMatch*2) + mentor.extraCurricularMatch;
		}
		
	//Sort matches
		Mentor temp = new Mentor();
		for(int i = 0; i < mentorArray.length-1; i++) {
			int min = i;
			for(int j = i + 1; j < mentorArray.length; j++) {
				if (mentorArray[j].weightedScore > mentorArray[min].weightedScore) {
					min = j;
				}
			}
			temp = mentorArray[min];
			mentorArray[min] = mentorArray[i];
			mentorArray[i] = temp;
				
		}
		
	//Print sorted matches
		for (Mentor active : mentorArray) {
			
			System.out.println(active);
			System.out.println("Weighted score: " + active.weightedScore);
			System.out.println();
			
		}
	
	}	
}
