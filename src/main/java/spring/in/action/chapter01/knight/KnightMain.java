package spring.in.action.chapter01.knight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by mengshuang on 2017/7/6.
 */
public class KnightMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
