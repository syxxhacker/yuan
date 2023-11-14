import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        //调用类
        Player player = new Player();
        Computer computer = new Computer();
        Judge judge = new Judge();
        GameMode gameMode = new GameMode();

        //游戏界面
        System.out.println("-----------------------------------");
        System.out.println("           剪刀石头布         ");
        System.out.println("                    作者：萧萧");
        System.out.println("                    版本：1.0");
        System.out.println("-----------------------------------");
        System.out.println("------------------游戏开始------------------");

        //玩家输入名称
        player.play_name();
        //玩家选择电脑角色
        computer.computer_role();
        //游戏模式选择
        player.game_mode();
        //根据玩家选择的游戏模式，来输出多少次对决，while控制
        gameMode.play_game(player, computer, judge);
        //玩家选择是否继续进行游戏
        gameMode.continue_game(player, computer, judge);
    }
}
