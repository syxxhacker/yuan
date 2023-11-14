import java.util.Scanner;

public class MyGoods {
    //定义全局变量，商品名，配送地址，商品数量，商品价格，这些都是私有变量，用this的话仅限本类使用，其他类想要使用必须使用get方法
    private  String name;
    private  String addr;
    private  int num;
    private  double price;

    //构造函数，虽然暂时未使用
    public MyGoods(String name,double price,String addr) {
        this.name = name;
        this.price = price;
        this.addr = addr;
    }

    //展示商品函数
    public void show(){
        //打印用户购买的商品信息，这个是在用户购买前打印的，用户确认信息是否有误
        System.out.println("---------------------------------------------------");
        System.out.println("购买的商品：" + this.name);
        System.out.println("商品单价" + this.price);
        System.out.println("配送地址：" + this.addr);

        System.out.println("---------------------------------------------------");
        System.out.println("请输入购买商品的数量：");
        Scanner input = new Scanner(System.in);
        while (true){
            try{
                this.num = input.nextInt();
                break;
            }catch (Exception e){
                System.out.println("你输入的商品数量有误，请重新输入：");
            }
        }

        System.out.println("---------------------------------------------------");
        System.out.println("1---立即购买");
        //购物车功能后续开发
        System.out.println("2---加入购物车");
        int option = input.nextInt();

        try{
            switch (option){
                case 1:
                    this.buy();
                    break;
                case 2:
                    this.add_shopcart();
                    break;
            }
        }catch (Exception e){
            this.buy();
        }
    }

    //点击购买函数
    public void buy(){
        this.make_order();
    }

    //加入购物车函数
    public void add_shopcart(){
        System.out.println("你将这件商品加入了购物车！");
    }

    //无参构造函数
    public MyGoods() {}

    //protected修饰，需要子类继承后进行重写
    protected void make_order(){ }

    //以下是get和set方法，放在代码最后，增加代码可读性
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int i) {
        this.num = i;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
