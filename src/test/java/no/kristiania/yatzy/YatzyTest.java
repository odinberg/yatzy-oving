package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes() {
    assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] { 1, 1, 2, 1, 1}));
    assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[] { 6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreTwo() {
    assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[] { 1, 1, 2, 1, 1}));
    assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[] { 6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScorePair() {
        assertEquals(18, yatzyGame.score(YatzyCategory.PAIR, new int[]{1, 3, 5, 5, 2}));
    }

}
