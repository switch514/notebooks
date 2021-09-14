package normal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class No524MatchWordsTest {

    @Test
    public void findLongestWord() {
        List<String> strs = new ArrayList<>();
        strs.add("ale");
        strs.add("apple");
        strs.add("monkey");
        strs.add("plea");
        //System.out.println(new No524MatchWords().findLongestWord("abpcplea",strs));
        strs.clear();
        strs.add("a");
        strs.add("b");
        strs.add("c");
        System.out.println(new No524MatchWords().findLongestWord("abpcplea",strs));
    }
}