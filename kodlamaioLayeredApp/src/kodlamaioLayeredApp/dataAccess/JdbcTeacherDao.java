package kodlamaioLayeredApp.dataAccess;

import kodlamaioLayeredApp.entities.Teacher;

public class JdbcTeacherDao implements TeacherDao {

	@Override
	public void add(Teacher teacher) {
		System.out.println("Eğitmen JDBC ile veritabanına eklendi: " + teacher.getName());
		
	}

}
