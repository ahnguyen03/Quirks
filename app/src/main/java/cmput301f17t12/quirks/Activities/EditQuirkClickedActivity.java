package cmput301f17t12.quirks.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import cmput301f17t12.quirks.Enumerations.Day;
import cmput301f17t12.quirks.R;

public class EditQuirkClickedActivity extends AppCompatActivity {

    private String type;
    private String title;
    private String reason;
    private ArrayList<Day> occurence;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_quirk_clicked);
    }

    // TODO:
    // Save button clicked -> save changes made to quirk, return to previous activity
    private void saveButtonClicked(){

    }

    // TODO:
    // Cancel button clicked -> discard any changes made to the quirk, return to previous activity
    private void cancelButtonClicked(){

    }

    // TODO:
    // Delete button clicked -> delete quirk, return to previous screen
    private void deleteButtonClicked(){

    }

    // TODO:
    // Occurence item was selected, update the occurence ArrayList
    private void occurenceItemSelected(Day day){

    }

}
