package StringProblems;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfBallon {

  public static void main(String[] args) {
    //"krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"
    //laebolkonlaebolkoabcballsdsdfjslfjsljfdljso
    //loonbalxballpoonloonbalxballpoonloonbalxballpoonnlaebolkonlaebolkoabcballsdsdfjslfjsljfdljso
    //krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqwooooooooooannnnnnnnllllllasdhkfkgsdfsgfsgjfh
    System.out.print("Number of balloon is: " + maxNumberOfBalloons("llo"));

  }

  public static int maxNumberOfBalloons(String text) {
    int result = 0;
    String word = "balloon";

    Map<Character, Integer> hashmapForWord = new HashMap<>();
    for (int i = 0; i < word.length(); i++) {
      hashmapForWord.put(word.charAt(i), 0);
    }

    for (int i = 0; i < text.length(); i++) {
      if (hashmapForWord.containsKey(text.charAt(i))) {
        int addValue = hashmapForWord.get(text.charAt(i));
        hashmapForWord.put(text.charAt(i), addValue + (int) text.charAt(i) );
      }
    }

    Integer getMin = Collections.min(hashmapForWord.values());
    //get the key of min value

    int acsiValueOfKey = 0;
    //get the key of the min value
    for (Character o: hashmapForWord.keySet()) {
      if (hashmapForWord.get(o).equals(getMin)) {
        acsiValueOfKey = (int) o;
      }
    }

    for( Integer value: hashmapForWord.values()) {
      result = value + result;
    }

    int getLValue = (int) hashmapForWord.get('l');
    int getOValue = (int) hashmapForWord.get('o');

    int numOfBallon = 0;
    if (result < 743 ) {
      numOfBallon = 0;
    } else if (result >= 743 && ( getLValue >= 2 * getMin) && (getOValue >= 2 * getMin)) {
      numOfBallon = getMin / acsiValueOfKey;
    } else if (result > 743 && ((getLValue/108) / 2 < (getOValue/111) / 2)) {
      numOfBallon = (getLValue/108) / 2;
    } else {
      numOfBallon = (getOValue/111) / 2;
    }

    return numOfBallon;
  }

}
