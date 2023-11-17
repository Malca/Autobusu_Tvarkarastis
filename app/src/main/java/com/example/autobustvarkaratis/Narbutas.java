package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Narbutas extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.narbutas);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 5 į Autobusų stotį</b><br/>5.50<br/><br/>" +
                "<b>Nr. 5 į Pašilę</b><br/>14.45 23.15<br/><br/><br>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.narbutas));
        field.setText(sp);
    }


}
