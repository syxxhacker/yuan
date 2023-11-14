public class Joiner {
    private String name;
    private int choice_name;
    private int option;

    public Joiner(String name, int choice_name) {
        this.name = name;
        this.choice_name = choice_name;
    }

    public Joiner() {
    }


    //以下是构造函数
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChoice_name() {
        return choice_name;
    }

    public void setChoice_name(int choice_name) {
        this.choice_name = choice_name;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Joiner{" +
                "name='" + name + '\'' +
                ", choice_name=" + choice_name +
                ", option=" + option +
                '}';
    }
}
