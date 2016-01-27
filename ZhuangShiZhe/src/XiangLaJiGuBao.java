/**
 * Created by jackiechan on 16/1/27.
 */
public class XiangLaJiGuBao {
    private HanBao hanBao;
    private JiGu jiGu;

    public int cost() {
        return hanBao.cost() + jiGu.cost();
    }
}
