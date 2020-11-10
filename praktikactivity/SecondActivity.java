package id.ac.id.telkomuniversity.tass.praktikactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView hasilInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        hasilInput    = findViewById(R.id.tvInput);
        Bundle bundle = getIntent().getExtras();
        String hasil  = bundle.getString("input");

        hasilInput.setText(String.valueOf(hasil));
    }
}