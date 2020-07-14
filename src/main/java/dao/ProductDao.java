package dao;

import model.Product;
import model.User;

import java.util.List;

/**
 * Created by Igor on 10/8/2019.
 */
public interface ProductDao {
    void save(Product product);

    void update(Product producr);

    void delete(Product produc);

    Product getByName(String name);

    List<Product> getAll();

    Product getById(long id);
}
