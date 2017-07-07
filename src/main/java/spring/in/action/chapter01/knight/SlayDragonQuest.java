package spring.in.action.chapter01.knight;

import java.io.PrintStream;

/**
 * Created by mengshuang on 2017/7/6.
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
