package mainactivity.w;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nameactivity);

        TextView welcomeText = findViewById(R.id.welcomeText);
        Button dontCallMeThatButton = findViewById(R.id.dontCallMeThatButton);
        Button thankYouButton = findViewById(R.id.thankYouButton);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String data = bundle.getString("data");
            if (data != null) {

                welcomeText.setText(getString(R.string.welcome_message, data));
            }
        }

        dontCallMeThatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        thankYouButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_OK);
                finish();
            }
        });
    }
}
