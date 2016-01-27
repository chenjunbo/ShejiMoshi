/**
 * Created by jackiechan on 16/1/27.
 *
 * 肯打基豪华午餐有:香辣鸡骨堡 ,炸鸡骨,西红柿汉堡,千年鸡肉堡,地沟油炸烂地瓜
 * 此处省略...字,跟递归有点像
 *
 */
public class Main {
    public static void main(String[] args) {
        int xianglaxihongshijigubao = new XiHongShi(new JiGu(new HanBao(null))).cost();
        XiangLaXiHongShiJiGuBao xiangLaXiHongShiJiGuBao =new XiangLaXiHongShiJiGuBao(new XiHongShi(new JiGu(new HanBao(null))));
        int xihongshijigu = new JiGu(new XiHongShi(null)).cost();
        System.out.println(xianglaxihongshijigubao + "------" + xihongshijigu + "========" + xiangLaXiHongShiJiGuBao.cost());
    }
}
