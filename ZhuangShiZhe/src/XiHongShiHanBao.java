/**
 * Created by jackiechan on 16/1/27.
 */
public class XiHongShiHanBao {
    private HanBao hanBao;
    private XiHongShi xiHongShi;
    public int cost() {
        return hanBao.cost() + xiHongShi.cost();
    }
}
