import java.util.Scanner;

public class Player extends Joiner{

    public Player() {
    }

    //获取玩家名称
    public void play_name(){
        System.out.println("请输入玩家名称：");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        this.setName(player);
    }

    //游戏模式的选择
    public void game_mode(){
        System.out.println("------------------模式选择------------------");
        System.out.println("1.一局决胜负   2.三局两胜   3.五局三胜");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        //定义一个数组用来存放选项
        int[] mode = {1,3,5};
        //buer类型用来判断
        boolean flag = false;

        //for循环判断用户输入是否是1-3，否则则提示用户重新选择
        for (int i = 0;i < 3;i++){
            if((option-1) == i){
                flag = true;
                option = mode[i];
                break;
            }
        }
        if (flag){
            this.setOption(option);
        }else {
            System.out.println("请选择对战模式：");
            this.game_mode();
        }

    }


    //获取玩家出拳结果
    public void player_choice(){
        //玩家重下面选择想要出的拳
        System.out.println("1-----剪刀");
        System.out.println("2-----石头");
        System.out.println("3-----布");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        try{
            //玩家输入1-3，则将输入结果记录下来
            this.setChoice_name(choice);
        }catch (Exception e){
            //否则将随机生成1-3之间任意数字
            this.setChoice_name((int)(Math.random()*3+1));
        }

    }
}
