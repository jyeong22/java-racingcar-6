package racingcar.model;

import racingcar.InputValidator;

public class Car {
    private final static int moveCondition = 4;
    private final String name;
    private int moveDistance;

    public Car(String name) {
        InputValidator.validateCarName(name);
        this.name = name;
        moveDistance = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public void move(int randomNum) {
        if(randomNum>=moveCondition){
            moveDistance += 1;
        }
    }
}
