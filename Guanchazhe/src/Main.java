/**
 * Created by jackiechan on 16/1/27.
 */
public class Main {
    public static void main(String[] args) {
        GuanA guanA = new GuanA();
        GuanB guanB = new GuanB();
        GuanC guanC = new GuanC();
        GuanD guanD = new GuanD();
        Guane guane = new Guane();
        BeiGuanChaZhe.regist(guanA);
        BeiGuanChaZhe.regist(guanB);
        BeiGuanChaZhe.regist(guanC);
        BeiGuanChaZhe.regist(guanD);
        BeiGuanChaZhe.regist(guane);
        BeiGuanChaZhe.setS("sdafsdaf");
//        beiGuanChaZhe.setS("dasdadasd");
        BeiGuanChaZhe.unRegist(guanD);
//        beiGuanChaZhe.setS("123124132");
        BeiGuanChaZhe.setS("786867586758");
		//大苏打大大缩短
    }
}
