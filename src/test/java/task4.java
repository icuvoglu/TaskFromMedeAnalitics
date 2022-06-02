import org.testng.annotations.Test;

public class task4 {
    @Test
    public void combineLetters(){
        String str1= "aa";
        String str2= "bb";
        String str3= "cc";
        String result="";

        for(int i=0; i<str1.length(); i++){
            result=result+str1.charAt(i)+str2.charAt(i)+str3.charAt(i);
        }
        System.out.println(result);
    }
}
