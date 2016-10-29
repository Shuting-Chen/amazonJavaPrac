import java.util.ArrayList;
import java.util.*;

public class LetterCombinations {
	public List<String> letterCombinations(String digits) {
        //java里面用list对的吧，反正那个是明天才有的么。。反正没有几道题目了，剩下的题目他们自己弄吧，我就不参与了好的吧。
        //use a list as a vector to store the things there.
        List<String> result=new ArrayList<String>();
        if(digits.length()==0)
        {
            return result;
        }
        
        String[] keyboard={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};//把所有backtracking的内容转录到java里面吧，感谢春
        
        //估计返回接口从以前的那个位置到现在的那个位置，都是需要哪个啥的吧。。
         //use the arrayList but refer to the List and return the List.
        StringBuilder current=new StringBuilder();
        
        int idx=0;
        buildResult(digits,0,current , keyboard , result);//this string 固定的，用string,
        return result;
        
        
    }
    
    //every method has a input and output, then everytime I can get the ..
    private void buildResult(String digits,int idx, StringBuilder current, String[] keyboard,List<String> result) //list是list, string是string, stringbuilder是stringbuilder.
    {
        if(idx==digits.length())
        {
            result.add(current.toString());
            return;
        }
        int num=digits.charAt(idx)-'0';//how to change from the char to number? use-'0'别忘了。然后这些高级语言就会翻译成低级语言去执行好的吧。。
        //Just 健身，加油。。。
        
        for(int i=0;i<keyboard[num-2].length();i++) //那他就是一，反正不会出现0的吧，最后的时间里面，去吃好喝好的吧。。数组.length, str.length().写的时候注意点，知道what am I writing>_<
        {
            current.append( keyboard[num-2].charAt(i) );
            buildResult(digits,idx+1,current,keyboard, result);
            current.deleteCharAt(current.length()-1); //this stringbuilder is like string, use length()-1..
            
        }
        
    }

}
