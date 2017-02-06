import java.util.*;

/**
 * Created by sparsh on 1/25/2017.
 */
public class SymTable {
    private List<HashMap<String,Sym>> symTableList = new ArrayList<HashMap<String, Sym>>();

    public SymTable(){
        symTableList.add(new HashMap<String,Sym>());
    }

    public void addDecl(String name, Sym sym) throws DuplicateSymException, EmptySymTableException, NullPointerException{
        if(symTableList.isEmpty()){
            throw new EmptySymTableException();
        }
        if (sym ==  null||name  ==  null){
            throw new NullPointerException();
        }
        HashMap<String,Sym> firtsElement   =    symTableList.get(0);
        if (firtsElement.containsKey(name)){
            throw new DuplicateSymException();
        }
        else {
            firtsElement   =   new HashMap<String, Sym>();
            firtsElement.put(name,sym);
            symTableList.set(0,firtsElement);
        }

    }

    public void addScope(){
        symTableList.add(0, new HashMap<String, Sym>());
    }

    public Sym lookupLocal(String name){
        try {
            if(symTableList.isEmpty()){
                throw new EmptySymTableException();
            }
        }catch (EmptySymTableException e) {
            e.printStackTrace();
        }
        HashMap<String,Sym> firtsElement   = symTableList.get(0);
        if (firtsElement.containsKey(name)){
            return firtsElement.get(name);
        }
        else {
            return null;
        }

    }

    public Sym lookupGlobal(String name){
        try {
            if(symTableList.isEmpty()){
                throw new EmptySymTableException();
            }
        }catch (EmptySymTableException e) {
            e.printStackTrace();
        }
        for (HashMap<String, Sym> hashMap : symTableList)
        {
            // For each hashmap, iterate over it
            for (Map.Entry<String, Sym> entry  : hashMap.entrySet())
            {
                if(entry.getKey() ==  name);
                return entry.getValue();
            }
        }
        return null;
    }

    public void removeScope() throws EmptySymTableException{
        if(symTableList.isEmpty()){
            throw new EmptySymTableException();
        }
        else {
            symTableList.remove(0);
        }
    }

    public void print(){
        System.out.print("\nSym Table\n");
        for (HashMap<String, Sym> M : symTableList)
        {
            System.out.println(M.toString());
        }
        System.out.println("");
    }
}
