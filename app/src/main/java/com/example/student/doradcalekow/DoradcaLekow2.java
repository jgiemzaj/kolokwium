package com.example.student.doradcalekow;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class DoradcaLekow2 extends DoradcaLekow {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okno_drugie);
        ButterKnife.bind(this);

        ArrayList leki = new ArrayList<>();
        leki.add(new Lek("aspiryna", "100mg"));
        leki.add(new Lek("vitC", "1g"));
        leki.add(new Lek("polopiryna", "200mg"));
        leki.add(new Lek("ibuprom", "400mg"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        OnClickPlace listener = (view, position) -> {

            String nazwa = leki.get(position).getNazwa();
            String dawka = leki.get(position).getDawka();

            Intent intent = new Intent(getApplicationContext(), DoradcaLekow.class);
            Bundle bundle = new Bundle();
            bundle.putString("nazwa", nazwa);
            bundle.putString("dawka", dawka);

            intent.putExtras(bundle);
            startActivity(intent);
        };

        LekAdapter placeAdapter = new LekAdapter(leki,listener);
        recyclerView.setAdapter(LekAdapter);
    }
}