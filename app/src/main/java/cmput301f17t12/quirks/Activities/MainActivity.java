package cmput301f17t12.quirks.Activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import cmput301f17t12.quirks.Adapters.NewsItemAdapter;
import cmput301f17t12.quirks.Helpers.BottomNavigationViewHelper;
import cmput301f17t12.quirks.Enumerations.Day;
import cmput301f17t12.quirks.Interfaces.Newsable;
import cmput301f17t12.quirks.Models.Event;
import cmput301f17t12.quirks.Models.Quirk;
import cmput301f17t12.quirks.R;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Newsable> newsitems = new ArrayList<>();
    private NewsItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.action_geomap:
                                // TODO:Part 5
                                break;
                            case R.id.action_social:
                                // TODO: Part 5
                                break;
                            case R.id.action_newquirk:
                                // TODO
                                break;
                            case R.id.action_quirklist:
                                // TODO
                                break;
                            case R.id.action_home:
                                // TODO
                                break;
                        }
                        return false;
                    }
                });

        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);

        // TODO: Get current user's newsable items.
        // Should be current user's + friends', but that is for part 5.

        // Test
        ArrayList<Day> occurence = new ArrayList<Day>() {};
        occurence.add(Day.SUNDAY);
        Date thirtyminsago = new Date(System.currentTimeMillis() - 3600 * 500);
        Quirk testQuirk = new Quirk("Eat a fruit every sunday", "Eating", thirtyminsago, occurence, 10);
        testQuirk.setUser("zafra");
        Event testEvent = new Event(testQuirk, "This is an event haha nice dude", new Date());

        newsitems.add(testQuirk);
        newsitems.add(testEvent);


        // instantiate custom adapter
        adapter = new NewsItemAdapter(newsitems, this);

        // handle listview and assign adapter
        ListView lView = (ListView) findViewById(R.id.newsfeed_listview);
        lView.setAdapter(adapter);
    }
}
