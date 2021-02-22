import java.util.ArrayList;

public class ShiYong {
    public static void main(String[] args){
        ZhuRen jj=new ZhuRen("lahsgl",100);
        ShouQian jk=new ShouQian("afsdf",20);
        ShouQian jjk=new ShouQian("afsdsdg",205);
        ArrayList<Integer> fa = jj.fa(2, 15);
        jj.count();
        jk.shouqian(fa);
        jjk.shouqian(fa);
        jk.count();
        jjk.count();
    }
}
