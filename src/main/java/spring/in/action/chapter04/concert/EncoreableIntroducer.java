package spring.in.action.chapter04.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by mengshuang on 2017/7/10.
 */
@Aspect
public class EncoreableIntroducer {
    @DeclareParents(value = "spring.in.action.chapter04.concert.Performance+", defaultImpl = DefaultEncoreable.class )
    public static Encoreable encoreable;
}
