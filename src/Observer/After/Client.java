package Observer.After;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);
        AverageScoreView averageScoreView = new AverageScoreView(scoreRecord);

        scoreRecord.attach(dataSheetView3);
        scoreRecord.attach(dataSheetView5);
        scoreRecord.attach(minMaxView);
        scoreRecord.attach(averageScoreView);

        for (int i = 1; i <= 5; i++) {
            int score = i * 10 ;
            System.out.println("adding" + score);
            scoreRecord.addScore(score);
        }
    }
}
