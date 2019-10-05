package idv.jerryexcc.calculatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int number = 0, number_two = 0;
    private Button btn1, btn2, btn_plus, btn_equal, btn_clean;
    //    private StringBuilder str_show = new StringBuilder();
    private String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView tvShow = findViewById(R.id.tvShow);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn_plus = findViewById(R.id.btnPlus);
        btn_equal = findViewById(R.id.btnEqual);
        btn_clean = findViewById(R.id.btn_c);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                str_show.append("1");
                result += "1";
                tvShow.setText(result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result += "2";
                tvShow.setText(result);
            }
        });

        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = Integer.parseInt(tvShow.getText().toString());
                result = "";
                tvShow.setText(result);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number_two = Integer.parseInt(tvShow.getText().toString());
                tvShow.setText(number + number_two + "");
            }
        });

        btn_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = 0;
                number_two = 0;
                result = "";
                tvShow.setText("Hello World");
            }
        });
    }
}
