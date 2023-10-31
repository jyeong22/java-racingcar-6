package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CurrentResultMapTest {
    CurrentResultMap currentResultMap = new CurrentResultMap();

    @Test
    void test1(){
        Car car1 = new Car("hello");
        Car car2 = new Car("bye");
        car1.move();
        List<Car> cars = List.of(car1, car2);
        String currentResultMap1 = currentResultMap.getCurrentResultMap(cars);


    }
}
