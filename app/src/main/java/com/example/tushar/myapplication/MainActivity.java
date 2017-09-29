package com.example.tushar.myapplication;

import android.content.Intent;
import android.provider.FontsContract;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  //Creating object of Event Listner
        NumbersActivity numbersActivity=new NumbersActivity();

        //find the id of conponent(View) on which we want to attach event listner
        TextView numbers=(TextView) findViewById(R.id.numbers);
        //Attach the enent listner  to the view
        numbers.setOnClickListener(numbersActivity);


        TextView colors= (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Going to Colors Activity",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this, colors.class);
                startActivity(i);

            }
        });    */

      TextView numberslist= (TextView) findViewById(R.id.numbers);
        numberslist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Going to Numbers Activity.",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,Numbers.class);
                startActivity(i);

            }
        });

        TextView colorslist= (TextView) findViewById(R.id.colors);
        colorslist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(view.getContext(),"Going to Colors Activity.",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this, colors.class);
                startActivity(i);

            }
        });


        TextView familymemberslist= (TextView) findViewById(R.id.familymembers);
        familymemberslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Going to Family Members Activity",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this, familymembers.class);
                startActivity(i);

            }
        });

        TextView phraseslist= (TextView) findViewById(R.id.phrases);
        phraseslist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Going to Phrases Activity",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this, phrases.class);
                startActivity(i);

            }
        });
    }



   // public void onFamilyMembersList(View view) {
      //  Intent i = new Intent(this, familymembers.class);
      //  startActivity(i);
  /// }
   // public void onPhrasesList(View view){
      //  Intent i=new Intent(this, phrases.class);
      // startActivity(i);
 }


