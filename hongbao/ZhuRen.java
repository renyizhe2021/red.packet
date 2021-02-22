package LianXi.hongbao;

import java.util.ArrayList;

public class ZhuRen extends User {
    public ZhuRen(){}

    public ZhuRen(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> fa(int people,int mm){
        ArrayList<Integer> jj=new ArrayList<>();
        int a=getMoney();
        if (mm>a){
            System.out.println("余额不足，请充值！！！");
            return jj;
        }
        int w=mm/people;
        int s=mm%people;
        for (int i = 0; i <people- 1; i++) {
            jj.add(w);
        }
        jj.add(w+s);
        int h=a-mm;
        setMoney(h);
        return jj;
    }
}
