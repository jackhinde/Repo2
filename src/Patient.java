public class Patient {

    private String name;
    private int status;
    
    public Patient(String n, int s){
        name = n;
        status = s;
    }
    
    public String getName(){
        return name;
    }
    
    public String getStatus(){
        if(status==0)
            return "Critical";
        else if(status==1)
            return "Serious";
        else if(status==2)
            return "Fair";
        else return "Patient was given an invalid status";
    }
    
}
