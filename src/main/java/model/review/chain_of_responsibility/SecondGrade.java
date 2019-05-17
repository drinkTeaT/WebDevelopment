package model.review.chain_of_responsibility;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-09 22:38
 **/
public class SecondGrade extends  Grade{
    public SecondGrade(Grade grade) {
        this.nextGrade = grade;
    }

    @Override
    public void handle(String src) {
        int length = src.length();
        if (length > 10 && nextGrade != null) {
            System.out.println("second grade : not my business");
            nextGrade.handle(src);
        } else if (length > 10 && nextGrade == null) {
            System.out.println("OK OK OK");
        } else {
            System.out.println("done-> " + src.toUpperCase());
        }
    }
}
