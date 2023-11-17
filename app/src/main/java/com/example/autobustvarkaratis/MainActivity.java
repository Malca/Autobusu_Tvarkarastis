package com.example.autobustvarkaratis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button autobusu_s_button = findViewById(R.id.autobusu_stotis_button);
        autobusu_s_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Autobusustotis.class);
            startActivity(showtimes);
        });

        Button autobusu_s_v_button = findViewById(R.id.autobusu_stotis_vytauto_button);
        autobusu_s_v_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Autobusustotisvytauto.class);
            startActivity(showtimes);
        });

        Button ligonines_button = findViewById(R.id.ligonine_button);
        ligonines_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Ligonine.class);
            startActivity(showtimes);
        });

        Button dukstynos_button = findViewById(R.id.dukstyna_button);
        dukstynos_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Dukstyna.class);
            startActivity(showtimes);
        });

        Button kestutis_button = findViewById(R.id.kestucio_button);
        kestutis_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Kestucioaikste.class);
            startActivity(showtimes);
        });

        Button muziejaus_button = findViewById(R.id.muziejus_button);
        muziejaus_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Muziejus.class);
            startActivity(showtimes);
        });

        Button pivonijos_button = findViewById(R.id.pivonija_button);
        pivonijos_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Pivonija.class);
            startActivity(showtimes);
        });

        Button gelzbetonio_button = findViewById(R.id.gelzbetonis_button);
        gelzbetonio_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Gelzbetonis.class);
            startActivity(showtimes);
        });

        Button kreksliu_button = findViewById(R.id.kreksliai_button);
        kreksliu_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Kreksliai.class);
            startActivity(showtimes);
        });

        Button pasiles_button = findViewById(R.id.pasile_button);
        pasiles_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Pasile.class);
            startActivity(showtimes);
        });

        Button zaliasis_button = findViewById(R.id.zaliasis_vienkiemis_button);
        zaliasis_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Zaliasisvienkiemis.class);
            startActivity(showtimes);
        });

        Button pramone_button = findViewById(R.id.pramones_button);
        pramone_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Pramones.class);
            startActivity(showtimes);
        });

        Button pienine_button = findViewById(R.id.pienines_button);
        pienine_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Pienine.class);
            startActivity(showtimes);
        });

        Button geles_button = findViewById(R.id.geliu_button);
        geles_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Geliu.class);
            startActivity(showtimes);
        });

        Button narbutas_button = findViewById(R.id.narbuto_button);
        narbutas_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Narbutas.class);
            startActivity(showtimes);
        });

        Button linai_button = findViewById(R.id.linu_button);
        linai_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Linai.class);
            startActivity(showtimes);
        });

        Button gamyklos_button = findViewById(R.id.gamyklu_button);
        gamyklos_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Gamyklu.class);
            startActivity(showtimes);
        });

        Button biofabriko_button = findViewById(R.id.biofabrikas_button);
        biofabriko_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Biofabrikas.class);
            startActivity(showtimes);
        });

        Button gerseniskiai_button = findViewById(R.id.gerseniskiu_button);
        gerseniskiai_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Gerseniskiu.class);
            startActivity(showtimes);
        });

        Button turgaus_button = findViewById(R.id.turgus_button);
        turgaus_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Turgus.class);
            startActivity(showtimes);
        });

        Button baznycia_button = findViewById(R.id.baznycios_button);
        baznycia_button.setOnClickListener(view -> {
            Intent showtimes = new Intent(this, Baznycios.class);
            startActivity(showtimes);
        });


    }


}