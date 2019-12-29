package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class CarsController {

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String listCars(ModelMap model) {

        Car car1 = new Car("Nissan", "Almera", 123);
        Car car2 = new Car("Lada", "Vesta", 234);
        Car car3 = new Car("Honda", "Civic", 345);
        List<Car> listCars = new ArrayList<>();
        listCars.add(car1);
        listCars.add(car2);
        listCars.add(car3);
        model.addAttribute("listCars", listCars);
        return "cars";
    }
}
