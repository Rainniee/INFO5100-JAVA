// Q1

package assignment8;

/**
 *
 * @author apple
 */

import java.io.IOException;
import java.util.Scanner;

public class FileCounter {
    
    private int characterCount, wordCount, lineCount;
    
    public FileCounter(){  
        characterCount=0;
        wordCount=0;
        lineCount=0;
    }
    
    /**
      Processes an input source and adds its character, word, and line
      counts to the respective variables.
      @param in the scanner to process
   */
    
    void read(Scanner in) throws IOException { // If read() is private, counter.read(fileIn) statement won't work
        StringBuilder sb = new StringBuilder();
	    while (in.hasNextLine()) {
		sb.append(in.nextLine());
		sb.append(" ");
		lineCount++;
            }
            String s = sb.toString().trim();
	    if (s.length() == 0)
		return;
            else
		wordCount++;
		for (int i = 0; i < s.length(); i++) {
		    if (s.charAt(i) != ' ')
			characterCount++;
		    else {
			if (s.charAt(i + 1) != ' ')
                            wordCount++;
                    }
                }
    }
    
    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }

}
