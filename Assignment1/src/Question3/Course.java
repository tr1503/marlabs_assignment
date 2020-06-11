package Question3;

public class Course {
	private String name;
	private int credit;
	private String score;
	
	public Course(String name, int credit, String score) {
		this.name = name;
		this.credit = credit;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	public double getGpa() {
		switch (score) {
			case "A+":
				return 4.3;
			case "A":
				return 4.0;
			case "A-":
				return 3.7;
			case "B+":
				return 3.3;
			case "B":
				return 3.0;
			case "B-":
				return 2.7;
			case "C+":
				return 2.3;
			case "C":
				return 2.0;
			case "C-":
				return 1.7;
			case "D":
				return 1.0;
			case "F":
				return 0.0;
			case "P":
				return 0.0;
			case "S":
				return 4.0;
			default:
				return 0.0;
		}
	}
}
