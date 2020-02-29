//Mentee child class
public class Mentee extends User {

	//easy mentee
	public Mentee(String name, int academics1, int academics2, int extraCurricular1, int extraCurricular2, int iD) {
		this.iD = iD;
		refID = iD - 1;
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
	
	//normal mentee
	public Mentee(int iD) {
		this.iD = iD;
		refID = iD - 1;
		String temp;
		String trash;
		System.out.println("Please enter your name: ");
		name = scan.nextLine();
		
		System.out.printf("Please enter the number of your first academic interest%n1. Computer Science%n2. English%n3. Business%n4. Biology%n");
		academics1 = scan.nextInt();
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
		
		


			System.out.println("Do you have a second academic interest? Type \"yes\" or \"no\"");
			temp = scan.next();
			if (temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("y")) {
		
				System.out.printf("Please enter the number of your second academic interest%n1. Computer Science%n2. English%n3. Business%n4. Biology%n");
				academics2 = scan.nextInt();
				if ((academics2 == academics1) || (academics2 > 4)) {
			
					System.out.println("Invalid Input.  Try again please.");
					
				}
				else {

					switch(academics2) {
				
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
					default:
						academics2 = 0;
						stringAcademics2 = "N/A";
					}
			}
			
		
			}
	
			

		
		trash = scan.nextLine();
		
		System.out.printf("Please enter the number of your first extracurricular interest: %n1. Sports%n2. Arts%n3. Greek life%n4. Professional Development%n");
		extraCurricular1 = scan.nextInt();
	
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
	
		
		
			System.out.println("Do you have a second extracurricular interest? Type \"yes\" or \"no\"");
			temp = scan.next();
			if (temp.equalsIgnoreCase("yes") || temp.equalsIgnoreCase("y")) {
				System.out.printf("Please enter the number of your second extracurricular interest%n1. Sports%n2. Arts%n3. Greek life%n4. Professional Development%n");
				extraCurricular2 = scan.nextInt();
				if (extraCurricular2 == extraCurricular1 || extraCurricular2 > 4) {
			
					System.out.println("Invalid Input.  Try again please.");
				}
				else {
					switch(extraCurricular2) {
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
						default:
							extraCurricular2 = 0;
							stringExtraCurricular2 = "N/A";
							
					}
				}
			}
			
			

		
	
	}
	public String toString() {
		return "Mentee ID" + iD + "\n\tName: " + name + "\n\tAcademic interest 1: " + stringAcademics1 + "\n\tAcademic interest 2: " + stringAcademics2 + "\n\tExtracurricular 1: " + stringExtraCurricular1 + "\n\tExtracurricular 2: " + stringExtraCurricular2;
	}
}
