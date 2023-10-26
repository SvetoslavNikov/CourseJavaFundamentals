package objectsAndClasses.Lab;

public class song {
    private String typeList;
    private String Name;
    private String Time;

    public song(String typeList, String Name, String Time){
        this.Name=Name;
        this.typeList=typeList;
        this.Time=Time;
    }

    public String getTypeList(){
        return typeList;
    }
    public String getName(){
        return Name;
    }
    public String getTime(){
        return Time;
    }


    public void setTime(String time){
        this.Time = time;
    }
    public void setName(String name){
        this.Name = name;
    }
    public void setTypeList(String type){
        this.typeList = type;
    }

}
