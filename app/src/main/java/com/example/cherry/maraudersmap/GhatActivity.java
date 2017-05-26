package com.example.cherry.maraudersmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class GhatActivity extends AppCompatActivity {

    TextView textView2, textView4, textView3, textView5, textView6, textView7;
    private android.content.Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghat);

        textView2 = (TextView) findViewById(R.id.textView2);
        Spanned text = Html.fromHtml("<p><h3>Sheth Virchand Dhanji School</h3></p>"+
                "<p><b>Address:</b> Hingwala Ln, Saibaba Nagar, Pant Nagar, Ghatkopar East, Mumbai, Maharashtra 400077</p>"+

                "<p><b>Phone:</b> 022 2501 1062</p>" +

                "<p><b>Affiliation: </b>University of Mumbai</p>");

        textView2.setText(text);

        textView5 = (TextView) findViewById(R.id.textView5);
        Spanned text5 = Html.fromHtml("<p><h3>SMT.P.N. DOSHI WOMEN'S COLLEGE - MANAGED BY SPRJ KANYASHALA TRUST</h3></p>"+"<p><b>Address:</b> Jag Dhir Boda Vidya Sankul, Came Lane, Ghatkopar West, Mumbai, Maharashtra 400086</p>" +
                "<p><b>Phone:</b> 022 2512 3484</p>"+
                "<p><b>Motto:</b> Sa Vidya Ya Vimuktaye (That education which liberates)</p> ");

        textView5.setText(text5);

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

        textView6 = (TextView) findViewById(R.id.textView6);
        Spanned text6 = Html.fromHtml("<p><h3>K. J. Somaiya College of Engineering</h3></p>"+"<p>The K. J. Somaiya College of Engineering, abbreviated as KJSCE, was established in 1983 at Somaiya Vidyavihar.</p>" +
                "<p><b>Address:</b> Vidyanagar, Vidya Vihar East, Vidyavihar, Mumbai, Maharashtra 400077</p>"+

                "<p><b>Undergraduate tuition and fees: </b> 131,818 INR (2016)</p>" +

                "<p><b>Affiliation: </b>University of Mumbai</p>");

        textView6.setText(text6);

        textView7 = (TextView) findViewById(R.id.textView7);
        Spanned text7 = Html.fromHtml("<p><h3>Ramniranjan Jhunjhunwala College</h3></p>"+"<p>Ramniranjan Jhunjhunwala College is college located in Mumbai, India. It is affiliated to University of Mumbai. It was founded by Shri Nandikishore Singh Jairamji in 1938.</p>"
                +"<p><b>Address:</b> Opp. Ghatkopar Railway Station, CGS Colony, Pant Nagar, Ghatkopar West, Mumbai, Maharashtra 400086</p>" +
                "<p><b>Phone:</b> 022 2515 1763</p>" +
                "<p><b>Affiliation:</b> National Assessment and Accreditation Council</p>" +
                "<p><b>Founded:</b> August 15, 1938</p>" +
                "<p><b>Motto:</b> Knowledge is all Ambrosia.</p>");

        textView7.setText(text7);
    }
    public void messageschool (View view)
    {
        Intent intent = new Intent(this, Ghatschools.class);
        startActivity(intent);
    }

    public void messagecollege (View view)
    {
        Intent intent = new Intent(this, Ghatcolleges.class);
        startActivity(intent);
    }

    public void sendMessage1 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://sddrst.org/"));
        startActivity(intent);
    }

    public void spn (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://spndoshicollege.com/"));
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

}
