package week6.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id : " + id + "\n" + "Student name : " + name);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Email : " + email + "\n" + "PhoneNumber : " + phoneNumber);
	}

	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(20210629);
		obj.getStudentInfo(20210629, "Pravinraj");
		obj.getStudentInfo("pravinraj@gmail.com", 786808188l);
	}

}

