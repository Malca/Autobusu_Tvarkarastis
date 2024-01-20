package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Dukstyna extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dukstyna);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>10.08 11.13 13.20 14.21 15.44<br/><br/><br/>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>10.53 11.48 12.58 14.45<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.dukstyna));
        field.setText(sp);
    }


}
