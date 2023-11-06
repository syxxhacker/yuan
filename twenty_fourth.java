import java.util.Scanner;

public class twenty_fourth {
    public static void main(String[] args) {
        //定义全局变量
        int num1;      //电脑给出的随机数
        int num2;      //电脑给出的随机数
        int num3;      //电脑给出的随机数
        int num4;      //电脑给出的随机数
        int sum = 0;   //总数
        int num5 = 0;  //运算数字：用来接收电脑的随机数
        int num6 = 0;  //运算数字：用来接收电脑的随机数
        int sum_one = 0;  //用来接收第一次结果的值
        String a = "";  //接收运算符

        System.out.println("--------------------游戏界面--------------------");
        //电脑随机给出4个数
        num1 = (int)Math.round(Math.random()*9 + 1);
        num2 = (int)Math.round(Math.random()*9 + 1);
        num3 = (int)Math.round(Math.random()*9 + 1);
        num4 = (int)Math.round(Math.random()*9 + 1);
        //输出这4个数
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println("让我看看你的高见：");
        System.out.println("1.我算出来了！展示思路");
        System.out.println("2.我算不出来！这题无解");

        Scanner input = new Scanner(System.in);
        String player_option = input.next();

        //判断玩家的选择
        switch (player_option){
            case "1":
                //一共只有4个数字，数字不能重复使用，运算符可以重复使用，所以必须且只能运算三次，所以，利用for循环来控制运算次数
                for (int i = 1;i <= 3; i++) {
                    System.out.println("第" + i + "次运算：");
                    //定义一个string类型来接受玩家输入的数字
                    String option_one = input.next();
                    //用option_1将玩家输入的string类型的数字转换为整形
                    int option_1 = Integer.parseInt(option_one);

                    //判断玩家输入的数字是否为电脑随机给出的四个数，如果是，则将玩家输入的数字赋值给运算数字
                    if (option_1 == num1) {
                        num5 = num1;
                    } else if (option_1 == num2) {
                        num5 = num2;
                    } else if (option_1 == num3) {
                        num5 = num3;
                    } else if (option_1 == num4) {
                        num5 = num4;
                    }
                    //当i=2的时候，也就是玩家已经将第一次的结果计算出来了，但是第一次的结果是可以用来进行后面的运算的，并且也是只能用一次，
                    //所以，当玩家在第二次输入时，如果输入的是第一次运算的结果，那么将其赋值给运算数字。
                    if (i == 2) {
                        if (option_1 == sum) {
                            num5 = sum;
                        }
                        //i=3时，和上面解释同理，但是第三次有可能用到第一次结果的值，所以，sum_one就是第一次结果的值，
                        //如果玩家输入第一次结果的值，会将sum_one的值赋值给运算数字，输入第二次结果的值时，会将sum的值赋值给运算数字，
                        //其中，sum是第二次结果的值
                    } else if (i == 3) {
                        if (option_1 == sum_one) {
                            num5 = sum_one;
                        }else if(option_1 == sum){
                            num5 = sum;
                        }
                    }
                    //以上是输入第一位数的时候的解释

                    a = input.next();

                    //以下是输入第二位数，解释同上
                    String option_two = input.next();
                    int option_2 = Integer.parseInt(option_two);
                    if (option_2 == num1) {
                        num6 = num1;
                    } else if (option_2 == num2) {
                        num6 = num2;
                    } else if (option_2 == num3) {
                        num6 = num3;
                    } else if (option_2 == num4) {
                        num6 = num4;
                    }
                    if (i == 2) {
                        if (option_2 == sum) {
                            num6 = sum;

                        }
                    } else if (i == 3) {
                        if (option_2 == sum_one) {
                            num6 = sum_one;
                        }else if(option_2 == sum){
                            num6 = sum;
                        }
                    }

                    //输入的两个数会赋值给num5和num6，在switch里面进行计算
                    switch (a) {
                        case "+":
                            sum = num5 + num6;
                            break;
                        case "-":
                            sum = num5 - num6;
                            break;
                        case "*":
                            sum = num5 * num6;
                            break;
                        case "/":
                            sum = num5 / num6;
                            break;
                    }


                    switch (i){
                        case 1:
                            System.out.println("第1次结果：" + num5 + a + num6 + "=" + sum);
                            //第一次计算出来的结果用sum接收，但是进行第二次的时候，sum值会变成第二次的计算结果的值，
                            //也就是说，第三次运算如果要用第一次运算结果的值的时候，第一次结果的值是没有的，所以，
                            //用一个sum_one来接收第一次结果的值，这样第二次结果的值就不会影响到第一次结果的值
                            sum_one = sum;
                            break;
                        case 2:
                            System.out.println("第2次结果：" + num5 + a + num6 + "=" + sum);
                            break;
                        case 3:
                            System.out.println("第3次结果：" + num5 + a + num6 + "=" + sum);
                            break;
                    }
                }

                //判断用户最终结果是否等于24
                System.out.println("-------------------结果-------------------");
                if(sum == 24){
                    System.out.println("算出来了，你真厉害！");
                }else {
                    System.out.println("算错啦，下次认真思考哦！");
                }
                break;
            case "2":
                System.out.println("正在退出....");
        }

    }
}

