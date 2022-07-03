package web.service;

import web.DAO.CarDao;
import web.DAO.CarDaoImp;
import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService{

    CarDao cdi = new CarDaoImp();

    @Override
    public List<Car> showCars(int count) {
        return cdi.showCars(count);
    }

    @Override
    public int countCars() {
        return cdi.countCars();
    }
}
