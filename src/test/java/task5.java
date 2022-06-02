import org.testng.Assert;
import org.testng.annotations.Test;


public class task5 {

    public int getVowel(String word){
        int sumofVowels=0;
        for(int i=0; i<word.length(); i++){
            switch (word.charAt(i)) {
                case 'a':
                    sumofVowels++;
                break;
                case 'e':
                    sumofVowels++;
                    break;
                case 'i':
                    sumofVowels++;
                    break;
                case 'o':
                    sumofVowels++;
                    break;
                case 'u':
                    sumofVowels++;
                    break;
            }


        }
        return sumofVowels;

    }

    @Test
    public void countVowels(){
        Assert.assertEquals(5,getVowel("abracadabra"),"Nope");
    }
}
