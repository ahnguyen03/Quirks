package cmput301f17t12.quirks.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Date;

import cmput301f17t12.quirks.Enumerations.Day;
import cmput301f17t12.quirks.R;

public class AddQuirkActivity extends AppCompatActivity {

    private String type;
    private String title;
    private Date startingDate;
    private String reason;
    private ArrayList<Day> occurence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quirk);
    }

    private void saveButtonClicked(){

    }

    private void cancelButtonClicked(){
    }

    private void occurenceItemSelected(Day day){
    }
    
}
