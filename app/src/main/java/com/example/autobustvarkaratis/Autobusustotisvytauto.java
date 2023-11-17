package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Autobusustotisvytauto extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.autobusu_stotis_vytauto);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>10.12 11.18 13.25 14.23 15.47 16.12 17.10<br/><br/>" +
                "<b>Nr. 4 į Dukstyną</b><br/>10.00 11.05 13.09 14.15 15.39<br/><br/>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 6 į Dukstyną</b><br/>10.38 11.38 12.36 14.35 15.35<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>10.58 11.53 13.02 14.50 15.50<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.autobus_stotis_vytauto_g));
        field.setText(sp);
    }


}
