/**
 * Created by Администратор on 27.09.2016.
 */
import java.io.*;
import java.lang.*;

public class UnicodeNumberExtractor {
    public static void main(String[] args)throws IOException {
        Symbol smb = new Symbol();
        smb.printSymbolCode();
    }

    public static class Symbol {

        public void printSymbolCode() throws IOException {

            while(true) {

                System.out.println("Enter character, which Unocode index you want to know!");
                System.out.println("You can enter more than one character, but you will see only the first character`s index!");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String str = reader.readLine();
                char[] ch = str.toCharArray();
                System.out.println(Character.codePointBefore(ch, 1));
            }
        }
    }
}
