package model.review.bridge;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-29 8:13
 **/
public class BridgeLauncher {
    public static void main(String[] args) {
//        Onedimension onedimension = new OneBye();
        Onedimension onedimension = new OneHello();
        TwoDimension twoDimension = new TwoHello(onedimension);
        ExtendDimension extendDimension = new ExtendHello(twoDimension);
        extendDimension.walkingTo();
    }
}
