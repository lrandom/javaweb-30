import models.IModels;
import models.Product;
import models.User;

//C- create
//R- read
//U- update
//D- delete
public class Crud<T> {
    public void add(T object) {
        IModels iModels = (IModels) object;
        System.out.println("Add record with id" + iModels.getId());
    }

    /*public T[] getList() {
        System.out.println("Get list of records");
        T users[] = {
                new User(),
                new User()
        };
        return users;
    }*/

    public void update(T user) {
        IModels iModels = (IModels) user;
    }

    public void del(T user) {
        IModels user1 = (IModels) user;
        System.out.println("Delete record with id" + user1.getId());
    }
}
