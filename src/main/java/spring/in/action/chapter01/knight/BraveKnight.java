package spring.in.action.chapter01.knight;

/**
 * Created by mengshuang on 2017/7/6.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }
    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}
