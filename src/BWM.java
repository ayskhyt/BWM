/**
 * @author zcq
 * @data 2021/5/22 - 12:27
 */
public class BWM extends Car implements ICar{
    public BWM() {
        super();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(getColor()+"颜色的宝马正在运行");
    }

}
