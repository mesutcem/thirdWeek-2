package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.coreLogger.Logger;
import kodlamaioLayeredApp.dataAccess.CourseDao;
import kodlamaioLayeredApp.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0.0) {
			throw new Exception("Kurs fiyatı 0 TL'den az olamaz!");
		}
		for (Course c : courseDao.getAll()) {
			if (c.getName().equals(course.getName())) {
				throw new Exception("Aynı isimde birden fazla kurs olamaz!");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
}
