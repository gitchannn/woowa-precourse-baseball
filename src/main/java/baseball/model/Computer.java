package baseball.model;

import static baseball.util.Constants.BALL_LENGTH;
import static baseball.util.Constants.BALL_MAX;
import static baseball.util.Constants.BALL_MIN;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Computer {


    private final List<Integer> computerNumber;

    private Computer(List<Integer> computerNumber) {
        this.computerNumber = computerNumber;
    }

    public static Computer createByNumber(List<Integer> computerNumber) {
        return new Computer(computerNumber);
    }

    public static List<Integer> createRandomNumbers() {
        Set<Integer> numbers = new LinkedHashSet<>();
        while (numbers.size() < BALL_LENGTH) {
            numbers.add(Randoms.pickNumberInRange(BALL_MIN, BALL_MAX));
        }
        return numbers.stream().collect(Collectors.toList());
    }

    public int getNumberByPosition(int position) {
        return computerNumber.get(position);
    }

    public boolean hasCommonNumber(int playerNumber) {
        return computerNumber.contains(playerNumber);
    }
}
