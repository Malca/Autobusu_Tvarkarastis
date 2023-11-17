package com.example.autobustvarkaratis;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class Gerseniskiu extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.gerseniskiu);

        String text = "<b>Darbo dienomis</b><br/><br/><br/>" +
                "<b>Nr. 3 į Krekšlius - Žaliąjį vienkiemį</b><br/>6.01 Žaliasis vnk. 6.57 Žaliasis vnk. 16.05 Krekšliai 16.50 Krekšliai<br/><br/>";
        TextView field = findViewById(R.id.textView);
        Spanned sp = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT);
        TextView stotele = findViewById(R.id.stotelesname);
        stotele.setText(getResources().getString(R.string.gerseniskiu_stotele));
        field.setText(sp);
    }


}
