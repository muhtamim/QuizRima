package rimabegum.example.com.quizrima;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SolutionCatagory extends AppCompatActivity {

    private Button CN,EN,BN,PY,HM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution_catagory);

        CN = (Button) findViewById(R.id.Computer_Networking);
        EN = (Button) findViewById(R.id.English);
        BN = (Button) findViewById(R.id.বাংলা);
        PY = (Button) findViewById(R.id.Physics);
        HM = (Button) findViewById(R.id.Home);

        CN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolutionCatagory.this,ComputerNetworking.class);
                startActivity(intent);
                finish();
            }
        });

        EN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolutionCatagory.this,English.class);
                startActivity(intent);
                finish();
            }
        });

        BN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolutionCatagory.this,Bangla.class);
                startActivity(intent);
                finish();
            }
        });

        PY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolutionCatagory.this,Physics.class);
                startActivity(intent);
                finish();
            }
        });

        HM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SolutionCatagory.this,Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
