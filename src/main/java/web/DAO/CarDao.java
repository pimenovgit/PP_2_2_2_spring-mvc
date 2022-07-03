package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> showCars(int count);
    int countCars();

}
