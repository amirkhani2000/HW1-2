package Base;

public class Student {
    public float math;
    public float fizik;
    public float zaban;
    public float andishe;
    public float varzesh;

    public float average(){
           return (this.math+this.andishe+this.fizik+this.varzesh+this.zaban)/5;
    }
    public boolean cheack(){
        if(this.average()<12)
            return false;
        else
            return true;
    }


}
