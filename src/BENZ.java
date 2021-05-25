/**
 * @author zcq
 * @data 2021/5/22 - 12:33
 */
public class BENZ extends Car implements ICar{
    public BENZ() {
        super();
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(getColor()+"颜色的奔驰正在运行");
    }

}
