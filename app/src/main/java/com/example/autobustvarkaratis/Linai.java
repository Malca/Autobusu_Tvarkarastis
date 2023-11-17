package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Linai extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.linu_stotele);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 5 į Narbutą</b><br/>5.27 13.57<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>15.03 23.28<br/><br/><br>" +
                "<b>Nr. 5 į Gamyklų gatvę</b><br/>5.21 13.51 14.49 23.25<br/><br/><br>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.linu_stotele));
        field.setText(sp);
    }


}
