package com.example.cherry.maraudersmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class Ghatschools extends AppCompatActivity {

    TextView textView2, textView4, textView3;
    private android.content.Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghatschools);

        textView2 = (TextView) findViewById(R.id.textView2);
        Spanned text = Html.fromHtml("<p><h3>Sheth Virchand Dhanji School</h3></p>"+
                "<p><b>Address:</b> Hingwala Ln, Saibaba Nagar, Pant Nagar, Ghatkopar East, Mumbai, Maharashtra 400077</p>"+

                "<p><b>Phone:</b> 022 2501 1062</p>" +

                "<p><b>Affiliation: </b>University of Mumbai</p>");

        textView2.setText(text);

        textView4 = (TextView) findViewById(R.id.textView4);
        Spanned text1 = Html.fromHtml("<p><h3>Garodia International Centre for Learning</h3></p>"+"<p>Garodia International Centre for Learning also known as Garodia International School, is an educational institution based in Ghatkopar, Mumbai, India. GICL owns various educational subsidiary including P. G. Garodia School, P. G.</p>"
                +"<p><b>Address:</b>153,Garodia Nagar, Ghatkopar East, Mumbai, Maharashtra 400077 </p>" +
                "<p><b>Phone:</b> 022 2506 1133</p>" +
                "<p><b>Number of students:</b> 2,200</p>" +
                "<p><b>School type:</b> Affiliated school, Mixed-sex education</p>" +
                "<p><b>Founded:</b>  1969</p>" +
                "<p><b>Motto:</b>One with the World.</p>");

        textView4.setText(text1);

        textView3 = (TextView) findViewById(R.id.textView3);
        Spanned text2 = Html.fromHtml("<p><h3>Universal School, Ghatkopar</h3></p>"+"<p>Universal’s singular endeavour is to prepare children that are creative, confident & articulate – children that are prepared to meet the challenges of the world’s best colleges and universities.</p>"+
                "<p><b>Address:</b> Tilak Rd, Sindhu Wadi, Ghatkopar East, Mumbai, Maharashtra 400077</p>" +
                "<p><b>Phone:</b> 022 6690 0000</p>");

        textView3.setText(text2);
    }

    public void sendMessage1 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://sddrst.org/"));
        startActivity(intent);
    }

    public void sendMessage2 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://garodiainternational.org/"));
        startActivity(intent);
    }

    public void sendMessage3 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://ghatkopar.universalschool.edu.in/"));
        startActivity(intent);
    }
}
