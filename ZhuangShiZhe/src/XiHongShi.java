/**
 * Created by jackiechan on 16/1/27.
 */
public class XiHongShi implements KeJiSuanJiaGe {
    private KeJiSuanJiaGe keJiSuanJiaGe;

    public XiHongShi(KeJiSuanJiaGe keJiSuanJiaGe) {
        this.keJiSuanJiaGe = keJiSuanJiaGe;
    }

    public int cost() {
        if (keJiSuanJiaGe != null) {
            return 100 + keJiSuanJiaGe.cost();
        }
        return 100;
    }
}
