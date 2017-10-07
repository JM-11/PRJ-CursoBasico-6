package ado.com.orange.jovargas.elpesoideal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;
import java.text.DecimalFormat;



public class MainActivity extends AppCompatActivity {

    RadioButton r_mujer, r_hombre;
    String Sexo;
    //Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_mujer = (RadioButton) findViewById(R.id.r_mujer);
        r_hombre = (RadioButton) findViewById(R.id.r_hombre);


        //if (randyOrton.isChecked()) {
        //    selectedSuperStar = randyOrton.getText().toString();
        /*
        @Override
        public void onClick(View v) {
            if (randyOrton.isChecked()) {
                selectedSuperStar = randyOrton.getText().toString();
            } else if (sheamus.isChecked()) {
                selectedSuperStar = sheamus.getText().toString();
            } else if (johnCena.isChecked()) {
                selectedSuperStar = johnCena.getText().toString();
            } else if (romanReigns.isChecked()) {
                selectedSuperStar = romanReigns.getText().toString();
            } else if (goldBerg.isChecked()) {
                selectedSuperStar = goldBerg.getText().toString();
            }
            Toast.makeText(getApplicationContext(), selectedSuperStar, Toast.LENGTH_LONG).show(); // print the value of selected super star
        }
        */

    }


    public void btnCalcularComplexOnClick (View v) {

        EditText txtAlturaComplex = (EditText)findViewById(R.id.txtAlturaComplex);
        EditText txtMuneca = (EditText)findViewById(R.id.txtMuneca);

        if (txtAlturaComplex.getText().toString().trim().length() == 0) {
            txtAlturaComplex.requestFocus();
            Toast.makeText(this, "No te olvides de colocar la altura", Toast.LENGTH_SHORT).show();

        } else if (txtMuneca.getText().toString().trim().length() == 0) {
            txtMuneca.requestFocus();
            Toast.makeText(this, "No te olvides de colocar la circunferencia de la muñeca", Toast.LENGTH_SHORT).show();
        }

        else {

            double AlturaComplex = Double.parseDouble(txtAlturaComplex.getText().toString());
            double Muneca = Double.parseDouble(txtMuneca.getText().toString());


            //Complexion
            double Complexion = AlturaComplex / Muneca;

            DecimalFormat precision = new DecimalFormat("0.00");

            if (r_mujer.isChecked()) {
                Sexo = "M";

                if (Complexion < 10) {
                    Toast.makeText(this, "Complexion: " + precision.format(Complexion) + " Grande-Mujer", Toast.LENGTH_LONG).show();

                    if ((AlturaComplex >= 1.50) && (AlturaComplex < 1.52)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 47.2 - Max. 52.9  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.52) && (AlturaComplex < 1.54)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 48.5 - Max. 54.3  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.54) && (AlturaComplex < 1.56)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 49.8 - Max. 55.7  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.56) && (AlturaComplex < 1.58)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 51.1 - Max. 57.2  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.58) && (AlturaComplex < 1.60)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 52.4 - Max. 58.7  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.60) && (AlturaComplex < 1.62)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 53.8 - Max. 60.2  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.62) && (AlturaComplex < 1.64)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 55.1 - Max. 61.7  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.64) && (AlturaComplex < 1.66)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 56.5 - Max. 63.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.66) && (AlturaComplex < 1.68)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 57.9 - Max. 64.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.68) && (AlturaComplex < 1.70)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 59.3 - Max. 66.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.70) && (AlturaComplex < 1.72)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 60.7 - Max. 67.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.72) && (AlturaComplex < 1.74)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 62.1 - Max. 69.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.74) && (AlturaComplex < 1.76)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 63.6 - Max. 71.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.76) && (AlturaComplex < 1.78)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 65.0 - Max. 72.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.78) && (AlturaComplex < 1.80)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 66.5 - Max. 74.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.80) && (AlturaComplex < 1.82)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 68.0 - Max. 76.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.82) && (AlturaComplex < 1.84)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 69.5 - Max. 77.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.84) && (AlturaComplex < 1.86)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 71.1 - Max. 79.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.86) && (AlturaComplex < 1.88)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 72.7 - Max. 81.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.88) && (AlturaComplex < 1.90)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 74.2 - Max. 83.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.90) && (AlturaComplex < 1.92)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 75.8 - Max. 84.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.92) && (AlturaComplex <= 1.94)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 77.4 - Max. 88.4  ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Fuera de rango en tabla ideal ", Toast.LENGTH_LONG).show();
                    }

                } else if (Complexion > 11) {
                    Toast.makeText(this, "Complexion: " + precision.format(Complexion) + " Pequeña-Mujer", Toast.LENGTH_LONG).show();

                    if ((AlturaComplex >= 1.50) && (AlturaComplex < 1.52)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 45.0 - Max. 47.2  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.52) && (AlturaComplex < 1.54)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 46.2 - Max. 48.5  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.54) && (AlturaComplex < 1.56)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 47.4 - Max. 49.8  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.56) && (AlturaComplex < 1.58)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 48.7 - Max. 51.1  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.58) && (AlturaComplex < 1.60)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 49.9 - Max. 52.4  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.60) && (AlturaComplex < 1.62)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 51.2 - Max. 53.8  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.62) && (AlturaComplex < 1.64)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 52.5 - Max. 55.1  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.64) && (AlturaComplex < 1.66)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 53.8 - Max. 56.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.66) && (AlturaComplex < 1.68)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 55.1 - Max. 57.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.68) && (AlturaComplex < 1.70)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 56.4 - Max. 59.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.70) && (AlturaComplex < 1.72)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 57.8 - Max. 60.7  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.72) && (AlturaComplex < 1.74)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 59.2 - Max. 62.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.74) && (AlturaComplex < 1.76)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 60.6 - Max. 63.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.76) && (AlturaComplex < 1.78)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 62.0 - Max. 65.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.78) && (AlturaComplex < 1.80)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 63.4 - Max. 66.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.80) && (AlturaComplex < 1.82)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 64.8 - Max. 68.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.82) && (AlturaComplex < 1.84)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 66.2 - Max. 69.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.84) && (AlturaComplex < 1.86)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 67.7 - Max. 71.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.86) && (AlturaComplex < 1.88)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 69.2 - Max. 72.7  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.88) && (AlturaComplex < 1.90)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min.70.7  - Max. 74.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.90) && (AlturaComplex < 1.92)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 72.2 - Max. 75.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.92) && (AlturaComplex <= 1.94)){
                        Toast.makeText(this, "Peso Ideal (kg): Min. 73.7 - Max. 79.0  ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Fuera de rango en tabla ideal ", Toast.LENGTH_LONG).show();
                    }


                } else {
                    Toast.makeText(this, "Complexion: " + precision.format(Complexion) + " Mediana-Mujer", Toast.LENGTH_LONG).show();

                    if ((AlturaComplex >= 1.50) && (AlturaComplex < 1.52)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 46.1 - Max. 50.6  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.52) && (AlturaComplex < 1.54)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 47.4 - Max. 52.0  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.54) && (AlturaComplex < 1.56)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 48.6 - Max. 53.4  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.56) && (AlturaComplex < 1.58)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 49.9 - Max. 54.8  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.58) && (AlturaComplex < 1.60)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 51.2 - Max. 56.2  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.60) && (AlturaComplex < 1.62)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 52.5 - Max. 57.6  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.62) && (AlturaComplex < 1.64)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 53.8 - Max. 59.0  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.64) && (AlturaComplex < 1.66)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 55.1 - Max. 60.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.66) && (AlturaComplex < 1.68)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 56.5 - Max. 62.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.68) && (AlturaComplex < 1.70)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 57.9 - Max. 63.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.70) && (AlturaComplex < 1.72)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 59.2 - Max. 65.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.72) && (AlturaComplex < 1.74)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 60.6 - Max. 66.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.74) && (AlturaComplex < 1.76)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 62.1 - Max. 68.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.76) && (AlturaComplex < 1.78)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 63.5 - Max. 69.7  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.78) && (AlturaComplex < 1.80)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 65.0 - Max. 71.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.80) && (AlturaComplex < 1.82)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 66.4 - Max. 72.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.82) && (AlturaComplex < 1.84)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 67.9 - Max. 74.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.84) && (AlturaComplex < 1.86)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 69.4 - Max. 76.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.86) && (AlturaComplex < 1.88)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 70.9 - Max. 77.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.88) && (AlturaComplex < 1.90)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 72.5 - Max. 79.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.90) && (AlturaComplex < 1.92)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 74.0 - Max. 81.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.92) && (AlturaComplex <= 1.94)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 75.6 - Max. 84.7  ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Fuera de rango en tabla ideal ", Toast.LENGTH_LONG).show();
                    }

                }

            } else if (r_hombre.isChecked()) {
                Sexo = "H";

                if (Complexion < 9.6) {
                    Toast.makeText(this, "Complexion: " + precision.format(Complexion) + " Grande-Hombre", Toast.LENGTH_LONG).show();


                    if ((AlturaComplex >= 1.50) && (AlturaComplex < 1.52)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 50.6 - Max. 56.2  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.52) && (AlturaComplex < 1.54)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 52.0 - Max. 57.8  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.54) && (AlturaComplex < 1.56)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 53.4 - Max. 59.3  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.56) && (AlturaComplex < 1.58)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 54.8 - Max. 60.8  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.58) && (AlturaComplex < 1.60)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 56.2 - Max. 62.4  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.60) && (AlturaComplex < 1.62)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 57.6 - Max. 64.0  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.62) && (AlturaComplex < 1.64)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 59.0 - Max. 65.6  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.64) && (AlturaComplex < 1.66)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 60.5 - Max. 67.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.66) && (AlturaComplex < 1.68)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 62.0 - Max. 68.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.68) && (AlturaComplex < 1.70)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 63.5 - Max. 70.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.70) && (AlturaComplex < 1.72)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 65.0 - Max. 72.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.72) && (AlturaComplex < 1.74)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 66.6 - Max. 74.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.74) && (AlturaComplex < 1.76)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 68.1 - Max. 75.7  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.76) && (AlturaComplex < 1.78)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 69.7 - Max.77.4   ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.78) && (AlturaComplex < 1.80)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 71.3 - Max. 79.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.80) && (AlturaComplex < 1.82)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min.72.9  - Max. 81.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.82) && (AlturaComplex < 1.84)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 74.5 - Max. 82.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.84) && (AlturaComplex < 1.86)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 76.2 - Max. 84.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.86) && (AlturaComplex < 1.88)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 77.8 - Max. 86.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.88) && (AlturaComplex < 1.90)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 79.5 - Max. 88.4  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.90) && (AlturaComplex < 1.92)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 81.2 - Max. 90.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.92) && (AlturaComplex <= 1.94)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 82.9 - Max. 94.1  ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Fuera de rango en tabla ideal ", Toast.LENGTH_LONG).show();
                    }


                } else if (Complexion > 10.4) {
                    Toast.makeText(this, "Complexion: " + precision.format(Complexion) + " Pequeño-Hombre", Toast.LENGTH_LONG).show();

                    if ((AlturaComplex >= 1.50) && (AlturaComplex < 1.52)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 45.0 - Max. 50.2  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.52) && (AlturaComplex < 1.54)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 46.2 - Max. 51.5  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.54) && (AlturaComplex < 1.56)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 47.4 - Max. 52.9  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.56) && (AlturaComplex < 1.58)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 48.7 - Max. 54.3  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.58) && (AlturaComplex < 1.60)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 49.9 - Max. 55.7  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.60) && (AlturaComplex < 1.62)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 51.2 - Max. 57.1  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.62) && (AlturaComplex < 1.64)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 52.5 - Max. 58.5  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.64) && (AlturaComplex < 1.66)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 53.8 - Max. 60.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.66) && (AlturaComplex < 1.68)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 55.1 - Max. 61.4  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.68) && (AlturaComplex < 1.70)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 56.4 - Max. 62.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.70) && (AlturaComplex < 1.72)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 57.8 - Max. 64.4  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.72) && (AlturaComplex < 1.74)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 59.2 - Max. 66.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.74) && (AlturaComplex < 1.76)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 60.6 - Max. 67.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.76) && (AlturaComplex < 1.78)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 62.0 - Max. 69.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.78) && (AlturaComplex < 1.80)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 63.4 - Max. 70.7  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.80) && (AlturaComplex < 1.82)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 64.8 - Max. 72.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.82) && (AlturaComplex < 1.84)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 66.2 - Max. 73.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.84) && (AlturaComplex < 1.86)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 67.7 - Max. 75.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.86) && (AlturaComplex < 1.88)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 69.2 - Max. 77.1  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.88) && (AlturaComplex < 1.90)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 70.7 - Max. 78.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.90) && (AlturaComplex < 1.92)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 72.2 - Max. 80.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.92) && (AlturaComplex <= 1.94)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 73.7 - Max. 83.9  ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Fuera de rango en tabla ideal ", Toast.LENGTH_LONG).show();
                    }


                } else {
                    Toast.makeText(this, "Complexion: " + precision.format(Complexion) + " Mediano-Hombre", Toast.LENGTH_LONG).show();

                    if ((AlturaComplex >= 1.50) && (AlturaComplex < 1.52)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 48.4 - Max. 55.4  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.52) && (AlturaComplex < 1.54)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 49.7 - Max. 56.9  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.54) && (AlturaComplex < 1.56)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 51.0 - Max. 58.4  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.56) && (AlturaComplex < 1.58)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 52.3 - Max. 59.9  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.58) && (AlturaComplex < 1.60)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 53.7 - Max. 61.5  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.60) && (AlturaComplex < 1.62)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min.55.0  - Max. 63.0  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.62) && (AlturaComplex < 1.64)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 56.4 - Max. 64.6  ", Toast.LENGTH_LONG).show();
                    } else if ((AlturaComplex >= 1.64) && (AlturaComplex < 1.66)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 57.8 - Max.  66.2 ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.66) && (AlturaComplex < 1.68)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 59.2 - Max. 67.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.68) && (AlturaComplex < 1.70)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 60.7 - Max. 69.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.70) && (AlturaComplex < 1.72)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 62.1 - Max. 71.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.72) && (AlturaComplex < 1.74)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 63.9 - Max. 72.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.74) && (AlturaComplex < 1.76)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 65.1 - Max. 74.5  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.76) && (AlturaComplex < 1.78)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 66.6 - Max. 76.3  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.78) && (AlturaComplex < 1.80)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 68.1 - Max. 78.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.80) && (AlturaComplex < 1.82)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 69.7 - Max. 79.8  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.82) && (AlturaComplex < 1.84)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 71.2 - Max. 81.6  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.84) && (AlturaComplex < 1.86)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 72.8 - Max. 83.4  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.86) && (AlturaComplex < 1.88)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 74.4 - Max. 85.2  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.88) && (AlturaComplex < 1.90)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 76.0 - Max. 87.0  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.90) && (AlturaComplex < 1.92)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 77.6 - Max. 88.9  ", Toast.LENGTH_LONG).show();
                    }  else if ((AlturaComplex >= 1.92) && (AlturaComplex <= 1.94)) {
                        Toast.makeText(this, "Peso Ideal (kg): Min. 79.3 - Max. 92.7  ", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Fuera de rango en tabla ideal ", Toast.LENGTH_LONG).show();
                    }

                }
            } else {
                Sexo = "I";

                Toast.makeText(this, "No se olvide de seleccionar el sexo", Toast.LENGTH_LONG).show();
            }
        }
    }



    public void btnCalcularOnClick (View v) {
        EditText txtAltura = (EditText)findViewById(R.id.txtAltura);
        EditText txtPeso = (EditText)findViewById(R.id.txtPeso);

        if (txtAltura.getText().toString().trim().length() == 0) {
            txtAltura.requestFocus();
            Toast.makeText(this, "No te olvides de colocar la altura del IMC", Toast.LENGTH_SHORT).show();

        } else if (txtPeso.getText().toString().trim().length() == 0) {
            txtPeso.requestFocus();
            Toast.makeText(this, "No te olvides de colocar el peso del IMC", Toast.LENGTH_SHORT).show();
        }

        else {

            double Altura = Double.parseDouble(txtAltura.getText().toString());
            int Peso = Integer.parseInt(txtPeso.getText().toString());

            double imc = Peso / Math.pow(Altura, 2);

            //+ df2.format(input)
            DecimalFormat precision = new DecimalFormat("0.00");


            if (imc < 18.5) {
                Toast.makeText(this, "Tu IMC es: " + precision.format(imc) + " -> Peso Insuficiente!", Toast.LENGTH_LONG).show();
            } else if (imc > 25) {
                Toast.makeText(this, "Tu IMC es: " + precision.format(imc) + " -> ARRIBA del Peso Ideal", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Tu IMC es: " + precision.format(imc) + " -> Peso Ideal - Ok!!", Toast.LENGTH_LONG).show();
            }
        }
    }

    public void callTablaCommplexion (View view) {
        Intent i = new Intent(this, Tablacomplexion.class);
        startActivity(i);
    }

    public void callTablaimc (View view) {
        Intent i = new Intent(this, Tablaimc.class);
        startActivity(i);
    }

    public void callInfocomplexion (View view) {
        Intent i = new Intent(this, Infocomplexion.class);
        startActivity(i);
    }


}
