package model.review.bridge;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-29 8:17
 **/
public class ExtendHello implements ExtendDimension {
    TwoDimension twoDimension;
    public ExtendHello(TwoDimension twoDimension){
        this.twoDimension = twoDimension;
    }
    @Override
    public void walkingTo() {
        System.out.println("walking to tom");
        this.twoDimension.hear();
    }
}
