package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.DAO.CarDaoImp;
import web.model.Car;

import java.util.List;
@Component
public class CarServiceImp implements CarService{

    CarDao cdi = new CarDaoImp();

    @Override
    public List<Car> getCarList(int count) {
        return cdi.getCarList(count);
    }

    @Override
    public int countCars() {
        return cdi.countCars();
    }
}
