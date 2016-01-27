import java.util.ArrayList;
import java.util.List;

/**
 * Created by jackiechan on 16/1/27.
 *
 *
 * 被观察者 因为经常会出现数据变化,而观察者又经常出现数量的变化,按照以往思路,应该在被观察者中将观察者声明出来,然后变化的时候调用观察者的方法
 * 但是上面的方式,当观察者发生变化的时候,被观察者的源代码就必须修改,这样耦合性非常非常高,费代码特别多
 * 要用观察者模式
 *  观察者模式中, 所有的观察者实现一个特定的接口,然后在被观察者中声明一个静态集合,泛型就是接口, 然后提供一个注册和取消注册的方法,方法参数为一个接口对象,
 *  调用方法的时候从集合中添加或者移除对应的对象
 *  当变化的方法执行的时候  遍历整个集合,获取到所有的观察者,然后调用对应的方法
 */
public class BeiGuanChaZhe {
    //属于数据的原始类
//    private  String s;//这个数据经常会变化
    //    private GuanA guanA;
//    private GuanB guanB;
//    private GuanC guanC;
//    private GuanD guanD;
//    private GuanChaJieKou guanChaJieKou;
    private static List<GuanChaJieKou> guanChaJieKous = new ArrayList<GuanChaJieKou>();



    public static  void setS(String s) {//代表数据发生变换了
//        guanA.change(s);
//        guanB.change(s);
//        guanD.change(s);
//        guanC.change(s);
//        guanChaJieKou.change(s);
        for (int i = 0; i < guanChaJieKous.size(); i++) {
            GuanChaJieKou guanChaJieKou = guanChaJieKous.get(i);
            if (guanChaJieKou != null) {
                guanChaJieKou.change(s);
            }
        }
    }

    public static void regist(GuanChaJieKou guanChaJieKou) {
        guanChaJieKous.add(guanChaJieKou);
    }

    public static void unRegist(GuanChaJieKou guanChaJieKou) {
        guanChaJieKous.remove(guanChaJieKou);
    }
}
