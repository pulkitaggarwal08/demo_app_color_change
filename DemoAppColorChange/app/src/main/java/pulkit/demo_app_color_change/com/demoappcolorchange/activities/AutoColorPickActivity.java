package pulkit.demo_app_color_change.com.demoappcolorchange.activities;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import pulkit.demo_app_color_change.com.demoappcolorchange.R;
import pulkit.demo_app_color_change.com.demoappcolorchange.colorpicker.ColorPicker;

public class AutoColorPickActivity extends AppCompatActivity {

    private ImageView iv_pick_color;
    private TextView tv_text;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_color_pick);

        findIds();
        init();

    }

    private void findIds() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        iv_pick_color = (ImageView) findViewById(R.id.iv_pick_color);
        tv_text = (TextView) findViewById(R.id.tv_text);
    }

    private void init() {

        final Window window = getWindow();

        iv_pick_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ColorPicker colorPicker = new ColorPicker(AutoColorPickActivity.this);
                ArrayList<String> colorsList = new ArrayList<>();
                colorsList.add("#82B926");
                colorsList.add("#a276eb");
                colorsList.add("#6a3ab2");
                colorsList.add("#666666");
                colorsList.add("#FFFF00");
                colorsList.add("#FF7B34");
                colorsList.add("#00FFFF");
                colorsList.add("#FF00DC");
                colorsList.add("#59FF00");
                colorsList.add("#3C8D2F");
                colorsList.add("#FA9F00");
                colorsList.add("#FF0000");
                colorsList.add("#7CB4FF");
                colorsList.add("#C6C6C6");
                colorsList.add("#C62C79");

                colorPicker
                        .setDefaultColorButton(Color.parseColor("#f84c44"))
                        .setColors(colorsList)
                        .setColumns(5)
                        .setRoundColorButton(true)
                        .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                            @Override
                            public void onChooseColor(int position, int color) {
                                Log.d("position", "" + position);// will be fired only when OK button was tapped

                                tv_text.setTextColor(color);
                                toolbar.setBackgroundColor(color);
//                                window.setStatusBarColor(color);

                            }

                            @Override
                            public void onCancel() {

                            }
                        })
                        /*.addListenerButton("newButton", new ColorPicker.OnButtonListener() {
                            @Override
                            public void onClick(View v, int position, int color) {
                                Log.d("position", "" + position);
                            }
                        })*/
                        .show();
            }
        });

    }

}
