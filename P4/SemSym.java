import java.util.*;


public class SemSym{
    private String type;
    private String retType = null;
    private List<String> parameters; 
    private HashMap<String,SemSym> fields;
    
    public SemSym(String type) {
        this.type = type;
    }

    public void setSym(String type) {
        this.type = type;
    }

    public void setSym(String retType, List<String> parameters) {
        this.retType = retType;
        this.parameters = parameters;
    }

    public void setSymList(String type, HashMap<String,SemSym> fields){
        this.type = type;
        this.fields = fields;
    }

    public HashMap<String,SemSym> getfields(){
        return fields;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        if(retType!=null){
            String params = "";
            try{
                if(parameters.size()!=0){
                    params = parameters.get(0);
                    for(int j=1;j<parameters.size();j++){
                        params=params+","+parameters.get(j);
                    }
                }else{
                    throw new NullPointerException();
                }  
            }catch (NullPointerException e){
            }
            params=params+"->"+retType;
            return params;
        }
        else{
            return type;
        }
    }
}
