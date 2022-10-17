package kodlamaioLayeredApp;

import kodlamaioLayeredApp.business.CategoryManager;
import kodlamaioLayeredApp.business.CourseManager;
import kodlamaioLayeredApp.business.TeacherManager;
import kodlamaioLayeredApp.coreLogger.DatabaseLogger;
import kodlamaioLayeredApp.coreLogger.FileLogger;
import kodlamaioLayeredApp.coreLogger.Logger;
import kodlamaioLayeredApp.coreLogger.MailLogger;
import kodlamaioLayeredApp.dataAccess.HibernateCategoryDao;
import kodlamaioLayeredApp.dataAccess.JdbcCourseDao;
import kodlamaioLayeredApp.dataAccess.JdbcTeacherDao;
import kodlamaioLayeredApp.entities.Category;
import kodlamaioLayeredApp.entities.Course;
import kodlamaioLayeredApp.entities.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger() };

		Teacher teacher1 = new Teacher(1, "Engin");

		Category category1 = new Category("Kodlama", 1);
		Category category2 = new Category("Yazılım güvenliği",2);
		
		Course course1 = new Course(1, 100, "Java ile kodlama", "Sıfırdan üst seviyeye Java eğitimi");
		Course course2 = new Course(2, 150, "C# ile kodlama", "sıfırdan üst seviyeye C# eğitimi");
		Course course3 = new Course(3, 200, "Java ile kodlama", "üst seviyelerden sektörün enlerine");
		
		TeacherManager teacherManager = new TeacherManager(new JdbcTeacherDao(), loggers);
		teacherManager.add(teacher1);

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		//categoryManager.add(category2);
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		//courseManager.add(course3);		


	}

}
