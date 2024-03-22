package assignment.dictionary;

import java.util.Iterator;


/**
 * A class that will be used to display the lines of text that are corrected.
 *
 */

public class LinesToDisplay {

    public static final int LINES = 10;     // Display 10 lines
    private AList<Wordlet>[] lines;
    private int currentLine;

    /**
     * Constructor for objects of class LinesToDisplay
     */
    public LinesToDisplay() {
        lines = new AList[LINES];
        for(int i = 0; i<LINES; i++){
            lines[i] = new AList<Wordlet>();
        }
    }
    /**
     * Add a new wordlet to the current line.
     *
     */
    public void addWordlet(Wordlet w) {
        if(w != null){
            lines[currentLine].add(w);//adding the current line to the wordlet AList
        }
    }

    /**
     * Go to the next line, if the number of lines has exceeded LINES, shift
     * them all up by one
     *
     */
    public void nextLine() {
        /*
        if(currentLine >= LINES) {
            for (int i = 0; i < LINES; i++) {
                lines[i - 1] = lines[i];
            }

            lines[LINES -1] = new AList<Wordlet>();
            currentLine = LINES -1;
        }
*/ //this shit doesn't work im going to kms
    }
    public int getCurrentLine(){
        return currentLine;
    }
    
    public AList<Wordlet>[] getLines(){
        return lines;
    }
}
