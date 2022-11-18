package com.example.programaticamente3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.linearLayout);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        n =7;
        anadeLayouts();
    }

    private void anadeLayouts() {
        Button b;
        LinearLayout ll;

        for (int i = 0; i < n; i++) {
            ll=new LinearLayout(this);
            ll.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        1));
            ll.setOrientation(LinearLayout.VERTICAL);
            ll.setId(View.generateViewId());

            for (int j = 0; j < n; j++) {
                b= new Button(this);
                b.setLayoutParams(new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        1));
                b.setText(("btn"+i+"-"+j));
                b.setId(View.generateViewId());
                ll.addView(b);
                         }
    linearLayout.addView(ll);
    }
    }
}