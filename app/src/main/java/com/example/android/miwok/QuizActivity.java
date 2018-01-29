package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Madeleine Katherine on 21.01.2018.
 */

public class QuizActivity extends AppCompatActivity {


    Button choice1,choice2,choice3;

    TextView score, question, answear;

    private QuestionActivity mQuestions=new QuestionActivity();
    private String mAnswear;
    private int mScore=0;
    private int mQuestionLength=mQuestions.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.quiz);

        r=new Random();

        choice1=(Button)findViewById(R.id.choice1);
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(choice1.getText()==mAnswear){
                    mScore++;
                    score.setText("Score: "+mScore);
                    answear.setTextColor(getResources().getColor(R.color.category_family));
                    answear.setText("Great job!");
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    mScore=mScore+0;
                    answear.setText(mAnswear);
                    answear.setTextColor(getResources().getColor(R.color.category_body));
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }

            }
        });


        choice2=(Button)findViewById(R.id.choice2);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice2.getText()==mAnswear){
                    mScore++;
                    score.setText("Score: "+mScore);
                    answear.setText("Bravo!");
                    answear.setTextColor(getResources().getColor(R.color.category_family));
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    mScore=mScore+0;
                    score.setText("Score: "+mScore);
                    answear.setTextColor(getResources().getColor(R.color.category_body));
                    answear.setText(mAnswear);
                    updateQuestion(r.nextInt(mQuestionLength));
                }

            }
        });

        choice3=(Button)findViewById(R.id.choice3);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(choice3.getText()==mAnswear){
                    mScore++;
                    answear.setText("Well done!");
                    answear.setTextColor(getResources().getColor(R.color.category_family));
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }
                else{
                    mScore=mScore+0;
                    answear.setText(mAnswear);
                    answear.setTextColor(getResources().getColor(R.color.category_body));
                    score.setText("Score: "+mScore);
                    updateQuestion(r.nextInt(mQuestionLength));
                }

            }
        });



        question=(TextView) findViewById(R.id.question);
        score=(TextView)findViewById(R.id.score);
        answear=(TextView)findViewById(R.id.answear);


        updateQuestion(r.nextInt(mQuestionLength));

    }

    private void updateQuestion(int num){
        question.setText(mQuestions.getQuestion(num));
        choice1.setText(mQuestions.getChoice1(num));
        choice2.setText(mQuestions.getChoice2(num));
        choice3.setText(mQuestions.getChoice3(num));

        mAnswear=mQuestions.getCorrectAnswear(num);

    }
}
