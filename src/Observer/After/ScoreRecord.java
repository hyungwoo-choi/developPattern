package Observer.After;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
    private List<Integer> scores = new ArrayList<Integer>();
    public void addScore(int score){
        scores.add(score); // 점수를 리스트형태로 저장한다.
        nofityObservers(); // 각 옵저버들에게 업데이트하라고 지시하는 것
    }
    public List<Integer> getScoreRecord(){
        return scores;
    }

}
