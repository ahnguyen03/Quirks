package cmput301f17t12.quirks.Activities;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import cmput301f17t12.quirks.Enumerations.Day;
import cmput301f17t12.quirks.R;

public class AddQuirkActivity extends AppCompatActivity {

    private static final String TAG = "AddQuirkActivity" ;
    private String type;
    private String title;
    private String goal;
    public static String date2;
    private Date startingDate;
    private String reason;
    private ArrayList<Day> occurence;
    private TextView SelectDate;
    private DatePickerDialog.OnDateSetListener SelectDateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_quirk);
        Button Save_but = (Button)findViewById(R.id.SaveBut);
        Button Cancel_but = (Button)findViewById(R.id.Cancelbut);

        SelectDate = (TextView)findViewById(R.id.textViewSelDate);

        //Need the date
        //Need the occurence

        SelectDate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Calendar cal  = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
               DatePickerDialog dialog = new DatePickerDialog(AddQuirkActivity.this, android.R.style.Theme_Holo_Dialog_MinWidth,SelectDateListener,year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

           }

        });
        SelectDateListener = new DatePickerDialog.OnDateSetListener(){
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                date2 = month + "/" + day + "/" + year;
                SelectDate.setText(date2);
                Log.d(TAG, "onDateSet: the date is now   " + date2);

            }
        };

    }

    // TODO:
    // Save button clicked -> create and save new quirk and return to the previous activity

    public void saveButtonClicked(View v){
        type = ((EditText)findViewById(R.id.editTextType)).getText().toString();
        title = ((EditText)findViewById(R.id.editTitle)).getText().toString();
        reason = ((EditText)findViewById(R.id.editTextReason)).getText().toString();
        goal = ((EditText)findViewById(R.id.editTextGoal)).getText().toString();
        if(type.equals("")||(title.equals(""))||(goal.equals(""))){

        }

        else {
            Log.d(TAG, "saveButtonClicked: the type is " + type + " the title is " + title + " the reason is " + reason);
            Log.d(TAG, "saveButtonClicked: the date after clicking save is  " + date2);
            Log.d(TAG, "saveButtonClicked: the goal value is " + goal);
            Intent intent = new Intent();
            intent.putExtra("Quirk_Type", type);
            intent.putExtra("Quirk_Title", title);
            intent.putExtra("Quirk_Reason", reason);
            intent.putExtra("Quirk_Date",date2);
            intent.putExtra("Quirk_Goal",goal);
            setResult(1, intent);
            finish();
        }

    }

    // TODO:
    // Cancel button clicked -> disregard selected options and return to the previous activity
    public void cancelButtonClicked(View v){
        Intent intent = new Intent(AddQuirkActivity.this,MainActivity.class);
    //    intent.putExtra("Cancel",1);
     //   setResult(1,intent);
        finish();
    }

    // TODO:
    // an occurence item was sl
    private void occurenceItemSelected(Day day){
    }

}
