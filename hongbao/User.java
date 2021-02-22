package LianXi.hongbao;

public class User {
    private String name;
    private int  money;
    public User(){}
    public void count(){
        System.out.println(name+"的余额为："+money);
    }
    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
