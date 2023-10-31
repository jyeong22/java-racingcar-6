package racingcar.model;

import racingcar.InputValidator;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private final List<Car> cars = new ArrayList<>();
    private int tryCount;

    //test
    public void setCarNames(List<String> carNames){
        InputValidator.validateCarsName(carNames);
        initCars(carNames);
    }

    //test
    public void setTryCount(int tryCount){
        InputValidator.validateCount(tryCount);
        this.tryCount = tryCount;
    }

    private void initCars(List<String> carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    //test
    public String race() {
        String finalResult = "\n실행결과\n";
        for(int i = 0; i<tryCount;++i){
            String resultOfRound = OneRound.playGames(cars);
            finalResult+=resultOfRound;
        }
        return finalResult;
    }

    //test
    public String getWinners() {
        return WinnerCalculator.getWinners(cars);
    }
}
