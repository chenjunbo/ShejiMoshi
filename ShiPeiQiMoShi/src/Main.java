/**
 * Created by jackiechan on 16/1/27.
 * 适配器模式, 我们需要一个什么类型的,但是实际上却没有,我们有另外一种和它差不多 也能实现差不多功能的类型
 * 我们伪装一个我们需要的类型,在代码中实现或者继承(推荐使用实现,防止出现多继承)我们需要的类型
 * 在这个伪装的类型中 声明一个功能差不多的类型的变量,然后通过构造方法传递进来
 * 在我们实际的使用中,调用的方法.内部实现其实是调用差不多功能的类型的对应的方法
 * 外观模式 ,一个类型中有很多功能或者方法,你需要一个一个调用,太繁琐
 * 我们额外再提供一个方法,将上述的方法全部集合到内部,只调用这一个即可
 */
public class Main {

    public static void main(String[] args) {
        GanEnJieKaoHuoJi ganEnJieKaoHuoJi = new GanEnJieKaoHuoJi();
        BeijingKaoya beijingKaoya = new BeijingKaoya();
        JiaDeKaoHuoJi jiaDeKaoHuoJi = new JiaDeKaoHuoJi(beijingKaoya);
        ganEnJieKaoHuoJi.kaofa();
        jiaDeKaoHuoJi.kaofa();
    }
}
