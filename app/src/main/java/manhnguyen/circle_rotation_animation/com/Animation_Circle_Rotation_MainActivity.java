package manhnguyen.circle_rotation_animation.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;

public class Animation_Circle_Rotation_MainActivity extends AppCompatActivity {
    Button btnStartAnimation, btnStopAnimation;
    CircleImageView circleImageViewBall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ani_mation_circle_rotation_main);
        btnStartAnimation = (Button) findViewById(R.id.btnStart);
        btnStopAnimation = (Button) findViewById(R.id.btnStop);
        circleImageViewBall = (CircleImageView) findViewById(R.id.circleImageBall);
        btnStopAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopAnimation();
            }
        });
        btnStartAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAnimation();
            }
        });
    }

    private void startAnimation() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                circleImageViewBall.animate().rotationBy(360).withEndAction(this).setDuration(10000).setInterpolator(new LinearInterpolator()).start();
            }
        };
        circleImageViewBall.animate().rotationBy(360).withEndAction(runnable).setDuration(10000).setInterpolator(new LinearInterpolator()).start();

    }

    private void stopAnimation() {
        circleImageViewBall.animate().cancel();
    }
}