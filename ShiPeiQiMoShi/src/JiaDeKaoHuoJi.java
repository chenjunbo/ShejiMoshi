/**
 * Created by jackiechan on 16/1/27.
 */
public class JiaDeKaoHuoJi implements KaoHuoJi {
    private KaoYa kaoYa;

    public JiaDeKaoHuoJi(KaoYa kaoYa) {
        this.kaoYa = kaoYa;
    }

    @Override
    public void kaofa() {
        kaoYa.kaofa();
    }
}
