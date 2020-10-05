package work.class01.damo;

public class Students_damo01 {
    public static void main(String[] args) {
        Students x1 = new Students();
        Students x2 = new Students();
        Students x3 = new Students();
        Students x4 = new Students();
        Students x5 = new Students();
        Students x6 = new Students();
        x1.mod1("hxl");
        x2.mod1("dsl");
        x1.height = 1.76;
        if (x1.height < 1.0) {
            System.err.println("输入错误！");
        }


    }
}
