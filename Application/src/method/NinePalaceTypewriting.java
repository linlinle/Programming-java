package method;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 手机的九宫格输入法中，输入数字的键位是可以和字母键位对应的。如“2”对应“ABC”，“9”对应“WXYZ”，现假设“1”和“0”为空字符，以此规则试设计一个程序，将单词用一串数字来进行表示。
 举例：
 输入：cat（不区分大小写）
 输出：228*/

public class NinePalaceTypewriting {
    /**
     * 利用字典实现
     * */


    public void lookupMap(String word){
        Map<String, String> typewritingMap = new HashMap<String, String>();
        {typewritingMap.put("abc","2");
        typewritingMap.put("def","3");
        typewritingMap.put("ghi","4");
        typewritingMap.put("jkl","5");
        typewritingMap.put("mno","6");
        typewritingMap.put("pqrs","7");
        typewritingMap.put("tuv","8");
        typewritingMap.put("wxyz","9");}
        for (int i=0;i<word.length();i++){
            for (String ke : typewritingMap.keySet()){
                if (ke.indexOf(word.charAt(i)) != -1) {
                    System.out.print(typewritingMap.get(ke));
                }
            }
        }
        System.out.println();
    }

    public void charConvertMath(String word){
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) < 's')
                System.out.print(((int)word.charAt(i)-97)/3+2);
            else if (word.charAt(i) > 's')
                System.out.print(((int)word.charAt(i)-97)/11+7);
            else
                System.out.print(7);
        }
        System.out.println();
    }

    public void searchArrayIndex(String word){
        String[] keyNumber = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i=0;i<word.length();i++){
            for (int j=0;j<keyNumber.length;j++)
                if (keyNumber[j].indexOf(word.charAt(i)) !=-1)
                        System.out.print(j+2);
        }
        System.out.println();
    }

    public static void main(String[] args){
        NinePalaceTypewriting NPT = new NinePalaceTypewriting();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        while (!word.equals(":wq")) {
            NPT.lookupMap(word);
            NPT.charConvertMath(word);
            NPT.searchArrayIndex(word);
            word = sc.nextLine().toLowerCase();
        }

    }

}
