package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);

    public List<Car> allCars();

    public List<Car> getCarFromListAndCount(List<Car> cars, Integer count);

}