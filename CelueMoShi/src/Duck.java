/**
 * Created by jackiechan on 16/1/27.
 * 一个鸭子类
 * <p/>
 * 策略模式,将不同的行为抽取出来,使行为和对象之间没有直接的联系,行为有具体的行为类,对象需要这个行为怎么办,将对应的行为类设置给它既可
 */
public class Duck {
    private FlyInterface flyInterface;
    private JiaoInterface jiaoInterface;

    public Duck(FlyInterface flyInterface, JiaoInterface jiaoInterface) {
        this.flyInterface = flyInterface;
        this.jiaoInterface = jiaoInterface;
    }

    public void setFlyInterface(FlyInterface flyInterface) {
        this.flyInterface = flyInterface;
    }

    public void setJiaoInterface(JiaoInterface jiaoInterface) {
        this.jiaoInterface = jiaoInterface;
    }

    public void fly() {
        if (flyInterface != null) {
            flyInterface.fly();
        }
    }
    public void jiao() {
        if (jiaoInterface != null) {
            jiaoInterface.jiao();
        }
    }

}
