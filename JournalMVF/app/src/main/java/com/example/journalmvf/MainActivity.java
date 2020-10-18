package com.example.journalmvf;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String dotomorrow, eattoday, finishtoday, date;

    EditText txt_dotomorrow;
    EditText txt_eattoday;
    EditText txt_finishtoday;
    EditText txt_date;

    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_dotomorrow = (EditText findViewById(R.id.txt_dotomorrow));
        txt_eattoday = (EditText findViewById(R.id.txt_eattoday));
        txt_finishtoday = (EditText findViewById(R.id.txt_finishtoday));
        txt_date = (EditText findViewById(R.id.txt_date));

        btn_submit = (Button) findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new) View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotomorrow = txt_dotomorrow.getText().toString();
                eattoday = txt_eattoday.getText().toString();
                finishtoday = txt_finishtoday.getText().toString();
                date = txt_date.getText().toString();

                showToast(dotomorrow);
                showToast(eattoday);
                showToast(finishtoday);
                showToast(date);


            }
        }

    }
    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}