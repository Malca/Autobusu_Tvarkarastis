package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Pasile extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pasile);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Krekšlius - Pieninę</b><br/>4.40<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/> 7.35 – nuo Paina ir ko 8.35 AS 18.58 19.40 Žiedo g<br/> 20.30 Autobusų st.<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>5.22 6.31 7.17  9.33- Dukstyna 10.38 Dukstyna 11.47<br/> 12.45- Dukstyna 13.19 13.54-Dukstyna 14.19 14.50 AS 15.18 – Dukstyna <br/>16.15 16.36 17.16 – nuo Paina ir ko 17.40 18.32<br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>15.17<br/><br/>" +
                "<b>Nr. 5 į Narbutą</b><br/>5.12 13.42 23.41<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 2 į Biofrabriką</b><br/>10.00<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>7.00 8.00 9.00 10.35 11.35 12.35 13.35 14.35 15.35<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.pasile));
        field.setText(sp);
    }


}
