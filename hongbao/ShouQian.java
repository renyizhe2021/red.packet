package LianXi.hongbao;

import java.util.ArrayList;
import java.util.Random;

public class ShouQian extends User {
    public ShouQian (){}

    public ShouQian(String name,int money){
        super(name,money);
    }
    public void shouqian(ArrayList<Integer> i){
        int s=super.getMoney();
        Random jj=new Random();
        int a=jj.nextInt(i.size());
        int ss=i.remove(a);
        super.setMoney(s+ss);
    }
}
