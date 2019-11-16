package com.example.my_zodiac;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormatter;
    private Button btTanggal, btRamal;
    private TextView tvTanggal;
    private String tanggal, nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy",Locale.US);

        tvTanggal = (TextView) findViewById(R.id.tv_tanggal);
        btTanggal = (Button) findViewById(R.id.bt_tanggal);
        btTanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        btRamal = (Button) findViewById(R.id.bt_ramal);

        btRamal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvTanggal.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(), "Mohon Masukan Tanggal Anda", Toast.LENGTH_SHORT).show();
                }else{
                    tanggal = tvTanggal.getText().toString();
                    nama = tvTanggal.getText().toString();
                    Intent i = new Intent(MainActivity.this,ramal.class);
                    Bundle b = new Bundle();
                    b.putString("parseTanggal",tanggal);
                    b.putString("parseNama",nama);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }

    private void showDateDialog(){
        Calendar newCalendar = Calendar.getInstance();

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year,month,day);
                tvTanggal.setText(dateFormatter.format(newDate.getTime()));
            }
        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }


}
