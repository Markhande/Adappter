package apna_package_one;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.temp_for_adapter.R;

public class my_class extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_class);

        GridView gridView = findViewById(R.id.grid_list);

        int[] animal_array = {R.drawable.alligator, R.drawable.calculator, R.drawable.donkey,
                R.drawable.goat};

        Adapter adpetr=new Adapter(getApplicationContext(),animal_array);
        gridView.setAdapter(adpetr);

    }
}