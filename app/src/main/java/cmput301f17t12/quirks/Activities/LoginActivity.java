package cmput301f17t12.quirks.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cmput301f17t12.quirks.R;

public class LoginActivity extends AppCompatActivity {
    private String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void loginUser(){
    }

    //Need to check, is signing up new users in the spec??
    private void signUpUser(){
    }
    
}
