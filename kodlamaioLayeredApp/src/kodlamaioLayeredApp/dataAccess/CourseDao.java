package kodlamaioLayeredApp.dataAccess;

import java.util.List;

import kodlamaioLayeredApp.entities.Course;

public interface CourseDao {
	void add(Course course);
	List<Course> getAll();
}

