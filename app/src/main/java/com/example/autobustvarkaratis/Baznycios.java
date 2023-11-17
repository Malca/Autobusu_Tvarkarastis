package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Baznycios extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.baznycios);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Krekšlius - Pieninę</b><br/>4.41<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/>7.36 – nuo Paina ir ko 8.36 18.59 19.41 Žiedo g 20.31 Autobusų st.<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>5.23 6.32 7.18  9.34- Dukstyna 10.39 Dukstyna 11.48 12.46- Dukstyna<br/> 13.20 13.55-Dukstyna 14.20 14.51 15.19 – Dukstyna  16.16 16.37 17.17 – nuo Paina ir ko 17.41  18.33<br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>15.18<br/><br/>" +
                "<b>Nr. 5 į Narbutą</b><br/>5.13 13.43 23.42 iki Žiedo g.<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 2 į Biofrabriką</b><br/>10.00<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>7.00 8.00 9.00 10.35 11.35 12.35 13.35 14.35 15.35<br/> 16.35 17.35 19.35<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.baznycios_stotele));
        field.setText(sp);
    }


}
