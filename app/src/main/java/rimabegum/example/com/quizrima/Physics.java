package rimabegum.example.com.quizrima;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class Physics extends AppCompatActivity {

    Button Solutionhomebutton;
    ScrollView scrollView;
    TextView Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        Solutionhomebutton = (Button) findViewById(R.id.Solutionhomebutton);
        scrollView = (ScrollView) findViewById(R.id.Sv);
        Q1 = (TextView) findViewById(R.id.Q1);
        Q2 = (TextView) findViewById(R.id.Q2);
        Q3 = (TextView) findViewById(R.id.Q3);
        Q4 = (TextView) findViewById(R.id.Q4);
        Q5 = (TextView) findViewById(R.id.Q5);
        Q6 = (TextView) findViewById(R.id.Q6);
        Q7 = (TextView) findViewById(R.id.Q7);
        Q8 = (TextView) findViewById(R.id.Q8);
        Q9 = (TextView) findViewById(R.id.Q9);
        Q10 = (TextView) findViewById(R.id.Q10);

        Solutionhomebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Physics.this, SolutionCatagory.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
