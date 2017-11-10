package cmput301f17t12.quirks.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Date;
import cmput301f17t12.quirks.*;
import cmput301f17t12.quirks.Models.*;

public class QuirksActivity extends AppCompatActivity {
    private QuirkList quirkList;
    private Date dateFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quirks);
    }

    // TODO:
    // Add a new quirk -> Call new add quirk activity
    public void addQuirkClicked(){
    }

    // TODO:
    // Edit an existing quirk -> Call new edit quirk activity
    public void editQuirkClicked(int position){
    }

    // TODO:
    // Get the events -> ? (Go to event activity??)
    public void getQuirkEventsClicked(){
    }

    // TODO:
    // Update the view -> Show quirks that fit the filter
    public void setFilterClicked(){

    }

}
