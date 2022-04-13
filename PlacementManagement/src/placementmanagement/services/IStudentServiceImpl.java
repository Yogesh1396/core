package placementmanagement.services;

import placementmanagement.dao.IStudentDao;
import placementmanagement.dao.IStudentDaoImpl;
import placementmanagement.entities.Student;

public class IStudentServiceImpl implements IStudentService {
	IStudentDao sd;
	public IStudentServiceImpl() {
		sd=  new IStudentDaoImpl();
	}
	@Override
	public void addStudent(Student student) {
		sd.beginTransaction();
		sd.addStudent(student);
		sd.commitTransaction();
	}
	@Override
	public void updateStudent(Student student) {
		sd.beginTransaction();
		sd.updateStudent(student);
		sd.commitTransaction();
	
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		sd.beginTransaction();
		sd.searchStudentByhallTicket(ticketNo);
		sd.commitTransaction();
		return null;
	}
	@Override
	public boolean deleteStudent(long id) {
		sd.beginTransaction();
		sd.deleteStudent(id);
		sd.commitTransaction();
		return false;
	}
	@Override
	public Student searchStudentbyId(long id) {
		sd.beginTransaction();
		sd.searchStudentById(id);
		sd.commitTransaction();
		return null;
	}
	@Override
	public void addCertificate(Student student) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateCertificate(Student student) {
		// TODO Auto-generated method stub
		
	}
}