package practice;

//http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
//https://github.com/mission-peace/interview/blob/master/src/com/interview/recursion/StringPermutation.java - Tushar Roy
// Below code is Tushar Roy's.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {

	public List<String> permute(char input[]) {
        Map<Character, Integer> countMap = new TreeMap<>();
        for (char ch : input) {
            if(countMap.get(ch) == null) 
            	countMap.put(ch, 1);
            else countMap.put(ch,countMap.get(ch) + 1 );
            
            
            /*compute(ch, (key, val) -> {
                if (val == null) {
                    return 1;
                } else {
                    return val + 1;
                }
            });*/
        }
        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        List<String> resultList = new ArrayList<>();
        char result[] = new char[input.length];
        permuteUtil(str, count, result, 0, resultList);
        return resultList;
    }

    public void permuteUtil(char str[], int count[], char result[], int level, List<String> resultList) {
        if (level == result.length) {
            resultList.add(new String(result));
            return;
        }

        for(int i = 0; i < str.length; i++) {
            if(count[i] == 0) {
                continue;
            }
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level + 1, resultList);
            count[i]++;
        }
    }

    private void printArray(char input[]) {
        for(char ch : input) {
            System.out.print(ch);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String str = "AABC";
    	StringPermutation sp = new StringPermutation();
        sp.permute(str.toCharArray());
        for(char s: str.toCharArray())
        	System.out.print(s);
    }
}