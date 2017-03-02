
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20140808 (SVN rev 54)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20140808 (SVN rev 54) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\002\000\002\004\003\000\002\004\003" +
    "\000\002\004\003\000\002\006\005\000\002\010\010\000" +
    "\002\011\004\000\002\011\003\000\002\025\003\000\002" +
    "\025\003\000\002\025\003\000\002\027\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\014\002\ufffe\004\ufffe\005\ufffe\006\ufffe\011" +
    "\ufffe\001\002\000\014\002\000\004\010\005\011\006\013" +
    "\011\012\001\002\000\004\002\006\001\002\000\004\002" +
    "\001\001\002\000\014\002\ufffd\004\ufffd\005\ufffd\006\ufffd" +
    "\011\ufffd\001\002\000\004\020\ufff6\001\002\000\004\020" +
    "\ufff5\001\002\000\004\020\020\001\002\000\004\020\ufff4" +
    "\001\002\000\004\020\020\001\002\000\014\002\uffff\004" +
    "\uffff\005\uffff\006\uffff\011\uffff\001\002\000\014\002\ufffc" +
    "\004\ufffc\005\ufffc\006\ufffc\011\ufffc\001\002\000\014\002" +
    "\ufffb\004\ufffb\005\ufffb\006\ufffb\011\ufffb\001\002\000\006" +
    "\023\ufff3\027\ufff3\001\002\000\004\027\022\001\002\000" +
    "\016\002\ufffa\004\ufffa\005\ufffa\006\ufffa\011\ufffa\024\ufffa" +
    "\001\002\000\004\023\024\001\002\000\010\004\010\005" +
    "\011\006\013\001\002\000\012\004\010\005\011\006\013" +
    "\024\030\001\002\000\012\004\ufff7\005\ufff7\006\ufff7\024" +
    "\ufff7\001\002\000\012\004\ufff8\005\ufff8\006\ufff8\024\ufff8" +
    "\001\002\000\004\027\031\001\002\000\014\002\ufff9\004" +
    "\ufff9\005\ufff9\006\ufff9\011\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\027\000\006\002\004\003\003\001\001\000\014\004" +
    "\014\006\006\007\015\010\016\025\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\027\022\001\001\000\002" +
    "\001\001\000\004\027\020\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\006" +
    "\025\011\024\025\013\001\001\000\006\006\026\025\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public void syntax_error(Symbol currToken) {
    if (currToken.value == null) {
        ErrMsg.fatal(0,0, "Syntax error at end of file");
    }
    else {
        ErrMsg.fatal(((TokenVal)currToken.value).linenum,
                     ((TokenVal)currToken.value).charnum,
                     "Syntax error");
    }
    System.exit(-1);
}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ProgramNode start_val = (ProgramNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= declList 
            {
              ProgramNode RESULT =null;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		LinkedList d = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new ProgramNode(new DeclListNode(d));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declList ::= declList decl 
            {
              LinkedList RESULT =null;
		int dlleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int dlright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList dl = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int dright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DeclNode d = (DeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 dl.addLast(d);
                   RESULT = dl;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("declList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declList ::= 
            {
              LinkedList RESULT =null;
		 RESULT = new LinkedList<DeclNode>();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("declList",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // decl ::= varDecl 
            {
              DeclNode RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode v = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = v;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // decl ::= fnDecl 
            {
              DeclNode RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		FnDeclNode f = (FnDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = f;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // decl ::= structDecl 
            {
              DeclNode RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		StructDeclNode s = (StructDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = s;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // varDecl ::= type id SEMICOLON 
            {
              VarDeclNode RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		TypeNode t = (TypeNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		IdNode i = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new VarDeclNode(t, i, VarDeclNode.NOT_STRUCT);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("varDecl",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // structDecl ::= STRUCT id LCURLY structBody RCURLY SEMICOLON 
            {
              StructDeclNode RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		IdNode i = (IdNode)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int sBleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int sBright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		LinkedList sB = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 RESULT = new StructDeclNode(i,new DeclListNode(sB));
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("structDecl",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // structBody ::= structBody varDecl 
            {
              LinkedList RESULT =null;
		int sBleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sBright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		LinkedList sB = (LinkedList)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode v = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 sB.addLast(v);
                   RESULT = sB;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("structBody",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // structBody ::= varDecl 
            {
              LinkedList RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		VarDeclNode v = (VarDeclNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 LinkedList sB = new LinkedList<DeclNode>();
                   sB.add(v);
                   RESULT = sB;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("structBody",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // type ::= INT 
            {
              TypeNode RESULT =null;
		 RESULT = new IntNode();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // type ::= BOOL 
            {
              TypeNode RESULT =null;
		 RESULT = new BoolNode();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // type ::= VOID 
            {
              TypeNode RESULT =null;
		 RESULT = new VoidNode();
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("type",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // id ::= ID 
            {
              IdNode RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		IdTokenVal i = (IdTokenVal)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IdNode(i.linenum, i.charnum, i.idVal);
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("id",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
