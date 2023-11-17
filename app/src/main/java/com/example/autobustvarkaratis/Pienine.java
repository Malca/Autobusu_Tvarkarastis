package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Pienine extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pienine);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/> 5.08 6.05 6.30 6.50 7.20 7.45 8.10 9.00 9.28 9.45 10.15<br/> 10.40 11.05 11.30 11.55 12.20 12.45 13.10 13.35 13.50<br/> 14.25 14.50 15.15 15.40 16.04 16.36 17.16 17.55 18.32 19.06 21.00- Koklių f.<br/><br/>" +
                "<b>Nr. 4A į Koklių fabriką</b><br/>7.40<br/><br/>" +
                "<b>Poilsio dienomis</b><br/><br/><br/>" +
                "<b>Nr. 1 į Autobusų stotį</b><br/>6.35 7.25 8.15 9.05 10.50 11.40 12.30 13.25 14.15 15.05<br/> 15.55 16.45 17.35 19.15 19.55<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.pienine));
        field.setText(sp);
    }


}
