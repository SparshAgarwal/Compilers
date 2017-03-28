public class SemSym {
    private String type;
    private String retType;
    private List<String> parameters; 
    private List<String> fields;
    
    public SemSym(String type) {
        this.type = type;
    }

    public SemSym(String retType, List<String> parameters) {
        this.reType = reType;
        this.parameters = parameters;
    }

    public SemSym(List<Strings> fields){
        this.fields = fields;
    }

    public List<String> getfields(){
        return fields;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        if(reType){
            String params;
            try{
                if(parameters.size()!=0){
                    params = parameters[0];
                    for(int j=1;j<parameters.size();j++){
                        params=params+","+parameters[j];
                    }
                }else{
                    throw new NullPointerException();
                }  
            }
            params=params+"->"+retType;
            return params;
        }
        else{
            return type;
        }
    }
}
