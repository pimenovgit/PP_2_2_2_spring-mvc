package web.controller;

import com.sun.jdi.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private CarService carService;


    public CarsController() {
        this.carService = new CarServiceImp();
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam (value = "count", required = false) Integer count, Model model) {
        this.carService = new CarServiceImp();
        if (count == null || count > carService.countCars())  {
            count = carService.countCars();
        }
        model.addAttribute("cars", carService.showCars(count));
        return "cars";
    }
}
