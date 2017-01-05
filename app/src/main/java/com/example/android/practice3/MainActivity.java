package com.example.android.practice3;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.practice3.R;

import static android.R.id.message;
import static com.example.android.practice3.R.id.android_cookie_image_view;
import static com.example.android.practice3.R.id.status_text_view;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.

        ImageView changeImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        changeImage.setImageResource(R.drawable.after_cookie);



        // TODO: Find a reference to the TextView in the layout. Change the text.

        TextView newMessage =(TextView) findViewById(status_text_view);
        newMessage.setText("I\'m so f*cking full");

        //call method
        // changeMessage("I am so f*cking full");
    }


    private void changeMessage(String message){
        TextView newMessage =(TextView) findViewById(status_text_view);
        newMessage.setText(message);
    }


}