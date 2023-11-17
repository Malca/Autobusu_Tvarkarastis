package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Pramones extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pramones);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/> 5.12 6.10 6.35 6.55 7.24 7.50 8.15 9.05 9.30 9.50 10.20<br/> 10.45 11.10 11.35 12.00 12.25 12.50 13.15 13.40 13.55 14.30<br/> 14.55 15.20 15.45 16.10 16.41 17.00 17.19 18.00 18.36 19.10 21.03- Koklių f.<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>5.19 6.16 7.14 – Paina ir ko 8.10 Pašilė 11.02 11.58 12.53<br/> 14.01 15.10 16.07 16.55 17.37 19.24- Pašilė 20.02- Pašilė<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/> 5.08 Kauno g.-Gerseniškių g. 5.40 6.45 7.50 10.40 11.40 12.32 13.18<br/> 14.30 15.32 16.33 17.17 19.10 19.50 Žiedo g.<br/><br/>" +
                "<b>Nr. 3 į Krekšliai - Žaliasis Vienkiemis</b><br/>6.05- Žaliasis v. 7.00- Žaliasis v. 16.10 16.55<br/><br/>" +
                "<b>Nr. 4A į Koklių fabriką</b><br/>7.43<br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>5.55<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>14.50 23.18<br/><br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/>6.40 7.30 8.20 9.08 10.54 11.45 12.35 13.30 14.20 15.10<br/> 16.00 16.50 17.40 19.20 19.58<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>8.04 9.04 12.40 13.50<br/><br/>" +
                "<b>Nr. 2 į Autobusų stotį</b><br/>10.36<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.pramones));
        field.setText(sp);
    }


}
