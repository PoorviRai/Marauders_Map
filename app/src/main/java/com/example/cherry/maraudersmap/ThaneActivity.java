package com.example.cherry.maraudersmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class ThaneActivity extends AppCompatActivity {


    TextView textView2, textView4, textView3, textView5, textView6, textView7;
    private android.content.Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thane);
        textView2 = (TextView) findViewById(R.id.textView2);
        Spanned text = Html.fromHtml("<p><h3>C.P. Goenka International School</h3></p>"+
                "<p><b>Address:</b> Maharashtra State Highway 42, Kapurbawdi Junction, Off Ghodbunder Road, Near Ashapura Mandir, Thane West, Thane, Maharashtra 400607</p>"+

                "<p><b>Phone:</b> 022 6575 4444</p>" +

                "<p><b>Affiliation: </b>University of Mumbai</p>");

        textView2.setText(text);

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

        textView3 = (TextView) findViewById(R.id.textView3);
        Spanned text2 = Html.fromHtml("<p><h3> Hiranandani Foundation School, Thane</h3></p>"+"<p>Hiranandani Foundation School Thane is a school located in the Hiranandani Estate in the state of Maharashtra Thane, India. It was founded by Lakhumal Hiranand Hiranandani. The school was founded in 1999.</p>"+
                "<p><b>Address:</b> Wood Street, Patlipada, Off Ghodbunder Road, Thane, Maharashtra 400607</p>" +
                "<p><b>Phone:</b> 022 2586 7300</p>");

        textView3.setText(text2);

        textView6 = (TextView) findViewById(R.id.textView6);
        Spanned text6 = Html.fromHtml("<p><h3>Institute of Management and Computer Studies</h3></p>"+"<p>Institute of Management and Computer Studies is an Indian business school, in Thane, Maharashtra.</p>" +
                "<p><b>Address:</b> C-4, Wagle Industrial Estate, Near Mulund Check Naka, Opp. Aplab, Thane West, Mumbai, Maharashtra 400604</p>"+

                "<p><b>Phone: </b>022 2583 2466</p>" +
                "<p><b>Motto: </b> Excellence in management education, training, consultancy and research for success.</p>" +
                "<p><b>Founded: </b>2003</p>" +
                "<p><b>Affiliations: </b> All India Council for Technical Education, University of Mumbai</p>");

        textView6.setText(text6);

        textView7 = (TextView) findViewById(R.id.textView7);
        Spanned text7 = Html.fromHtml("<p><h3>Vasant Vihar High School</h3></p>"+"<p>Vasant Vihar High School and Jr College is a private, co-educational, day school located at Vasant Vihar in Thane, Maharashtra, India. The institution was established in 1990 by Goenka & Associates Educational Trust.</p>"
                +"<p><b>Address:</b>2nd Pokhran Road, Vasant Vihar, Thane West, Mumbai, Maharashtra 400610</p>" +
                "<p><b>Phone:</b> 022 2171 4444</p>");

        textView7.setText(text7);
    }
    public void messageschool (View view)
    {
        Intent intent = new Intent(this, Thaneschools.class);
        startActivity(intent);
    }

    public void messagecollege (View view)
    {
        Intent intent = new Intent(this, Thanecolleges.class);
        startActivity(intent);
    }

    public void sendMessage1 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.goenkainternational.in/"));
        startActivity(intent);
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

    public void sendMessage3 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.hiranandanischools.edu.in/thane/contactus/index.php"));
        startActivity(intent);
    }

    public void kj (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.imcost.edu.in/"));
        startActivity(intent);
    }

    public void jhunjhun (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.gaet.edu.in/vvhs/contact.jsp"));
        startActivity(intent);
    }
}
