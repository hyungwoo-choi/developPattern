package Observer.After;

import java.util.List;

public class AverageScoreView implements Observer {
    private ScoreRecord scoreRecord;
    private int sum = 0;

    public AverageScoreView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update(){
        List<Integer> record = scoreRecord.getScoreRecord();
        displayScores(record, sum);
    }

    private void displayScores(List<Integer> record, Integer sum){
        for (int i = 0; i < record.size(); i++) {
            sum += record.get(i);
        }
        System.out.println("average is " + sum / record.size() );
    }
}
