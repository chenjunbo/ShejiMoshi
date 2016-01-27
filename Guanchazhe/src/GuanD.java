/**
 * Created by jackiechan on 16/1/27.
 * 观察者类,它内部有一个接收的方法,当被观察者的数据发生变化的时候我要知道
 */
public class GuanD  implements GuanChaJieKou {
    public void change(String s) {
        //我收到数据了
        System.out.println("GuanD变化后的"+s);
    }
}
