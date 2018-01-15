package com.example.student.doradcalekow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DoradcaLekow extends Activity {

    @BindView(R.id.button_wybierz)
    Button wybierz;

    @BindView(R.id.text_wpisz_pesel)
    EditText wpiszTekst;

    @BindView(R.id.text_prosba)
    TextView zamowlek;

    @BindView(R.id.text_zamow_lek)
    TextView wpiszpesel;

    @BindView(R.id.image_plus)
    ImageView obrazek;


    @OnClick(R.id.button_wybierz_lek)
    public void onClick(View v) {
        Intent intent = new Intent(DoradcaLekow.this, com.example.student.doradcalekow.DoradcaLekow2.class);
        Bundle bundle = new Bundle();
        String enteredText = wpiszTekst.getText().toString();
        bundle.putString("Key", enteredText);
        intent.putExtras(bundle);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doradca_lekow);
    }
}
