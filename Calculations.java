package myfirstapp;

public class Calculations {
    double numa;
    double numb;

    public Calculations(double numa, double numb) {
        this.numa = numa;
        this.numb = numb;
    }

    public Calculations() {
    }
    
    public Calculations(String numa, String numb)//convert string into double.
    {
        this.numa=Double.parseDouble(numa);
        this.numb=Double.parseDouble(numb);
    }

    public double getNuma() {
        return numa;
    }

    public double getNumb() {
        return numb;
    }

    public void setNuma(double numa) {
        this.numa = numa;
    }

    public void setNumb(double numb) {
        this.numb = numb;
    }
    
    public double Addition()
    {
        return numa+numb;
    }
}
