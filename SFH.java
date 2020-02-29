//Sunflower Hack CollegeCommunity Driver Class
public class SFH {

	public static void main(String[] args) {
		System.out.println("CollegeCommunity Matching");
		System.out.println();
		
		//Quick Mentee
		Mentee mentee1 = new Mentee("Jon Snow", 2, 1, 3, 4, -1);
		
		//Detailed Mentee (enter your own details)
		Mentee mentee2 = new Mentee(mentee1.refID);
		
		

		Mentor mentor1 = new Mentor("Night King", 3, 1, 1, 0, 1);
		Mentor mentor2 = new Mentor("Ramsay Snow", 4, 0, 1, 0, mentor1.refID);
		Mentor mentor3 = new Mentor("Tyrion Lannister", 1, 2, 2, 4, mentor2.refID);
		Mentor[] mentorArray = {mentor1, mentor2, mentor3};

		
		System.out.println(mentee2);

		System.out.println(mentor1);
		System.out.println(mentor2);
		System.out.println(mentor3);
	
		//Matching mentee1 (Jon Snow) with mentors
		System.out.println("---MATCHING---");
		Matching matching = new Matching();
		matching.match(mentee1, mentorArray);

	}

}
