package com.weebly.mustafamk.reuse;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Instansvariabel

    TextView greeting; //deklarera en textView
    MyBigTextView biggerGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tilldela mainContent motsvarande view i vår

        //RelativeLayout mainContainer = (RelativeLayout) findViewById(R.id.main_container);

        //Initiera

        //greeting = new TextView(this);
        //biggerGreeting = new MyBigTextView(this);

        //ändra på attributen för vår textView

        //greeting.setText("Hello World"); // TODO: fixa i strings.xml
        //greeting.setTextSize(20);
        //greeting.setBackgroundColor(Color.DKGRAY);
        //greeting.setTextColor(getResources().getColor(android.R.color.darker_gray));

        // Layout Params
        //ViewGroup.LayoutParams myParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        // en specifik LayoutParams för en relativlayout
        //RelativeLayout.LayoutParams myRelativeParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        //myRelativeParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        //greeting.setLayoutParams(myRelativeParams);

        //---------------------------------------------------------------------------------------------------------


        //hur kan jag använda en XML Fil med Layout för java koden?
        //så att jag slipper skriva varje xml attribut med Java-Kod

        // Inflate man renderar layouten i en xml-filen
        //och sparar det i en View här i vår Java-Kod

        //vi behöver något som kan rendera åt oss...
        LayoutInflater layoutInflater = getLayoutInflater();

        LinearLayout linearlayout = (LinearLayout) findViewById(R.id.linear_layout);

        RelativeLayout mainContainer = (RelativeLayout) findViewById(R.id.main_container);
        View logotypeSquare = layoutInflater.inflate(R.layout.logotype_square, mainContainer, false);


        //TextView logoTypeText = (TextView) logotypeSquare.findViewById(R.id.textView);

        //logoTypeText.setText("Kalle");

        for(int i = 1; i<=2; i++){
            //1. vi behöver en inflater(Vi har redan)

            //2. låt inflater hämta XML-kod o skapa en View

            View aLogoTypeSquare = layoutInflater.inflate(R.layout.logotype_square, linearlayout, false);

            // 3. gör ändringar på aLogoTypeSquare
            //3.1 ändra på texten inuti

            //TextView aLogoTypeSquareText = (TextView) aLogoTypeSquare.findViewById(R.id.textView);
            //aLogoTypeSquareText.setText("" + i);

            //4. Lägg till vår logoTypeSquare i vår layout

            linearlayout.addView(aLogoTypeSquare);

        }

        RelativeLayout.LayoutParams myRelativParams2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        logotypeSquare.setLayoutParams(myRelativParams2);
        myRelativParams2.addRule(RelativeLayout.CENTER_IN_PARENT);

        mainContainer.addView(logotypeSquare);

        //-------------------------------------------------------------------------------------------------------


        //Lägg till text i vår main Container
        //mainContainer.addView(greeting);
        //mainContainer.addView(biggerGreeting);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
