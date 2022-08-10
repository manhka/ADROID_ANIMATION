package manhnguyen.circle_rotation_animation.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ramotion.foldingcell.FoldingCell;

public class AnimationFoldingCellMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_folding_cell_main);

        // get our folding cell
        final FoldingCell fc = (FoldingCell) findViewById(R.id.folding_cell);
        // attach click listener to folding cell
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });
    }
}