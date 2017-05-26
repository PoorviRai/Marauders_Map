package com.example.cherry.maraudersmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class Thaneschools extends AppCompatActivity {

    TextView textView2, textView3, textView7;
    private android.content.Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thaneschools);

        textView7 = (TextView) findViewById(R.id.textView7);
        Spanned text7 = Html.fromHtml("<p><h3>Vasant Vihar High School</h3></p>"+"<p>Vasant Vihar High School and Jr College is a private, co-educational, day school located at Vasant Vihar in Thane, Maharashtra, India. The institution was established in 1990 by Goenka & Associates Educational Trust.</p>"
                +"<p><b>Address:</b>2nd Pokhran Road, Vasant Vihar, Thane West, Mumbai, Maharashtra 400610</p>" +
                "<p><b>Phone:</b> 022 2171 4444</p>");

        textView7.setText(text7);

        textView3 = (TextView) findViewById(R.id.textView3);
        Spanned text2 = Html.fromHtml("<p><h3> Hiranandani Foundation School, Thane</h3></p>"+"<p>Hiranandani Foundation School Thane is a school located in the Hiranandani Estate in the state of Maharashtra Thane, India. It was founded by Lakhumal Hiranand Hiranandani. The school was founded in 1999.</p>"+
                "<p><b>Address:</b> Wood Street, Patlipada, Off Ghodbunder Road, Thane, Maharashtra 400607</p>" +
                "<p><b>Phone:</b> 022 2586 7300</p>");

        textView3.setText(text2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Spanned text = Html.fromHtml("<p><h3>C.P. Goenka International School</h3></p>"+
                "<p><b>Address:</b> Maharashtra State Highway 42, Kapurbawdi Junction, Off Ghodbunder Road, Near Ashapura Mandir, Thane West, Thane, Maharashtra 400607</p>"+

                "<p><b>Phone:</b> 022 6575 4444</p>" +

                "<p><b>Affiliation: </b>University of Mumbai</p>");

        textView2.setText(text);
    }
    public void sendMessage1 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.goenkainternational.in/"));
        startActivity(intent);
    }

    public void sendMessage3 (View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.hiranandanischools.edu.in/thane/contactus/index.php"));
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
