import java.util.*;

/**
 * Created by sparsh on 1/25/2017.
 */
public class SymTable {
    private List<HashMap<String, Sym>> symTableList = new ArrayList<HashMap<String, Sym>>();

    public SymTable() {
        symTableList.add(new HashMap<String, Sym>());
    }

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

    public void addScope() {
        symTableList.add(0, new HashMap<String, Sym>());
    }

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

    public Sym lookupGlobal(String name) throws EmptySymTableException {
        if (symTableList.isEmpty()) {
            throw new EmptySymTableException();
        }
        for (HashMap<String, Sym> hashMap : symTableList) {
            // For each hashmap, iterate over it
            if (hashMap.containsKey(name)) {
                return hashMap.get(name);
            }
        }
        return null;
    }

    public void removeScope() throws EmptySymTableException {
        if (symTableList.isEmpty()) {
            throw new EmptySymTableException();
        } else {
            symTableList.remove(0);
        }
    }

    public void print() {
        System.out.print("\nSym Table\n");
        for (HashMap<String, Sym> M : symTableList) {
            System.out.println(M.toString());
        }
        System.out.println("");
    }
}
