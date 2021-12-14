package LaunchSequenceChecker;

public class LaunchSequenceChecker {

    public static boolean checker(String[] names, int[] steps){
        for (int index = 0; index<names.length; index++){
            for (int position = 0; position<names.length; position++){

                if (position == index || names[position] == null){
                    continue;
                }

                if (names[position].equals(names[index]) &&
                    steps[position]<=steps[index]){
                    return false;

                }else if (names[position].equals(names[index])){
                    names[index] = null;
                    break;
                }

            }
        }
        return true;
    }
}
