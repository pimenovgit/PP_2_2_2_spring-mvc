package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.DAO.CarDao;
import web.DAO.CarDaoImp;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
   private CarDao cdi;

   public CarServiceImp(CarDaoImp cdi) {
       this.cdi = cdi;
   }

    @Override
    public List<Car> getCarList(int count) {
        return cdi.getCarList(count);
    }

    @Override
    public int countCars() {
        return cdi.countCars();
    }
}
