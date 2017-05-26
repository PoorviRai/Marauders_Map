package com.example.cherry.maraudersmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class Thanecolleges extends AppCompatActivity {

    TextView textView4, textView5, textView6;
    private android.content.Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanecolleges);

        textView6 = (TextView) findViewById(R.id.textView6);
        Spanned text6 = Html.fromHtml("<p><h3>Institute of Management and Computer Studies</h3></p>"+"<p>Institute of Management and Computer Studies is an Indian business school, in Thane, Maharashtra.</p>" +
                "<p><b>Address:</b> C-4, Wagle Industrial Estate, Near Mulund Check Naka, Opp. Aplab, Thane West, Mumbai, Maharashtra 400604</p>"+

                "<p><b>Phone: </b>022 2583 2466</p>" +
                "<p><b>Motto: </b> Excellence in management education, training, consultancy and research for success.</p>" +
                "<p><b>Founded: </b>2003</p>" +
                "<p><b>Affiliations: </b> All India Council for Technical Education, University of Mumbai</p>");

        textView6.setText(text6);

        textView5 = (TextView) findViewById(R.id.textView5);
        Spanned text5 = Html.fromHtml("<p><h3>KC College of Engineering, Thane</h3></p>"+"<p>K.C. College of Engineering is a private engineering college located in Thane, Mumbai, Maharashtra, India. </p>"+
                "<p><b>Address:</b> Near Asmita Society, Near Sadguru Garden, Mith Bunder Road, Valmiki Nagar, Thane East, Navi Mumbai, Maharashtra 400081</p>" +
                "<p><b>Phone:</b> 022 2532 7100</p>"+
                "<p><b>Affiliation:</b> University of Mumbai</p> ");

        textView5.setText(text5);

        textView4 = (TextView) findViewById(R.id.textView4);
        Spanned text1 = Html.fromHtml("<p><h3>R.J. Thakur College</h3></p>"+"<p>R.J.Thakur Degree College is an educational institution, which strives to form men and women who will build a just and humane world. It strives for an intellectual endeavor that focuses on critical and creative thinking, with the aim of social transformation.</p>"
                +"<p><b>Address:</b>Veer Savarkar Nagar, Near Kamgar Hospital, Thane, Mumbai, Maharashtra 400606</p>" +
                "<p><b>Phone:</b> 022 2580 4523</p>");

        textView4.setText(text1);
    }

    public void spn (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.kccoe.org/"));
        startActivity(intent);
    }

    public void sendMessage2 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://rjthakurcollege.in/"));
        startActivity(intent);
    }

    public void kj (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.imcost.edu.in/"));
        startActivity(intent);
    }
}
