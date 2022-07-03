package web.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{

    public CarDaoImp(){}

    public CarDaoImp (List <Car> carList) {
        this.carList = carList;
    }
    private List <Car> carList = new ArrayList<>();
    {
        carList.add(new Car("car1", 1234, "black"));
        carList.add(new Car("car2", 134, "blue"));
        carList.add(new Car("car3", 453, "green"));
        carList.add(new Car("car4", 312, "white"));
        carList.add(new Car("car5", 1435, "red"));
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public List<Car> showCars(int count) {
        return carList.subList(0, count);
    }

    @Override
    public int countCars() {
        return carList.size();
    }
}
