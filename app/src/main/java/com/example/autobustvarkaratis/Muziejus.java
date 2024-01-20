package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Muziejus extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.muziejus);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pašilę, Koklių fabriką</b><br/> 4.30 Pašilė – Krekšliai, 21.08 Koklių f. – AS<br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/> 21.18<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/> 5.24 6.23 7.19 – Paina ir ko 8.18 – Pašilė, 11.08 12.04 13.00 14.08 <br/>15.17 16.13 17.01 17.45 18.45 – Pašilė 19.29 – Pašilė 20.06 – Pašilė<br/><br/>" +
                "<b>Nr. 2 į Autobusų stotį</b><br/> 8.50 17.53 20.38<br/><br/>" +
                "<b>Nr. 3 į Krekšlius</b><br/> 5.28 6.16 – Žaliasis vnk. 7.06 – Žaliasis vnk. 8.10 – Žaliasis vnk. <br/>14.01- Žaliasis vnk. 14.57- Žaliasis vnk. 16.15 17.01 18.12- Žaliasis vnk.<br/><br/>" +
                "<b>Nr. 3 į Autobusų stotį</b><br/> 5.45-Gerseniškių g. 7.40 8.37 14.20 15.16 17.24 18.40<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>5.10 6.14 7.05 9.15 10.20 11.26 12.24 12.54 13.33 13.55<br/> 14.31 15.00 15.55 16.20 16.48 – Paina ir ko 17.20 18.16<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>5.35 6.45 7.30 9.50-Dukstyna 10.55-Dukstyna 12.03 13.01-Dukstyna <br/>13.33  14.07-Dukstyna 14.35 15.04 15.30- Dukstyna 16.30 16.52 17.30 17.56 18.46<br/><br/>" +
                "<b>Nr. 4A į Koklių fabriką</b><br/>7.12 7.46 8.43<br/><br/>" +
                "<b>Nr. 4A į Autobusų stotį</b><br/>8.20 9.08<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>4.55  13.25  14.56  23.23<br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>15.31<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>6.08 6.50 7.38 – Pivonijos m. -Žaliasis v. 9.10 10.10 11.00 11.40<br/> 12.26 13.25 14.38 15.17 16.17 17.10 19.10 19.50<br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį</b><br/>6.32 7.12 8.00 9.42 10.42 11.22 12.04 12.56 14.02 15.00 15.44 16.42<br/> 17.42 19.28 20.08<br/><br/><br>" +
                "<b>Nr. 7 į Žaliajį vienkiemį</b><br/>4.51 13.14 14.55 23.34<br/><br>" +
                "<b>Nr. 7 į Autobusų stotį</b><br/>5.20 13.43 15.21<br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 2 į Autobusų stotį</b><br/>14.13<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>7.10 8.11 9.11 9.41 – Pašilė 11.46 12.46 13.56<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>6.40 7.40 8.40 10.15 11.15 12.15 13.15 14.15 15.15<br/><br/>" +
                "<b>Nr. 4 į Autobusų stotį</b><br/>7.15 8.15 9.15 10.50 11.50 12.50 13.50 14.50 15.50<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>6.20 7.17 8.13 9.09 11.06 12.01 13.10 13.58 14.58<br/><br/>" +
                "<b>Nr. 6 į Autobusų stotį (Dukstyną)</b><br/>6.47 7.45 8.41 9.35 11.30- Dukstyna 12.28- Dukstyna<br/> 13.35 14.27-Dukstyna 15.27- Dukstyna<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.muziejus));
        field.setText(sp);
    }


}
