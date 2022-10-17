package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Teacher;

public class HibernateTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitmen Hibernate ile veritabanına eklendi:" + teacher.getName());
		
	}

}
