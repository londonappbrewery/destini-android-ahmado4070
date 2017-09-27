package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mTextView;
    private Button mButtonTop,mButtonBot;
    private int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView=(TextView)findViewById(R.id.storyTextView);
        mButtonTop=(Button)findViewById(R.id.buttonTop);
        mButtonBot=(Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mStoryIndex==1 || mStoryIndex==2) {
                mStoryIndex=3;
                mTextView.setText(R.string.T3_Story);
                mButtonTop.setText(R.string.T3_Ans1);
                mButtonBot.setText(R.string.T3_Ans2);
            } else {
                mStoryIndex=6;
                mTextView.setText(R.string.T6_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBot.setVisibility(View.GONE);
            }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mStoryIndex==1){
                mStoryIndex=2;
                mTextView.setText(R.string.T2_Story);
                mButtonTop.setText(R.string.T2_Ans1);
                mButtonBot.setText(R.string.T2_Ans2);
            }else if (mStoryIndex==2){
                mStoryIndex=4;
                mTextView.setText(R.string.T4_End);
                mButtonBot.setVisibility(View.GONE);
                mButtonTop.setVisibility(View.GONE);
            }else{
                mStoryIndex=3;
                mTextView.setText(R.string.T5_End);
                mButtonTop.setVisibility(View.GONE);
                mButtonBot.setVisibility(View.GONE);
            }
            }
        });

    }
}
