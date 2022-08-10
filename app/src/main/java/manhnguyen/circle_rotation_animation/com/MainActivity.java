package manhnguyen.circle_rotation_animation.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    Button btnCircleAnimation, btnFoldingCellAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCircleAnimation = (Button) findViewById(R.id.btnCircleRotationAnimation);
        btnFoldingCellAnimation = (Button) findViewById(R.id.btnFoldingCellAnimation);

        btnCircleAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Animation_Circle_Rotation_MainActivity.class));
            }
        });
        btnFoldingCellAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AnimationFoldingCellMainActivity.class));
            }
        });
    }

}