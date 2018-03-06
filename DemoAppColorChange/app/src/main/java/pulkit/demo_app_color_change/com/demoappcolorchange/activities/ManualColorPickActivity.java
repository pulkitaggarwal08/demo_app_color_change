package pulkit.demo_app_color_change.com.demoappcolorchange.activities;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import pulkit.demo_app_color_change.com.demoappcolorchange.R;

public class ManualColorPickActivity extends AppCompatActivity {

    private ImageView im_green, iv_pink, iv_red;
    private TextView tv_text;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_color_pick);

        findIds();
        init();
    }

    private void findIds() {

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        im_green = (ImageView) findViewById(R.id.im_green);
        iv_pink = (ImageView) findViewById(R.id.iv_pink);
        iv_red = (ImageView) findViewById(R.id.iv_red);
        tv_text = (TextView) findViewById(R.id.tv_text);
    }

    private void init() {

        final Window window = getWindow();

        im_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_text.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.green));
                toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.green));

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

                    window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.dark_green));
                }

            }
        });

        iv_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_text.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.pink));
                toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.pink));

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

                    window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.dark_pink));
                }
            }
        });

        iv_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv_text.setTextColor(ContextCompat.getColor(getApplicationContext(),R.color.red));
                toolbar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.red));

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

                    window.setStatusBarColor(ContextCompat.getColor(getApplicationContext(),R.color.dark_red));
                }
            }
        });


    }


}
