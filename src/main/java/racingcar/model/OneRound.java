package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class OneRound {
    private static final int moveCondition = 4;

    //test
    public static String playGames(List<Car> cars) {
        for (Car car : cars) {
            int randomNum = Randoms.pickNumberInRange(0, 9);
            if(randomNum>=moveCondition){
                car.move();
            }
        }
        return CurrentResultMap.getCurrentResultMap(cars);
    }
}
