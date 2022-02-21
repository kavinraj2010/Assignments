package week3.day1;
//Method Overloading Example

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("User Id:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("User Id:"+id+",  User Name:"+name);
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("User eMail:"+email+", User phone Number:"+phoneNumber);
	}
	
	public static void main(String[] args) {
		Students get=new Students();
		get.getStudentInfo(1721016);
		get.getStudentInfo(1721016, "Kavinraj");
		get.getStudentInfo("kavinraj89444@gmail.com", 9080829503l);
	}
	
}
