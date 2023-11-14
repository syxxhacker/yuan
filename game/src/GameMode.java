public class GameMode extends Judge{
    public GameMode() {
    }

    public void play_game(Player player, Computer computer, Judge judge){
        int i = 1;
        System.out.println("------------------开始对决------------------");
        while (i <= player.getOption()){
            System.out.println("                   第" + i + "轮                   ");
            //玩家出拳选择
            player.player_choice();
            //电脑出拳，随机生成
            computer.com_choice();
            //判断结果
            System.out.println("                  第" + i + "轮结果                   ");
            judge.winner(player,computer);
            i += 1;
        }
    }

    //一轮结束后由玩家选择是否继续进行游戏
    public void continue_game(Player player, Computer computer, Judge judge){
        //输出最后结果
        judge.last_winner();

        while (judge.continue_option < 3){
            switch (judge.continue_option){
                case 1:
                    player.game_mode();
                    this.play_game(player,computer,judge);
                    judge.last_winner();
                    break;
                case 2:
                    computer.computer_role();
                    player.game_mode();
                    play_game(player,computer,judge);
                    judge.last_winner();
                default:
                    System.out.println("正在退出.....");
            }
    }

    }

}
