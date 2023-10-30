package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.InputValidator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars = new ArrayList<>();

    public RacingGame(List<String> carNames) {
        InputValidator.validateCarsName(carNames);
        initCars(carNames);
    }

    public String race() {
        for (Car car : cars) {
            int randomNum = getRandomNum();
            car.move(randomNum);
        }
        return new CurrentResultMap().getCurrentResultMap(cars);
    }

    public String getWinners() {
        return new WinnerCalculator().getWinners(cars);
    }

    private List<Car> getCars() {
        return cars;
    }

    private void initCars(List<String> carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    private int getRandomNum() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
