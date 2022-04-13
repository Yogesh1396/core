package placementmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import placementmanagement.entities.Student;




public class IStudentDaoImpl implements IStudentDao {
	EntityManager em;
    public void IStudentRepository() {
    	em=Configuration.createEntityManager();
    }
	
    @Override
	public Student searchStudentById(long id) {
		Student student = em.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		em.persist(student);

	}

	@Override
	public boolean deleteStudent(long id) {
		Student student = em.find(Student.class, id);
		em.remove(student);
		return true;
	}

	@Override
	public void updateStudent(Student student) {
		em.merge(student);

	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();

	}

	@Override
	public Student searchStudentByhallTicket(long ticketno) {
		Query query = em.createNamedQuery("searchStudentByhallTicket");
				Student student= (Student) query.getSingleResult();

		return student;
	}

}
