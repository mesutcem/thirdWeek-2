package kodlamaioLayeredApp.dataAccess;

import java.util.ArrayList;
import java.util.List;

import kodlamaioLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {
	private List<Course> courses;
	
	public HibernateCourseDao() {
		courses = new ArrayList<Course>();
	}
	
	@Override
	public void add(Course course) {
		this.courses.add(course);
		System.out.println("JDBC ile eklendi " + course.getName());
	}

	@Override
	public List<Course> getAll() {
		return this.courses;
	}
}
