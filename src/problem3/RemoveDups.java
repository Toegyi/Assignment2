package problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDups {
    public static void main(String[] args) {
        String[] input = {"horse", "dog", "cat", "horse", "dog"};
        String[] output = removeDuplicates(input);
        System.out.println(Arrays.toString(output));
    }

    public static String[] removeDuplicates(String[] input) {
        List<String> outputList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == null) {
                continue;
            }
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (input[i].equals(input[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                outputList.add(input[i]);
            }
        }
//        for(int i=0; i<input.length; i++){
//            for(int j=i+1; j<input.length; j++){
//                if(input[i].equals(input[j])){
//                }
//            }
        String[] output = new String[outputList.size()];
        output = outputList.toArray(output);
        return output;
    }
}

