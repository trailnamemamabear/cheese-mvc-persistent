package org.launchcode.models.data;

import org.launchcode.models.forms.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {

    Category findById(Integer id);
}
