import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class Main {
    static boolean isWord = false;
    static int counter = 0;
    static int wordLength;
    static String word;
    static char[] letters;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many letters should be in these words (negative numbers & 0 for random) >>>");
        wordLength = input.nextInt();
        Random rand = new Random();
        if (wordLength <= 0) {
            wordLength = rand.nextInt(10);
        }
        letters = new char[wordLength];

        while (!isWord) {
            for (int i = 0; i < wordLength; i++) {
                generate_character(i);
            }
            build_word(wordLength);

            counter++;
            System.out.println(word + " - " + counter);
            isWord = check_for_word(word);
//            System.out.println(isWord);
            if (isWord) {
                System.out.println("Found word at line: " + counter);
            }
        }
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




    public static void build_word(int arrayLength){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arrayLength; i++){
            sb.append(letters[i]);
            word = sb.toString();
        }
    }

    public static void generate_character(int i) {
        int index;
        Random rand = new Random();
        index = rand.nextInt(26) + 1;
//        System.out.print(index);
        switch(index){
            case 1: letters[i] = 'a'; break;
            case 2: letters[i] = 'b'; break;
            case 3: letters[i] = 'c'; break;
            case 4: letters[i] = 'd'; break;
            case 5: letters[i] = 'e'; break;
            case 6: letters[i] = 'f'; break;
            case 7: letters[i] = 'g'; break;
            case 8: letters[i] = 'h'; break;
            case 9: letters[i] = 'i'; break;
            case 10: letters[i] = 'j'; break;
            case 11: letters[i] = 'k'; break;
            case 12: letters[i] = 'l'; break;
            case 13: letters[i] = 'm'; break;
            case 14: letters[i] = 'n'; break;
            case 15: letters[i] = 'o'; break;
            case 16: letters[i] = 'p'; break;
            case 17: letters[i] = 'q'; break;
            case 18: letters[i] = 'r'; break;
            case 19: letters[i] = 's'; break;
            case 20: letters[i] = 't'; break;
            case 21: letters[i] = 'u'; break;
            case 22: letters[i] = 'v'; break;
            case 23: letters[i] = 'w'; break;
            case 24: letters[i] = 'x'; break;
            case 25: letters[i] = 'y'; break;
            case 26: letters[i] = 'z'; break;
            default: letters[i] = ' '; break;
        }
    }
}