package adarsh.medicalinjector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class DataActivity extends AppCompatActivity {
    private Button btnTylenol;
    private Button btnMotrin;
    private Button btnAdvil;
    private Button btnBenadryl;
    private Button btnRobit;
    private Button btnMucinex;
    private Button btncalc;
    private EditText drug;
    private EditText weight;
    private EditText age;
    private EditText dosageval;
    private EditText oftenval;
    private int wnum = 0;
    private int anum = 0;
    private int dnum = 0;
    private double mldosage = 0;
    private double tspdosage = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        btnAdvil = findViewById(R.id.Advil);
        btnTylenol = findViewById(R.id.Tylenol);
        btnMotrin = findViewById(R.id.Motrin);
        btnBenadryl = findViewById(R.id.Benadryl);
        btnRobit = findViewById(R.id.Robit);
        btnMucinex = findViewById(R.id.Mucinex);
        btncalc = findViewById(R.id.cmdcalculate);
        drug = findViewById(R.id.txtdrug);
        weight = findViewById(R.id.txtweight);
        age = findViewById(R.id.txtage);
        oftenval = findViewById(R.id.txtoften);
        dosageval = findViewById(R.id.txtdosage);
        btnAdvil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drug.setText("Advil");
                dnum = 1;
            }
        });
        btnTylenol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drug.setText("Tylenol");
                dnum = 2;

            }
        });
        btnBenadryl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drug.setText("Benadryl");
                dnum = 3;

            }
        });
        btnRobit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drug.setText("Robitussin");
                dnum = 4;

            }
        });
        btnMotrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drug.setText("Motrin");
                dnum = 5;

            }
        });
        btnMucinex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drug.setText("Mucinex");
                dnum = 6;

            }
        });
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                wnum = Integer.parseInt(weight.getText().toString());
              anum = Integer.parseInt(age.getText().toString());

                if(dnum == 1){
                   if((wnum >= 12) && (wnum <=16)){
                       tspdosage = 0.5;
                   }else if((wnum >= 17) && (wnum <=22)){
                       tspdosage = 0.75;
                   }else if((wnum >= 23) && (wnum <=27)){
                       tspdosage = 1;

                   }else if((wnum >= 28) && (wnum <=34)){
                       tspdosage = 1.25;

                   }else if((wnum >= 35) && (wnum <=39)){
                       tspdosage = 1.5;

                   }else if((wnum >= 40) && (wnum <=45)){
                       tspdosage = 1.75;

                   }else if((wnum >= 46) && (wnum <=51)){
                       tspdosage = 2;

                   }else if((wnum >= 52) && (wnum <=57)){
                       tspdosage = 2.25;

                   }else if((wnum >= 58) && (wnum <=62)){
                       tspdosage = 2.5;

                   }else if((wnum >= 63) && (wnum <=74)){
                       tspdosage = 3;

                   }else if((wnum >= 75) && (wnum <=80)){
                       tspdosage = 3.25;

                   }else if((wnum >= 81) && (wnum <=86)){
                       tspdosage = 3.5;

                   }else if((wnum >= 87) && (wnum <=91)){
                       tspdosage = 3.75;

                   }else if((wnum >= 92) && (wnum <=97)){
                       tspdosage = 4;

                   }else{
                       tspdosage = 4.25;

                   }
                }else if(dnum == 2){
                    if((wnum >= 12) && (wnum <=16)){
                        tspdosage = 0.5;
                    }else if((wnum >= 17) && (wnum <=22)){
                        tspdosage = 0.75;
                    }else if((wnum >= 23) && (wnum <=27)){
                        tspdosage = 1;

                    }else if((wnum >= 28) && (wnum <=34)){
                        tspdosage = 1.25;

                    }else if((wnum >= 35) && (wnum <=39)){
                        tspdosage = 1.5;

                    }else if((wnum >= 40) && (wnum <=45)){
                        tspdosage = 1.75;

                    }else if((wnum >= 46) && (wnum <=51)){
                        tspdosage = 2;

                    }else if((wnum >= 52) && (wnum <=57)){
                        tspdosage = 2.25;

                    }else if((wnum >= 58) && (wnum <=62)){
                        tspdosage = 2.5;

                    }else if((wnum >= 63) && (wnum <=74)){
                        tspdosage = 3;

                    }else if((wnum >= 75) && (wnum <=80)){
                        tspdosage = 3.25;

                    }else if((wnum >= 81) && (wnum <=86)){
                        tspdosage = 3.5;

                    }else if((wnum >= 87) && (wnum <=91)){
                        tspdosage = 3.75;

                    }else if((wnum >= 92) && (wnum <=97)){
                        tspdosage = 4;

                    }else{
                        tspdosage = 4.25;

                    }
                }else if(dnum == 3){
                    if((wnum >= 12) && (wnum <=17)){
                        tspdosage = 0.5;

                    }else if((wnum >= 18) && (wnum <=23)){
                        tspdosage = 0.75;

                    }else if((wnum >= 24) && (wnum <=35)){
                        tspdosage = 1;

                    }else if((wnum >= 36) && (wnum <=47)){
                        tspdosage = 1.25;

                    }else if((wnum >= 48) && (wnum <=59)){
                        tspdosage = 2;

                    }else if((wnum >= 60) && (wnum <=71)){
                        tspdosage = 2.25;

                    }else if((wnum >= 72) && (wnum <=95)){
                        tspdosage = 3;

                    }else if((wnum >= 96)){
                        tspdosage = 4;

                    }
                }else if(dnum == 4){
                    if((wnum >= 12) && (wnum <=16)){
                        tspdosage = 0.46;

                    }else if((wnum >= 17) && (wnum <=22)){
                        tspdosage = 0.5;

                    }else if((wnum >= 23) && (wnum <=27)){
                        tspdosage = 0.61;

                    }else if((wnum >= 28) && (wnum <=34)){
                        tspdosage = 0.71;

                    }else if((wnum >= 35) && (wnum <=39)){
                        tspdosage = 0.81;

                    }else if((wnum >= 40) && (wnum <=45)){
                        tspdosage = 0.91;

                    }else if((wnum >= 46) && (wnum <=51)){
                        tspdosage = 1.01;

                    }else if((wnum >= 52) && (wnum <=57)){
                        tspdosage = 1.22;

                    }else if((wnum >= 58) && (wnum <=62)){
                        tspdosage = 1.25;

                    }else if((wnum >= 63) && (wnum <=74)){
                        tspdosage = 1.83;

                    }else if((wnum >= 75) && (wnum <=80)){
                        tspdosage = 2;

                    }else if((wnum >= 81) && (wnum <=86)){
                        tspdosage = 2.25;

                    }else if((wnum >= 84)){
                        tspdosage = 3;

                    }
                }else if(dnum == 5){
                    if((anum >= 2) && (anum <4)){
                        tspdosage = 0.5;

                    }else if((anum >= 4) && (anum <6)){
                        tspdosage = 0.75;

                    }else if((anum >= 6) && (anum <9)){
                        tspdosage = 1;

                    }else if((anum >= 9) && (anum <12)){
                        tspdosage = 1.25;

                    }else if((anum >= 12)){
                        tspdosage = 2;

                    }
                }else if(dnum == 6){
                    if((anum >= 2) && (anum <4)){
                        tspdosage = 0.6;

                    }else if((anum >= 4) && (anum <6)){
                        tspdosage = 0.8;

                    }else if((anum >= 6) && (anum <9)){
                        tspdosage = 1.1;

                    }else if((anum >= 9) && (anum <12)){
                        tspdosage = 1.7;

                    }else if((anum >= 12)){
                        tspdosage = 2.5;

                    }
                }

                mldosage = Math.round(tspdosage * 4.929);
                dosageval.setText(Double.toString(mldosage)+ " mL");
                Random rand = new Random();
                oftenval.setText(Integer.toString(rand.nextInt(5)+2)+"/day");
            }
        });

    }
}
