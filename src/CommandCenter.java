import java.util.ArrayList;

public class CommandCenter {
    ICommand command;

    void Pressbutton(){

    }
    void setCommand(ICommand command){
        this.command = command;
    }


    private ArrayList<ISensor> listeners;


    public void falseAlarm(){

    }
    void addListeners(ISensor listener){
        listeners.add(listener);
    }
    void removeListeners(ISensor listener){
        listeners.remove(listener);
    }
}
