package pulkit.demo_app_color_change.com.demoappcolorchange.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pulkit.demo_app_color_change.com.demoappcolorchange.R;
import pulkit.demo_app_color_change.com.demoappcolorchange.activities.AutoColorPickActivity;
import pulkit.demo_app_color_change.com.demoappcolorchange.activities.ManualColorPickActivity;

public class MainActivity extends AppCompatActivity {

    private Button btn_manual_color_pick, btn_auto_color_picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        init();
    }

    private void findIds() {

        btn_manual_color_pick = (Button) findViewById(R.id.btn_manual_color_pick);
        btn_auto_color_picker = (Button) findViewById(R.id.btn_auto_color_picker);
    }

    private void init() {

        btn_manual_color_pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ManualColorPickActivity.class);
                startActivity(intent);
            }
        });

        btn_auto_color_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), AutoColorPickActivity.class);
                startActivity(intent);
            }
        });

    }


}
