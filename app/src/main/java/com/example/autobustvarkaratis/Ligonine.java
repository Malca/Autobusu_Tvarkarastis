package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Ligonine extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ligonine);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/> 4.26 Pašilė-Krekšliai 5.31 6.06 6.33 6.56 7.16 7.41 8.36 9.11 9.26 9.51<br/> 10.16 10.41 11.06 11.31 12.00 12.21 12.46 13.11 <br/>13.33 14.01 14.33 14.55 15.16 15.39 16.05 16.31<br/> 16.56 17.21 18.16 18.46 20.46<br/><br/>" +
                "<b>Nr. 2 į Biofabriką</b><br/> 5.01 Kauno g.-Gerseniškių g. 10.31 18.38 Pašilė<br/><br/>" +
                "<b>Nr. 3 į Krekšlius</b><br/>5.21 Krekšliai 8.01- Žaliasis v. 13.53- Žaliasis v. 14.49- Žaliasis v.<br/> 15.46 Gerseniškių g. 18.05- Žaliasis v.<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>5.06 6.07 6.56 9.06 10.13 11.19 12.17 12.47 13.26 13.48<br/> 14.24 14.51 15.48 16.13 16.41 – Paina ir ko  17.11 18.09<br/><br/>" +
                "<b>Nr. 4 į Dukstyną</b><br/> 9.58 11.03 13.08 14.13 15.37<br/><br/>" +
                "<b>Nr. 4A į Koklių fabriką</b><br/>7.06 8.34<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>4.46  13.16<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>6.01 6.43 7.31 Pivonijos mikr. – Žaliasis v. 9.01 10.01 10.53 11.32 Krekšliai 12.17<br/> 13.16 14.31 15.10 16.09 17.01 19.03 19.43<br/><br/><br>" +
                "<b>Nr. 7 į Žaliajį vienkiemį (Narbuto)</b><br/>4.46 – Žal.vnk 5.29 – Narbuto  13.09 Žal.vnk.<br/>  13.51 – Narbuto  23.29 Žal.vnk.<br/><br>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Pieninę</b><br/>6.16 7.01 7.51 8.41 10.26 11.18 12.06 13.03 13.51 14.41<br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>7.01 11.36<br/><br/>" +
                "<b>Nr. 4 į Pašilę</b><br/>6.31 7.31 8.31 10.06 11.06 12.06 13.06 14.06 15.06<br/><br/>" +
                "<b>Nr. 6 į Žaliajį vienkiemį</b><br/>6.13 7.11 8.07 9.02 10.59 11.54 13.03 13.51 14.51<br/><br/>" +
                "<b>Nr. 6 į Dukstyną</b><br/>10.37 11.37 12.35 14.34<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.ligonine));
        field.setText(sp);
    }


}
