package normal;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class No1002GroupWordsTest {

    @Test
    public void groupAnagrams() {
        String [] testData = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = No1002GroupWords.groupAnagrams(testData);
        System.out.println(result.toString());

    }
}