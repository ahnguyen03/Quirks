package cmput301f17t12.quirks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by thomas on 2017-10-21.
 */

public class Quirk {
    private EventList events;
    private String title;
    private  String type;
    private String reason;
    private Date startDate;
    private ArrayList<Day> occDate;
    private float currValue;
    private float goalValue;

    public Quirk(EventList events, String title, String type, String reason,
                 Date startDate, ArrayList<Day> occDate, float currValue, float goalValue){
        this.events = events;
        this.title = title;
        this.type = type;
        this.reason = reason;
        this.startDate = startDate;
        this.occDate = occDate;
        this.currValue = currValue;
        this.goalValue = goalValue;
    }

    public void addEvent(Event event){
        events.addEvent(event);
    }

    public Event getEvent(int i){
        return events.getEvent(i);
    }

    public EventList getEventList(){
        return events;
    }

    public void removeEvent(Event event){
        events.removeEvent(event);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getReason(){
        return reason;
    }

    public void setReason(String reason){
        this.reason = reason;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startdate){
        this.startDate = startDate;
    }

    public ArrayList<Day> getOccDate(){
        return occDate;
    }

    public void setOccDate(ArrayList<Day> occDate){
        this.occDate = occDate;
    }

    public float getGoalValue(){
        return goalValue;
    }

    public void setGoalValue(float goalValue){
        this.goalValue = goalValue;
    }

    public float getCurrValue(){
        return currValue;
    }

    public void incCurrValue(){
        this.currValue += 1; // @TODO may need to adjust the increment value
    }

    public void resetCurrValue(){
        this.currValue = 0; // @TODO potentially change what this does
    }



}
