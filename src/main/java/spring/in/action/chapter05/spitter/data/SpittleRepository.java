package spring.in.action.chapter05.spitter.data;


import spring.in.action.chapter05.spitter.entity.Spittle;

import java.util.List;

/**
 * Created by mengshuang on 2017/7/10.
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
