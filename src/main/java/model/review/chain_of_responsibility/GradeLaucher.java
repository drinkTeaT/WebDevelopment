package model.review.chain_of_responsibility;

/**
 * @Description：责任链开始了，不一定要处理掉
 * @Author： Administrator
 * @Date： 2019-05-09 22:37
 **/
public class GradeLaucher {
    public static void main(String[] args) {
        Grade thirdGrade = new ThirdGrade(null);
        Grade secondGrade = new SecondGrade(thirdGrade);
        Grade topGrade = new TopGrade(secondGrade);
        // 开始
        String srcString = "sdsdsd234234234sdsdsdsdsdfe";
        topGrade.handle(srcString);
    }
}
