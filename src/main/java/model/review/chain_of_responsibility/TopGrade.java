package model.review.chain_of_responsibility;

/**
 * @Description：
 * @Author： Administrator
 * @Date： 2019-05-09 22:26
 **/
public class TopGrade extends Grade {
    public TopGrade(Grade grade) {
        this.nextGrade = grade;
    }

    @Override
    public void handle(String src) {
        int length = src.length();
        if (length > 5 && nextGrade != null) {
            System.out.println("top grade : not my business");
            nextGrade.handle(src);
        } else if (length > 5 && nextGrade == null) {
            System.out.println("OK OK OK");
        } else {
            System.out.println("done-> " + src.toUpperCase());
        }
    }
}
