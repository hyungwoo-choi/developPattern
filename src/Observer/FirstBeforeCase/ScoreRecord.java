package Observer.FirstBeforeCase;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<Integer>();
    private DataSheetView dataSheetView;

    public void setDataSheetView(DataSheetView dataSheetView){
        this.dataSheetView = dataSheetView;
    }
    public void addScore(Integer score){
        scores.add(score);
        dataSheetView.update();
    }
    public List<Integer> getScoreRecord(){
        return scores;
    }
}
