package kodlamaioLayeredApp.business;

import kodlamaioLayeredApp.coreLogger.Logger;
import kodlamaioLayeredApp.dataAccess.CategoryDao;
import kodlamaioLayeredApp.entities.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}

	public void add(Category category1) throws Exception {
		
		for(Category cateogry : categoryDao.getAll()) {
			
			if(category1.getName().equals(category1.getName())) {
				throw new Exception("Aynı isimde birden fazla kategori olamaz");
				
			}	
		}
		
		categoryDao.add(category1);
		
		for(Logger logger : loggers) {
			logger.log(category1.getName());
		}
	}
}
