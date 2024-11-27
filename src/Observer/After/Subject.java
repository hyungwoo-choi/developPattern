package Observer.After;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    public void attach(Observer observer){
        observers.add(observer); // 확인받고싶은 옵저버의 형태를 저장한다 리스트형태로
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void nofityObservers(){
        for (Observer o : observers) o.update();
    }
}
