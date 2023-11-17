package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Gelzbetonis extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gelzbetonis);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/> 4.55<br/><br/>" +
                "<b>Nr. 3 į Gerseniškių gatvę</b><br/>5.40 6.38 7.30 – Autobusų st. 8.31 – Autobusų st. 14.16 – Autobusų st. <br/>15.12 – Autobusų st. 16.33 17.19 – Autobusų st. 18.37 – Autobusų st.<br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>6.28 7.07 7.54 9.37 10.37 11.18 12.00 12.52 13.57<br/> 14.54 15.39 16.37 17.37 19.23 20.05<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>6.41 7,39 8.35 9.29 11.24- Dukstyna 12.24- Dukstyna<br/> 13.30 14.21- Dukstyna 15.21- Dukstyna 16.21 17.21 18.21 19.43<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.gelzbetonis));
        field.setText(sp);
    }


}
