package cs.lab;
import java.util.List;
import java.io.IOException;


public class Subject implements Observer{
    private int dataA;
    private int dataB;
    private int dataC;
    private int dataD;
    public void update(int dataA, int dataB, int dataC, int dataD) {
        this.dataA=dataA;
        this.dataB=dataB;
        this.dataC=dataC;
        this.dataD=dataD;
    }
    public void update(){};
    public void generategraphic(){};


}
