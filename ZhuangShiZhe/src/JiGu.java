/**
 * Created by jackiechan on 16/1/27.
 */
public class JiGu implements KeJiSuanJiaGe{
    private KeJiSuanJiaGe keJiSuanJiaGe;

    public JiGu(KeJiSuanJiaGe keJiSuanJiaGe) {
        this.keJiSuanJiaGe = keJiSuanJiaGe;
    }

    public int cost() {
        if (keJiSuanJiaGe != null) {
            return 102 + keJiSuanJiaGe.cost();
        }
        return 102;
    }
}
