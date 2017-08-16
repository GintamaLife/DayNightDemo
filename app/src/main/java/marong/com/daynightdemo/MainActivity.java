package marong.com.daynightdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCameraTakePhoto;
    private Button btnAnimation;
    private Button btnAnimator;
    private Button btnDayNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btnDayNight.setOnClickListener(this);
    }

    private void initView() {
        btnCameraTakePhoto = (Button) findViewById(R.id.btn_camera_take_photo);
        btnAnimation = (Button) findViewById(R.id.btn_animation);
        btnAnimator = (Button) findViewById(R.id.btn_animator);
        btnDayNight = (Button) findViewById(R.id.btn_day_night);
    }

    @Override
    public void onClick(View view) {

        startActivity(new Intent(MainActivity.this,DayNightActivity.class));

    }
}
