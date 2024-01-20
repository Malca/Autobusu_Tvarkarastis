package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Pivonija extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pivonija);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/> 4.48 Krekšliai-Pieninė 21.16<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/> 5.31 6.38 7.42 8.45 AS 11.31 12.21 13.11 14.23 15.27<br/> 16.26 17.11 17.50 Autobusų st. 19.05 19.48 Žiedo g. 20.36 Autobusų st.<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>5.30 6.37 7.23 9.44-Dukstyna 10.49-Dukstyna 11.57<br/> 12.55- Dukstyna 13.28 14.04-Dukstyna 14.30 14.58 AS 15.26-Dukstyna <br/> 16.24 16.47 17.24 17.50 18.40<br/><br/>" +
                "<b>Nr. 4A į Autobusų stotį</b><br/>7.20 – Pieninė 8.11 8.59<br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>15.25<br/><br/>" +
                "<b>Nr. 5 į Narbutą</b><br/>5.21  13.51  23.48 – iki Žiedo g.<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 2 į Biofrabriką</b><br/>7.27 8.27 9.30-Taurgus 10.06 12.01 13.01 14.05- AS<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>7.08 8.08 9.08 10.43 11.43 12.43 13.43 14.43 15.43<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.pivonija));
        field.setText(sp);
    }


}
