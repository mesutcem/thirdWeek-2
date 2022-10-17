package kodlamaioLayeredApp.dataAccess;

import java.util.List;

import kodlamaioLayeredApp.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getAll();
}
