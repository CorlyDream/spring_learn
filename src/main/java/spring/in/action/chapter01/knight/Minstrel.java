package spring.in.action.chapter01.knight;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.PrintStream;

/**
 * Created by mengshuang on 2017/7/6.
 */
@Aspect
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }
    @Before("execution(* *.embarkOnQuest(..))")
    public void singBeforeQuest() {
        stream.println("Fa la la, the kngiht is so brave");
    }
    @After("execution(* *.embarkOnQuest(..))")
    public void singAfterQuest() {
        stream.println("Tee hee hee, the brave knight did emark on a quest !");
    }
}
