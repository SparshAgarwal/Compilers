/*
* P1
*
* This class will test all the functions defined in classes SymTable and Sym
* which include getting the local and global symbols related to a string,
* adding and removing the hashmaps from the beginning of the list,
* adding desired hashmaps to the beginning of the list,
* checking for duplication and getting the exact type of a symbol*
*
* */
public class P1 {
    public static void main(String args[]) {
        SymTable symTable = new SymTable();
        // we will start with a new list symTable containing one empty hashmap
        symTable.print();
        //we will remove the empty hashmap(removeScope()) from
        // the list to have a empty list
        try {
            symTable.removeScope();
            //now in the empty list we will add a new hashmap
            // which has certain key and value
            symTable.addDecl(null, new Sym(null));
        } //though the key and values are null, EmptySymTableException will be
        // called first because it is defined first in the function declaration
        catch (EmptySymTableException e) {
            //since the list is empty, we will add a new empty
            // hashmap to the list
            symTable.addScope();
            try {
                //add a new element to the empty hashmap in the list
                symTable.addDecl(null, new Sym(null));
                //since null exception is called, next print command
                // will not be executed
                symTable.print();
            } catch (DuplicateSymException e1) {
            } catch (EmptySymTableException e1) {
            } catch (NullPointerException e1) {
                try {
                    //add valid key value hashmap pair in the list
                    symTable.addDecl("a", new Sym("int"));
                    //we will get a single hashmap in he list
                    symTable.print();
                } catch (DuplicateSymException e2) {
                } catch (EmptySymTableException e2) {
                }
            }
        } catch (DuplicateSymException e) {
        }
        try {
            //try to add the same key value hashmap pair again
            symTable.addDecl("a", new Sym("int"));
        }//DuplicateSymException will be called because of
        // duplication on first hashmap of list
        catch (DuplicateSymException e) {
            try {
                //now we will add another hashmap pair
                symTable.addScope();
                symTable.addDecl("b", new Sym("int"));
            } catch (DuplicateSymException e1) {
            } catch (EmptySymTableException e1) {
            }
        } catch (EmptySymTableException e) {
        }
        // by using lookupGlobal for a, as it is in second position
        //and by using lookupLocal for b, as it is first position
        //we will get their respective types and check them
        if (symTable.lookupGlobal("a").toString() == "int" &&
                symTable.lookupGlobal("b").getType() == "int") {
            //if the functions work and conditions are true, we will
            //get the whole list as output.
            symTable.print();
        }
    }
}
