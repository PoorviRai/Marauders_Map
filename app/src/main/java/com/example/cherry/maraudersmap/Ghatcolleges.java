package com.example.cherry.maraudersmap;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

import static com.example.cherry.maraudersmap.R.id.textView2;

public class Ghatcolleges extends AppCompatActivity {

    TextView textView2, textView4, textView3;
    private android.content.Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghatcolleges);

        textView2 = (TextView) findViewById(R.id.textView2);
        Spanned text = Html.fromHtml("<p><h3>K. J. Somaiya College of Engineering</h3></p>"+"<p>The K. J. Somaiya College of Engineering, abbreviated as KJSCE, was established in 1983 at Somaiya Vidyavihar.</p>" +
                "<p><b>Address:</b> Vidyanagar, Vidya Vihar East, Vidyavihar, Mumbai, Maharashtra 400077</p>"+

                "<p><b>Undergraduate tuition and fees: </b> 131,818 INR (2016)</p>" +

                "<p><b>Affiliation: </b>University of Mumbai</p>");

        textView2.setText(text);

        textView4 = (TextView) findViewById(R.id.textView4);
        Spanned text1 = Html.fromHtml("<p><h3>Ramniranjan Jhunjhunwala College</h3></p>"+"<p>Ramniranjan Jhunjhunwala College is college located in Mumbai, India. It is affiliated to University of Mumbai. It was founded by Shri Nandikishore Singh Jairamji in 1938.</p>"
                +"<p><b>Address:</b> Opp. Ghatkopar Railway Station, CGS Colony, Pant Nagar, Ghatkopar West, Mumbai, Maharashtra 400086</p>" +
                "<p><b>Phone:</b> 022 2515 1763</p>" +
                "<p><b>Affiliation:</b> National Assessment and Accreditation Council</p>" +
                "<p><b>Founded:</b> August 15, 1938</p>" +
                "<p><b>Motto:</b> Knowledge is all Ambrosia.</p>");

        textView4.setText(text1);

        textView3 = (TextView) findViewById(R.id.textView3);
        Spanned text2 = Html.fromHtml("<p><h3>SMT.P.N. DOSHI WOMEN'S COLLEGE - MANAGED BY SPRJ KANYASHALA TRUST</h3></p>"+"<p><b>Address:</b> Jag Dhir Boda Vidya Sankul, Came Lane, Ghatkopar West, Mumbai, Maharashtra 400086</p>" +
                "<p><b>Phone:</b> 022 2512 3484</p>"+
                "<p><b>Motto:</b> Sa Vidya Ya Vimuktaye (That education which liberates)</p> ");

        textView3.setText(text2);


    }
    public void kj (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.somaiya.edu/kjsce"));
        startActivity(intent);
    }

    public void jhunjhun (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.rjcollege.edu.in/"));
        startActivity(intent);
    }

    public void spn (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://spndoshicollege.com/"));
        startActivity(intent);
    }
}
