//This class is for demo purposes(Testing) only.
package com.example.tushar.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Tushar on 9/24/2017.
 */
          //creating Event listner
  public class NumbersActivity implements View.OnClickListener {
    @Override
    public void onClick(View view){
        Toast.makeText(view.getContext(),"Going to Numbers Activity",Toast.LENGTH_LONG).show();
        //Intent intent=new Intent(MainActivity.view.getContext(), Numbers.class);
        //startActivity(intent);
    }

  }
