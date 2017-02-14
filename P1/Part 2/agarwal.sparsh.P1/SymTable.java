import java.util.*;

/*
* This class is used by compiler to store information about all
* the identifiers in the instructions being compiled
* It contains a list of hashMaps, each of which will store identifiers
* defined in each scope when the program is compiled*
* */

public class SymTable {
    //Initialize the list of hashMaps
    private List<HashMap<String, Sym>> symTableList =
            new ArrayList<HashMap<String, Sym>>();

    //constructor to initialize the list with a empty hashMap
    //on creation of a list. Constructor does not need to have public scope
    SymTable() {
        symTableList.add(new HashMap<String, Sym>());
    }

    /*It is used to check if a identifier info can be stored in list,
    *if no hashMap exists then throw EmptySymTableException
    *if the info of identifier passed is empty the throw NullPointerException
    *throw DuplicateSymException if identifier already exists in first hashMap
    *if none of above then store the identifier info to first hashMap in list
    * */
    public void addDecl(String name, Sym sym) throws DuplicateSymException,
            EmptySymTableException, NullPointerException {
        if (symTableList.isEmpty()) {
            throw new EmptySymTableException();
        }
        if (sym == null || name == null) {
            throw new NullPointerException();
        }
        HashMap<String, Sym> firtsElement = symTableList.get(0);
        if (firtsElement.containsKey(name)) {
            throw new DuplicateSymException();
        } else {
            firtsElement.put(name, sym);
        }
    }

    /*
    * this function is used to add a new hasMap in beginning of list
    * to represent a new scope in the instructions being compiled
    * */
    public void addScope() {
        symTableList.add(0, new HashMap<String, Sym>());
    }

    /*
    * This function is used to look for a required identifier in the first
    * hashMap(present scope) of list, if present, its type(symbol) is returned
    * otherwise null is returned
    * if the list is empty then EmptySymTableException is thrown
    * */
    public Sym lookupLocal(String name) throws EmptySymTableException {
        if (symTableList.isEmpty()) {
            throw new EmptySymTableException();
        }
        HashMap<String, Sym> firtsElement = symTableList.get(0);
        if (firtsElement.containsKey(name)) {
            return firtsElement.get(name);
        } else {
            return null;
        }
    }

    /*
    * This function is used to look for a required identifier in any
    * hashMap(any scope) of list, if present, its type(symbol) is returned
    * otherwise null is returned
    * if the list is empty then EmptySymTableException is thrown
    * */
    public Sym lookupGlobal(String name) throws EmptySymTableException {
        if (symTableList.isEmpty()) {
            throw new EmptySymTableException();
        }
        for (HashMap<String, Sym> hashMap : symTableList) {
            if (hashMap.containsKey(name)) {
                return hashMap.get(name);
            }
        }
        return null;
    }

    /*
    * This function is used to remove the first hashMap (present scope)
    * from list if present, otherwise if the list is empty beforehand,
    * throw EmptySymTableException
    * */
    public void removeScope() throws EmptySymTableException {
        if (symTableList.isEmpty()) {
            throw new EmptySymTableException();
        } else {
            symTableList.remove(0);
        }
    }

    /*
    * This function is simply used to print identifier info stored
    * in each hashMap(scope) in the list
    * */
    public void print() {
        System.out.print("\nSym Table\n");
        for (HashMap<String, Sym> M : symTableList) {
            System.out.println(M.toString());
        }
        System.out.println("");
    }
}
