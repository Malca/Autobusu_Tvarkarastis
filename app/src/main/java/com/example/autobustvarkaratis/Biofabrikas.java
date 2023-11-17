package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Biofabrikas extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.biofabrikas);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>5.15, 6.10, 7.10 – Paina ir ko 8.05-Pašilė, 10.55 11.53 12.47<br/> 13.55 15.04 16.00 16.48 17.34-Koklių f. 19.20-Pašilė (20.00-Pašilė nuo Žiedo g.)<br/><br/>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 2 į Koklių fabriką</b><br/>7.57 8.57 12.35 13.45<br/><br/>" +
                "<b>Nr. 2 į Autobusų stotį</b><br/>10.30<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.biofabriko_stotele));
        field.setText(sp);
    }


}
