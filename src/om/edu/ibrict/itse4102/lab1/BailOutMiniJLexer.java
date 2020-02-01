/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package om.edu.ibrict.itse4102.lab1;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;


/**
 *
 * @author ispace
 */
public class BailOutMiniJLexer extends MiniJLexer {
    
    public BailOutMiniJLexer(CharStream input) {
        super(input);
    }
    
    @Override
    public void recover(LexerNoViableAltException e) {
        throw new RuntimeException(e);
    }
    
}
