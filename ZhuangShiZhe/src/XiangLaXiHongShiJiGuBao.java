/**
 * Created by jackiechan on 16/1/27.
 */
public class XiangLaXiHongShiJiGuBao implements KeJiSuanJiaGe {
    private KeJiSuanJiaGe keJiSuanJiaGe;

    public XiangLaXiHongShiJiGuBao(KeJiSuanJiaGe keJiSuanJiaGe) {
        this.keJiSuanJiaGe = keJiSuanJiaGe;
    }


    @Override
    public int cost() {
        if (keJiSuanJiaGe != null) {
            return keJiSuanJiaGe.cost();
        }
        return 0;
    }
}
