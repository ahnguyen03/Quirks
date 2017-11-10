package cmput301f17t12.quirks.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import cmput301f17t12.quirks.Adapters.NewsItemAdapter;
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

        // TODO: Get current user's newsable items.
        // Should be current user's + friends', but that is for part 5.

        // Test
        Quirk testQuirk = new Quirk();
        Event testEvent = new Event(testQuirk, "This is an event", new Date());
        newsitems.add(testEvent);

        // instantiate custom adapter
        adapter = new NewsItemAdapter(newsitems, this);

        // handle listview and assign adapter
        ListView lView = (ListView) findViewById(R.id.newsfeed_listview);
        lView.setAdapter(adapter);
    }
}
