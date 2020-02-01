// FileName    : ListTokens.java
// Student ID  : <Your-ID>
// Student Name: <Your-Name>
package om.edu.ibrict.itse4102.lab1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author Duhai Alshukaili 
 * Take as input a file and list the tokens inside it.
 */
public class ListTokens {

    public static void main(String[] args) {

        String filePath;

        // get the file that we want to tokenize
        if (args.length == 0) {
            StdOut.print("Enter a file path to process: ");
            filePath = StdIn.readLine();
        } else {
            filePath = args[0];
        }

        StdOut.printf("Tokenizing %s\n\n", filePath);

        try {
            // create an file input stream to read from
            FileInputStream fis = new FileInputStream(new File(filePath));

            // create a character stream that we will pass to the lexer
            CharStream input = CharStreams.fromStream(fis);

            // create a lexer object that will tokenize the input
            MiniJLexer lexer = new MiniJLexer(input);

            // Uncomment this to try the BailOutMiniJLexer
            // BailOutMiniJLexer lexer = new BailOutMiniJLexer(input);
            // get the initial token
            Token token = lexer.nextToken();

            // loop until we reach the end of the file
            while (token.getType() != MiniJLexer.EOF) {

                // print the token text
                StdOut.printf("[Index=%d, Token='%s', Type=%s, line=%d]\n", 
                        token.getStartIndex(),
                        token.getText(),
                        getTokenType(token.getType()),
                        token.getLine());

                // get the next token
                token = lexer.nextToken();
            }

        } catch (IOException ex) {
            Logger.getLogger(ListTokens.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Return a string representing the type of the token
     *
     * @param tokenType An integer representing the token type
     * @return A string of the type of that token
     */
    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case MiniJLexer.ASSIGN:
                return "ASSIGN";
            case MiniJLexer.COMMA:
                return "COMMA";
            case MiniJLexer.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case MiniJLexer.IDENTIFIER:
                return "IDENTIFIER";
            default:
                return "OTHER";
        }
    }
}
