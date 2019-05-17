package model.review.chain_of_responsibility;

/**
 * @Description：责任链就是这么简单
 * @Author： Administrator
 * @Date： 2019-05-09 22:22
 **/
public abstract class Grade {
    protected Grade nextGrade;

    public abstract void handle(String src);
}
