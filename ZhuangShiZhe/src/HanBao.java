/**
 * Created by jackiechan on 16/1/27.
 */
public class HanBao  implements KeJiSuanJiaGe{
    private KeJiSuanJiaGe keJiSuanJiaGe;

    public HanBao(KeJiSuanJiaGe keJiSuanJiaGe) {
        this.keJiSuanJiaGe = keJiSuanJiaGe;
    }

    public int cost() {
        if (keJiSuanJiaGe != null) {
            return 10 + keJiSuanJiaGe.cost();
        }
        return 10;
    }
}
