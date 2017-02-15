import java.util.*;
import java.io.*;
import java_cup.runtime.*;  // defines Symbol

/**
 * This program is to be used to test the Scanner.
 * This version is set up to test all tokens, but more code is needed to test 
 * other aspects of the scanner (e.g., input that causes errors, character 
 * numbers, values associated with tokens)
 */
public class P2 {
    public static void main(String[] args) throws IOException {
                                           // exception may be thrown by yylex
        // test all tokens
        testAllTokens();
        CharNum.num = 1;
    
        // ADD CALLS TO OTHER TEST METHODS HERE
    }

    /**
     * testAllTokens
     *
     * Open and read from file allTokens.txt
     * For each token read, write the corresponding string to allTokens.out
     * If the input file contains all tokens, one per line, we can verify
     * correctness of the scanner by comparing the input and output files
     * (e.g., using a 'diff' command).
     */
    private static void testAllTokens() throws IOException {
        // open input and output files
        FileReader inFile = null;
        PrintWriter outFile = null;
        try {
            inFile = new FileReader("allTokens.in");
            outFile = new PrintWriter(new FileWriter("allTokens.out"));
        } catch (FileNotFoundException ex) {
            System.err.println("File allTokens.in not found.");
            System.exit(-1);
        } catch (IOException ex) {
            System.err.println("allTokens.out cannot be opened.");
            System.exit(-1);
        }

        // create and call the scanner
        Yylex scanner = new Yylex(inFile);
        Symbol token = scanner.next_token();
        while (token.sym != sym.EOF) {
            switch (token.sym) {
            case sym.BOOL:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"bool");
                break;
			case sym.INT:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"int");
                break;
            case sym.VOID:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"void");
                break;
            case sym.TRUE:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"true");
                break;
            case sym.FALSE:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"false");
                break;
            case sym.STRUCT:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"struct");
                break;
            case sym.CIN:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"cin");
                break;
            case sym.COUT:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"cout");
                break;
            case sym.IF:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"if");
                break;
            case sym.ELSE:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"else");
                break;
            case sym.WHILE:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"while");
                break;
            case sym.RETURN:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"return");
                break;
            case sym.ID:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+((IdTokenVal)token.value).idVal);
                break;
            case sym.INTLITERAL:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+((IntLitTokenVal)token.value).intVal);
                break;
            case sym.STRINGLITERAL:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+((StrLitTokenVal)token.value).strVal);
                break;
            case sym.LCURLY:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"{");
                break;
            case sym.RCURLY:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"}");
                break;
            case sym.LPAREN:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"(");
                break;
            case sym.RPAREN:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+")");
                break;
            case sym.SEMICOLON:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+";");
                break;
            case sym.COMMA:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+",");
                break;
            case sym.DOT:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+".");
                break;
            case sym.WRITE:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"<<");
                break;
            case sym.READ:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+">>");
                break;
            case sym.PLUSPLUS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"++");
                break;
            case sym.MINUSMINUS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"--");
                break;
            case sym.PLUS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"+");
                break;
            case sym.MINUS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"-");
                break;
            case sym.TIMES:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"*");
                break;
            case sym.DIVIDE:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"/");
                break;
            case sym.NOT:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"!");
                break;
            case sym.AND:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"&&");
                break;
            case sym.OR:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"||");
                break;
            case sym.EQUALS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"==");
                break;
            case sym.NOTEQUALS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"!=");
                break;
            case sym.LESS:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"<");
                break;
            case sym.GREATER:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+">");
                break;
            case sym.LESSEQ:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"<=");
                break;
            case sym.GREATEREQ:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+">=");
                break;
			case sym.ASSIGN:
                outFile.println(((TokenVal)token.value).linenum+":"+((TokenVal)token.value).charnum+":"+"=");
                break;
			default:
				outFile.println("UNKNOWN TOKEN");
            } // end switch

            token = scanner.next_token();
        } // end while
        outFile.close();
    }
}
