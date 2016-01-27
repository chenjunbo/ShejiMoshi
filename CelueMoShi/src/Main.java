/**
 * Created by jackiechan on 16/1/27.
 *
 */
public class Main {
    public static void main(String[] args) {
        ZhouHeiya zhouHeiya = new ZhouHeiya(new NoFly(),new BuhuiJiao());
        XiangPiYa xiangPiYa = new XiangPiYa(new HuojianJiaSuQi(), new BuhuiJiao());
        Changjiang7Hao changjiang7Hao = new Changjiang7Hao(new FlyWithSwings(), new MieMieJiao());
        zhouHeiya.jiao();
        zhouHeiya.fly();
        System.out.println("----");
        xiangPiYa.fly();
        xiangPiYa.jiao();
        System.out.println("===");
        changjiang7Hao.fly();
        changjiang7Hao.jiao();
        YingTaoGuYa yingTaoGuYa = new YingTaoGuYa(new FlyWithSwings(), new BuhuiJiao());
        System.out.println("===");
        yingTaoGuYa.jiao();
        yingTaoGuYa.fly();
        System.out.println("===----");
        yingTaoGuYa.setJiaoInterface(new GuaGuaJiao());
        yingTaoGuYa.jiao();
    }
}
