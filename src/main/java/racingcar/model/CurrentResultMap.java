package racingcar.model;

import java.util.List;

public class CurrentResultMap {
    private static final String moveUnit = "-";
    private static final String printMoveFormat = "%s : %s\n";

    // test
    public static String getCurrentResultMap(List<Car> cars) {
        String currentResultMap = "";
        for (Car car : cars) {
            String carName = car.getName();
            int moveDistance = car.getMoveDistance();
            String moveUnits = moveUnit.repeat(moveDistance);
            currentResultMap += String.format(printMoveFormat, carName, moveUnits);
        }
        return currentResultMap+"\n";
    }

}
