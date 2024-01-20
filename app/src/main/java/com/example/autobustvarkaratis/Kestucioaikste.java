package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Kestucioaikste extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.kestucio_aikste);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/> 5.16 6.15 6.40 6.59 7.28 7.55 8.20 9.10 9.36 9.55 10.25 10.50<br/> 11.15 11.40 12.05 12.30 12.55 13.20 13.45 14.00 14.35 15.00 15.25 15.50<br/> 16.14 16.46 17.05 17.24 18.05 18.40 19.16 21.07 Koklių f.<br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/> 5.00 5.40 6.15 6.40 7.05 7.23 7.50 8.45 9.18 9.35 10.00 10.25 10.50<br/> 11.15 11.40 12.07 12.30 12.55 13.20 13.40 14.10 14.40 15.02 15.25 15.48<br/> 16.14 16.40 17.05 17.30 18.23 18.55 20.52<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>5.23 6.22 7.18- Paina ir ko, 8.17- Pašilė 11.07 12.03 12.59 14.07<br/> 15.16 16.12 17.00 17.44 18.45 (nuo Muziejus. į Pašilę) 19.28- Pašilė 20.05- Pašilė<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/> 5.08 Kauno g.-Gerseniškių g. 5.40 6.45 7.50 10.40 11.40 12.32 13.18<br/> 14.30 15.32 16.33 17.17 19.10 19.50 Žiedo g.<br/><br/>" +
                "<b>Nr. 3 į Krekšlius</b><br/>5.28 (nuo Muziejus) 6.15- Žaliasis vnk. 7.05- Žaliasis vnk.  16.14 16.15 17.00<br/><br/>" +
                "<b>Nr. 3 į Gerseniškių gatvę</b><br/>5.47 6.45 15.53 16.38<br/><br/>" +
                "<b>Nr. 4A į Pieninę</b><br/>7.27<br/><br/>" +
                "<b>Nr. 4A į Koklių fabriką</b><br/>7.45<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>14.55  23.22<br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>6.02<br/><br/>" +
                "<b>Nr. 5 į Narbutą</b><br/>5.36  14.06  23.52 – Žiedo g.<br/><br/><br>" +
                "<b>Nr. 7 į Žaliąjį vienkiemį</b><br/>14,54<br/><br>" +
                "<b>Nr. 7 į Autobusų stotį</b><br/>5.54 23.22<br/><br>" +
                "<b>Nr. 7 į Narbutą</b><br/>5.34  13.56  23.55 – Žiedo g.<br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/>6.45 7.35 8.25 9.15 10.58 11.50 12.40 13.35 14.25 15.15<br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/>6.25 7.10 8.00 8.50 10.35 11.17 12.15 13.10 14.00 14.50<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>8.10 9.10 9.42- Pašilė 10.43- AS 11.45- (Nuo Muziejaus) 12.45 13.55<br/><br/>" +
                "<b>Nr. 2 į Biofrabriką</b><br/>7.36 8.36 10,15 12.10 13.10<br/><br/>" +
                "<b>Nr. 6 į Dukstyną</b><br/>10.30<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.kestucio_aikste));
        field.setText(sp);
    }


}
