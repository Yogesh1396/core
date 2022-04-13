package placementmanagement;

import placementmanagement.entities.Student;
import placementmanagement.services.IStudentService;
import placementmanagement.services.IStudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		IStudentService service = new IStudentServiceImpl();
		Student student = new Student();
		student.setName("YOG");
		student.setRoll(624);
		student.setQualification("B.E");
		student.setCourse("Engineering");
		student.setYear(2021);
		student.setHallTicketNo(6240);
		//student.getCertificate("");
		
		
		  System.out.print("ID:" + student.getId()); System.out.println(" Name:" + student.getName()); System.out.println("College:" + student.getCollege());
		  System.out.println("Roll:" + student.getRoll());
		  System.out.println("Qualification:" + student.getQualification());
		  System.out.println("Course:" + student.getCourse());
		  System.out.println("Year:" + student.getYear());
		  System.out.println("Certificate:" + student.getCertificate());
		  System.out.println("HallTicketNo:" + student.getHallTicketNo());
		 

		System.out.println("End of program/Life cycle completed...");
		
	}

}
