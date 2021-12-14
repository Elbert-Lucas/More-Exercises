package LaunchSequenceChecker;

import static LaunchSequenceChecker.LaunchSequenceChecker.checker;

public class LaunchMain {
    public static void main(String[] args) {
        String[] names = {"stage_1", "stage_2", "dragon", "stage_1", "stage_2", "dragon"};
        int[]steps = {1, 10, 11, 2, 12, 111};
        System.out.println(checker(names,steps));
    }
}
