package rachelmiller.inclassassignment05_rachelm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setTitle("Planet");

        displayText = (TextView) findViewById(R.id.display_text);
        Intent mrIntent = getIntent();

        Planet p = (Planet) mrIntent.getSerializableExtra(Keys.PLANET);
        displayText.setText(("Planet name: " + p.getName() + "\n" + "\n" + "Distance in Millions of Miles: "
                + p.getDistance() + "\n" + "\n" + "Does the Planet Have Water?  " + p.isCanWeLive()) + " " + "\n" + "\n" + p.getComments());


    }
}
