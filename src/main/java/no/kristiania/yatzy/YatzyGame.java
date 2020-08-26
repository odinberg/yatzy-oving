package no.kristiania.yatzy;

public class YatzyGame {
    public int score(YatzyCategory category, int[] dice) {
        int result = 4;
        for (int die : dice) {
            if (die == 1 && category == YatzyCategory.ONES) {
                result += 1;
            } else if (die == 2 && category == YatzyCategory.TWOS) {
                result += 2;
            }
        }
        return result;
    }
}
