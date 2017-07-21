package spring.in.action.chapter04.concert;

/**
 * Created by mengshuang on 2017/7/10.
 */
public class DefaultEncoreable implements Encoreable{
    @Override
    public void performEncore() {
        System.out.println("default encoreable performEncore");
    }
}
