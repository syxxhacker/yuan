import java.util.Scanner;

public class Judge {
    private int result;
    private int player_score = 0;
    private int computer_score = 0;
    public int continue_option;

    public Judge(int result) {
        this.result = result;
    }

    public Judge() {
    }

    public void winner(Player player,Computer computer){
        String[] arr = {"剪刀","石头","布"};
        System.out.println("玩家\t" + player.getName() + "\t出：" + arr[player.getChoice_name()-1]);
        System.out.println("电脑\t" + computer.getName() + "\t出：" + arr[computer.getChoice_name()-1]);

        this.result = player.getChoice_name() - computer.getChoice_name();
//        String[] arr = {"平局","赢","输"};
        if (this.result == 1 || this.result == -2){
            this.player_score += 1;
            System.out.println("玩家获胜！目前得分为：" + this.player_score);

        }else if(this.result == -1 || this.result == 2){
            this.computer_score += 1;
            System.out.println("电脑获胜！目前得分为：" + this.computer_score);

        }else {
            System.out.println("平局！");
        }

    }

    //最后结果
    public void last_winner(){
        System.out.println("------------------游戏结果------------------");
        System.out.println("玩家最终得分为" + this.player_score + "分");
        System.out.println("电脑最终得分为" + this.computer_score + "分");

        if (this.player_score - this.computer_score > 0){
            System.out.println("玩家获得最终胜利！");
        }else if(this.player_score - this.computer_score < 0){
            System.out.println("电脑获得最终胜利！");
        }else {
            System.out.println("平局！");
        }

        System.out.println("------------------是否继续？------------------");
        System.out.println("1.继续，与同角色再来一轮！\n2.继续，重新选择角色对决！\n3.不玩了，退出游戏");
        Scanner scanner = new Scanner(System.in);
        continue_option = scanner.nextInt();
        this.player_score = 0;
        this.computer_score = 0;

    }


    //以下是get和set方法
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

}
