package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;



public class Autobusustotis extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.autobusu_stotis);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/> 4.25 Pašilė Krekšliai 5.30 6.05 6.32 6.55 7.15 7.40 8.35 9.10 9.25 9.50<br/> 10.15 10.40 11.05 11.30 11.59 12.20 12.45 13.10 13.32 14.00 14.32 14.54<br/> 15.15 15.38 16.04 16.30 16.55 17.20 18.15 18.45 20.45<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/> 5.00 Kauno g.-Gerseniškių g. 10.30  18.37 Pašilė<br/><br/>" +
                "<b>Nr. 3 į Krekšlius</b><br/>5.20 Krekšliai  8.00- Žaliasis vnk. 13.52-Žaliasis vnk. 14.49- Žaliasis vnk.<br/> 15.45- Gerseniškių g. 18.04- Žaliasis vnk.<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>5.05 6.06 6.55 9.05 10.12-nuo Dukstynos 11.18-nuo Dukstynos 12.16 12.46<br/> 13.25-nuo Dukstynos 13.47 14.23-nuo Dukstynos 14.50  15.47- nuo Dukstynos<br/>  16.12 16.40 – Paina ir ko 17.10 18.08<br/><br/>" +
                "<b>Nr. 4A į Koklių fabriką</b><br/>7.05 8.33<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>4.45  13.15<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>6.00 6.42 7.30 Pivonijos m. – Žaliasis v. 9.00 10.00 10.52 11.31 12.16<br/> 13.15 14.30 15.09 16.08 17.00 19.02 19.42<br/><br>" +
                "<b>Nr. 7 į Žaliajį vienkiemį (Narbuto)</b><br/>4.45 5.28 – Narbuto  13.08 13.50 – Narbuto  23.28 – iki Žiedo g.<br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/>6.15 7.00 7.50 8.40 10.25 11.17 12.05 13.02 13.50 14.40<br/><br/>" +
                "<b>Nr. 2 į Koklių fabrikas</b><br/>7.00- Koklių f. 11.35 – Koklių f.<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>6.30 7.30 8.30 10.05 11.05 12.05 13.05 14.05 15.05<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>6.12 7.10 8.06 9.01 10.58 - nuo Dukstynos 11.53 - nuo Dukstynos<br/> 13.02 - nuo Dukstynos 13.50 14.50- nuo Dukstynos<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.autobusu_stotis));
        field.setText(sp);
    }


}
