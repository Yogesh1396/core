package placementmanagement.dao;

import placementmanagement.entities.Student;

public interface IStudentDao {


	
	
	public abstract Student searchStudentById(long id);

	public abstract Student searchStudentByhallTicket(long ticketno);

	public abstract void addStudent(Student student);

	public abstract boolean deleteStudent(long id);

	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();


}
