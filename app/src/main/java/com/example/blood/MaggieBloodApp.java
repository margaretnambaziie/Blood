package com.example.blood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*MBARARA UNIVERSITY OF SCIENCE AND TECHNOLOGY

      NAMBAZIIRA MARGARET

      2017/BIT/116/PS
      */

public class MaggieBloodApp extends AppCompatActivity {
    Button btnCONTINUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maggie_blood_app);

        btnCONTINUE = (Button) findViewById(R.id.btnCONTINUE);

        btnCONTINUE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent magie = new Intent(MaggieBloodApp.this,LoginPage.class);

                startActivity(magie);
            }
        });
    }
}
