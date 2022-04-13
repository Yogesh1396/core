package placementmanagement.services;


import placementmanagement.entities.Student;

public interface IStudentService {
	public abstract void addStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract Student searchStudentbyId(long id);

	public abstract Student searchStudentByHallTicket(long ticketno);

	public abstract void addCertificate(Student student);

	public abstract void updateCertificate(Student student);

	public abstract boolean deleteStudent(long id);
}
