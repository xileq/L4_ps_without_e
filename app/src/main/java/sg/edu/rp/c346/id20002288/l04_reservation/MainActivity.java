package sg.edu.rp.c346.id20002288.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TimePicker tp;
DatePicker dp;
Button reserve,reset;
CheckBox smoke;
EditText name,telephone,size;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        reserve=findViewById(R.id.btnReserve);
        reset=findViewById(R.id.btnReset);
        smoke=findViewById(R.id.smoke);
        name=findViewById(R.id.etName);
        telephone=findViewById(R.id.etTelephone);
        size=findViewById(R.id.etSize);



        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);
        dp.updateDate(2021,6,1);




reserve.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(smoke.isChecked()) {
            Toast.makeText(MainActivity.this,"Final booking reservation: Name: " +name.getText().toString()+" Size: "+ size.getText().toString() + " Telephone number: " + telephone.getText().toString() + " Smoking Area requested"
                    +"Date: " + dp.getDayOfMonth()+"/"+(dp.getMonth()+1) + "/" + dp.getYear() + "Time: " + tp.getCurrentHour() + ":" +
                    String.format("%02d",tp.getCurrentMinute()), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Final booking reservation: Name: " +name.getText().toString()+" Size: "+ size.getText().toString() + " Telephone number: " + telephone.getText().toString() + " Non-Smoking Area requested"
                    +"Date: " + dp.getDayOfMonth()+"/"+(dp.getMonth()+1) + "/" + dp.getYear() + "Time: " + tp.getCurrentHour() + ":" +
                    String.format("%02d",tp.getCurrentMinute()), Toast.LENGTH_LONG).show();

        }
    }
});

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);
                dp.updateDate(2021,6,1);
                name.setText("");
                size.setText("");
                telephone.setText("");

            }
        });
    }

}