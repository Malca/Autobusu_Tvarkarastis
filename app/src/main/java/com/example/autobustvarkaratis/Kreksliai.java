package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Kreksliai extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kreksliai);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/> 4.53<br/><br/>" +
                "<b>Nr. 3 į Gerseniškių gatvę</b><br/>5.38 6.33 7.27 -Autobusų st. 8.27 – Autobusų st. 14.13 – Autobusų st. 15.09 – Autobusų st. <br/>16.28 17.15 -Autobusų st. 18.32 – Autobusų st.<br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>6.24 7.04 7.49 9.32 10.32 11.14 11.56 12.47 13.54<br/> 14.52 15.34 16.32 17.32 19.21 20.01<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>6.37 7,35 8.31 9.25 11.21- Dukstyna 12.20- Dukstyna 13.26<br/> 14.17- Dukstyna 15.17- Dukstyna 16.17 17.17 18.17 19.39<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.kreksliai));
        field.setText(sp);
    }


}
