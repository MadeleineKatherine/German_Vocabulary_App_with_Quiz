package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Madeleine Katherine on 19.01.2018.
 */

public class VocabularyActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.vocabulary);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(VocabularyActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link FamilyActivity}
                Intent familyIntent = new Intent(VocabularyActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent colorsIntent = new Intent(VocabularyActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the colors category
        TextView verbs = (TextView) findViewById(R.id.verbs);

        // Set a click listener on that View
        verbs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent verbsIntent = new Intent(VocabularyActivity.this, VerbsActivity.class);

                // Start the new activity
                startActivity(verbsIntent);
            }
        });

        TextView city = (TextView) findViewById(R.id.city);

        // Set a click listener on that View
        city.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ColorsActivity}
                Intent cityIntent = new Intent(VocabularyActivity.this, CityActivity.class);

                // Start the new activity
                startActivity(cityIntent);
            }
        });
        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(VocabularyActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView food = (TextView) findViewById(R.id.food);

        // Set a click listener on that View
        food.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent foodIntent = new Intent(VocabularyActivity.this, FoodActivity.class);

                // Start the new activity
                startActivity(foodIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView body = (TextView) findViewById(R.id.body);

        // Set a click listener on that View
        body.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent bodyIntent = new Intent(VocabularyActivity.this, BodyActivity.class);

                // Start the new activity
                startActivity(bodyIntent);
            }
        });

        TextView home = (TextView) findViewById(R.id.home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent homeIntent = new Intent(VocabularyActivity.this, HomeActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        TextView travels = (TextView) findViewById(R.id.travels);

        // Set a click listener on that View
        travels.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent travelsIntent = new Intent(VocabularyActivity.this, TravelsActivity.class);

                // Start the new activity
                startActivity(travelsIntent);
            }
        });
        TextView shop = (TextView) findViewById(R.id.shop);

        // Set a click listener on that View
        shop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent shopIntent = new Intent(VocabularyActivity.this, ShopActivity.class);

                // Start the new activity
                startActivity(shopIntent);
            }
        });

        TextView time = (TextView) findViewById(R.id.time);

        // Set a click listener on that View
        time.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent timeIntent = new Intent(VocabularyActivity.this, TimeActivity.class);

                // Start the new activity
                startActivity(timeIntent);
            }
        });

        TextView school = (TextView) findViewById(R.id.school);

        // Set a click listener on that View
        school.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent schoolIntent = new Intent(VocabularyActivity.this, SchoolActivity.class);

                // Start the new activity
                startActivity(schoolIntent);
            }
        });

        TextView sport = (TextView) findViewById(R.id.sport);

        // Set a click listener on that View
        sport.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PhrasesActivity}
                Intent sportIntent = new Intent(VocabularyActivity.this, SportActivity.class);

                // Start the new activity
                startActivity(sportIntent);
            }
        });


    }}



