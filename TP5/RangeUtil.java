package TP5;

public class RangeUtil {
    public int start;
    public int end;
    public int step;

    public RangeUtil(int start,int end,int step){
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public String toString(){
        String str="";
        if(start<end){
            while(start<=end){
                str= str + " " + Integer.toString(start);
                start+=step;
            }
        }else{
            while(start>=end){
                str= str + " " + Integer.toString(start);
                start-=step;
            }
        }
        return str;
    }
 }
