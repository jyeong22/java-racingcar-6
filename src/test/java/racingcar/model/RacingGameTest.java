package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.List;

public class RacingGameTest {
    private RacingGame racingGame = new RacingGame();

    @Test
    void test(){
        List<String> name = List.of("hello, bye");
        racingGame.setCarNames(name);
        assertThat(racingGame)
    }
}
