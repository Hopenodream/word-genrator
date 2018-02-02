
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class test {

    public static void main(String[] args){
        System.out.println(check_for_word("climbing"));
    }

    public static boolean check_for_word(String word) {

        try{
            BufferedReader in = new BufferedReader(new FileReader("words.txt"));
            String str;
            while((str = in.readLine()) != null){
                if(word.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            in.close();
        } catch (IOException e) {
        }
        return false;
    }
}













