package com.example.pcfamily.figuras;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rCirculo,rCuadrado,rCubo,rTriangulo;
    TextView tPerimetro,tArea,tVolumen,tCuadrado,tCirculo,tTriangulo,tCubo;
    EditText eCuadrado,eCirculo,eTriangulo,eCubo;
    Button bCalcular;
    double perimetro,area,volumen,lado,base,altura,radio;
    String stlado,stradio;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCalcular = findViewById(R.id.bResultado);
        rCirculo = findViewById(R.id.rCirculo);
        rCuadrado = findViewById(R.id.rCuadro);
        rCubo = findViewById(R.id.rCubo);
        rTriangulo = findViewById(R.id.rTriangulo);
        tCirculo = findViewById(R.id.tCirculo);
        tCuadrado = findViewById(R.id.tCuadrado);
        tCubo = findViewById(R.id.tCubo);
        tTriangulo = findViewById(R.id.tTriangulo);
        eCirculo = findViewById(R.id.eCirculo);
        eCirculo.setEnabled(false);
        eCuadrado = findViewById(R.id.eCuadrado);
        eCuadrado.setEnabled(false);
        eCubo = findViewById(R.id.eCubo);
        eCubo.setEnabled(false);
        eTriangulo = findViewById(R.id.eTriangulo);
        eTriangulo.setEnabled(false);
        tPerimetro = findViewById(R.id.tPerimetro);
        tArea = findViewById(R.id.tArea);
        tVolumen = findViewById(R.id.tVolumen);

    }
    public void onClickedRadioButton(View view) {
        int id = view.getId();
        switch (id){
            case R.id.rCirculo:

                tCirculo.setText("Ingrese valor de radio:");
                eCirculo.setEnabled(true);
                tCubo.setText("");
                eCubo.setEnabled(false);
                tCuadrado.setText("");
                eCuadrado.setEnabled(false);
                tTriangulo.setText("");
                eTriangulo.setEnabled(false);
                eCubo.setText("");
                eCuadrado.setText("");
                eTriangulo.setText("");
                break;
            case R.id.rCubo:
                tCubo.setText("Ingrese valor de lado:");
                eCubo.setEnabled(true);
                tCirculo.setText("");
                eCirculo.setEnabled(false);
                tCuadrado.setText("");
                eCuadrado.setEnabled(false);
                tTriangulo.setText("");
                eTriangulo.setEnabled(false);
                eCirculo.setText("");
                eCuadrado.setText("");
                eTriangulo.setText("");
                break;
            case R.id.rCuadro:
                tCuadrado.setText("Ingrese valor de lado:");
                eCuadrado.setEnabled(true);
                tCirculo.setText("");
                eCirculo.setEnabled(false);
                tCubo.setText("");
                eCubo.setEnabled(false);
                tTriangulo.setText("");
                eTriangulo.setEnabled(false);
                eCirculo.setText("");
                eCubo.setText("");
                eTriangulo.setText("");
                break;
            case R.id.rTriangulo:
                tTriangulo.setText("Ingrese valor de lado:");
                eTriangulo.setEnabled(true);
                tCirculo.setText("");
                eCirculo.setEnabled(false);
                tCubo.setText("");
                eCubo.setEnabled(false);
                tCuadrado.setText("");
                eCuadrado.setEnabled(false);
                eCirculo.setText("");
                eCubo.setText("");
                eCuadrado.setText("");

                break;


        }
    }
    public void onClickedButton(View view) {
        int id= view.getId();
        if(id == R.id.bResultado) {
            if (rCirculo.isChecked()) {
                stradio = eCirculo.getText().toString();
                radio = Integer.parseInt(stradio);
                perimetro = radio * 2 * Math.PI;
                area =  radio * 2 * radio;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText("");
            } else if (rCuadrado.isChecked()) {
                stlado = eCuadrado.getText().toString();
                lado = Integer.parseInt(stlado);
                perimetro = 4 * lado;
                area = lado * lado;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText("");
            } else if (rCubo.isChecked()) {
                stlado = eCubo.getText().toString();
                lado = Integer.parseInt(stlado);
                perimetro = 6 * 4 * lado;
                area = 6 * lado * lado;
                volumen = lado * lado * lado;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText(String.valueOf(volumen));
            } else if (rTriangulo.isChecked()) {
                stlado = eTriangulo.getText().toString();
                lado= Integer.parseInt(stlado);
                perimetro= 3*lado;
                base = lado;
                altura = ((Math.sqrt(3)) * lado)/2;
                area = (base * altura) / 2;
                tPerimetro.setText(String.valueOf(perimetro));
                tArea.setText(String.valueOf(area));
                tVolumen.setText("");
            } else {
                tPerimetro.setText("");
                tArea.setText("");
                tVolumen.setText("");
            }
        }
    }
}
