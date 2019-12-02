package org.ladbury.eds;
// import ANTLR's runtime libraries

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.ladbury.eds.gen.*;

public class Main
{

    public static void main(String[] args) throws Exception
    {
        // write your code here
        // create a CharStream that reads from standard input
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        } else System.exit(1);
        if (inputFile != null) {                                        // Valid input file found in parameters
            System.out.printf("Input file: %s\n", inputFile);
            CharStream input = CharStreams.fromFileName(inputFile);
            ElecDevSigLexer lexer = new ElecDevSigLexer(input);         // create a lexer that feeds off of input CharStream
            CommonTokenStream tokens = new CommonTokenStream(lexer);    // create a buffer of tokens pulled from the lexer
            ElecDevSigParser parser = new ElecDevSigParser(tokens);     // create a parser that feeds off the tokens buffer
            ParseTree tree = parser.init(); // begin parsing at init rule
            ParseTreeWalker walker = new ParseTreeWalker();             // Create a generic parse tree walker that can trigger callbacks
            walker.walk(new ElecDevSig(), tree);                        // Walk the tree created during the parse, trigger callbacks
            System.out.println(); // print a \n after translation
        } else System.exit(1);
    }
}
