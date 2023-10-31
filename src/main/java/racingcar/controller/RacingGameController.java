package racingcar.controller;

import racingcar.InputValidator;
import racingcar.model.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingGameController {
    private RacingGame racingGame = new RacingGame();

    public void proceed() {
        initRacingGame();
        playGame();
        showFinalWinners();
    }

    private void initRacingGame() {
        racingGame.setCarNames(InputView.inputCarNames());
        racingGame.setTryCount(InputView.inputTryCount());
    }

    private void playGame() {
        String result = racingGame.race();
        OutputView.printResult(result);
    }

    private void showFinalWinners() {
        String finalWinners = racingGame.getWinners();
        OutputView.printFinalWinners(finalWinners);
    }
}
