package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Zaliasisvienkiemis extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.zaliasis_vienkiemis);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 3 į Autobusų stotį</b><br/>6.32 Gerseniškių g. 7.25  8.25 14.11 15.07 18.30<br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>(Nuo Krekšlių Nr.1 4.53 Pieninė) 6.22 7.02 7.48 9.30 10.30<br/> 11.12 11.54 12.45 13.52 14.50 15.32 16.30 17.30 19.20 20.00<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>6.35 7.33 8.29 9.23 11.19-Dukstyna 12.18- Dukstyna 13.24<br/> 14.15- Dukstyna 15.15- Dukstyna 16.15 17.15 18.15 19.37<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.zaliasis_vienkiemis));
        field.setText(sp);
    }


}
