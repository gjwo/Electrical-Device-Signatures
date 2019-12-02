package org.ladbury.eds;
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.ladbury.eds.gen.*;
public class Main {

    public static void main(String[] args)throws Exception {
	// write your code here
        // create a CharStream that reads from standard input
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        CharStream input = CharStreams.fromFileName("myfile.testlang");
        // create a lexer that feeds off of input CharStream
        ElecDevSigLexer lexer = new ElecDevSigLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        ElecDevSigParser parser = new ElecDevSigParser(tokens);
        ParseTree tree = parser.signatures(); // begin parsing at init rule
        // Create a generic parse tree walker that can trigger callbacks
        ParseTreeWalker walker = new ParseTreeWalker();
        // Walk the tree created during the parse, trigger callbacks
        walker.walk(new ElecDevSig(), tree);
        System.out.println(); // print a \n after translation
    }
}
