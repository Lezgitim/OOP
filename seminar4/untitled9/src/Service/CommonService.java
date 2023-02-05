package Service;

import Model.Student;
import Model.User;

import java.util.List;

public interface CommonService<T extends User> {
    void add(T st);

    void remove(T st);

    void edit(T st);

    String getAll(T st);

}
