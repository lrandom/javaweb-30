import models.Product;
import models.User;

public class Service {
    public static void main(String[] args) {
        Crud<Product> crud = new Crud<Product>();
        crud.add(new Product());

        Crud<User> crud1 = new Crud<User>();
        crud1.add(new User());
    }
}
