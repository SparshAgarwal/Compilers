/*
* This class is used to store information associated with each
* identifier(symbol)
* */
public class Sym {
    //declare the type(string) property of object symbol(Sym)
    private String type;

    /*This is a constructor so need not be defined as public,
    *and is used to initialize the type of symbol(identifier) as value passed
    * */
    Sym(String type) {
        this.type = type;
    }

    //Function to return type of identifier(symbol)
    public String getType() {
        return type;
    }

    /*
    * This function for now only returns the type of identifier(symbol)
    * as string, but later to be modified to return all other info  as well
    * */
    public String toString() {
        return type;
    }
}
