package model.review.chain_of_responsibility;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-09 22:39
 **/
public class ThirdGrade extends  Grade{
    public ThirdGrade(Grade grade) {
        this.nextGrade = grade;
    }

    @Override
    public void handle(String src) {
        int length = src.length();
        if (length > 20 && nextGrade != null) {
            System.out.println("third grade : not my business");
            nextGrade.handle(src);
        } else if (length > 20 && nextGrade == null) {
            System.out.println("OK OK OK");
        } else {
            System.out.println("done-> " + src.toUpperCase());
        }
    }
}