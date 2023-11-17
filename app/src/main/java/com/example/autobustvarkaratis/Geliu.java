package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Geliu extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.geliu);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>15.04  23.29<br/><br/>" +
                "<b>Nr. 5 į Narbutą</b><br/>5.26  13.56<br/><br/><br>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.geliu));
        field.setText(sp);
    }


}
