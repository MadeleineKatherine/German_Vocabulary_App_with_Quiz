/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("meat", "das Fleisch", R.drawable.meat));
        words.add(new Word("chicken", " das Hänchen", R.drawable.chicken));
        words.add(new Word("ham", "der Schinken", R.drawable.ham));
        words.add(new Word("sausage", "die Wurst", R.drawable.sausage));
        words.add(new Word("apple", "der Apfel", R.drawable.apple));
        words.add(new Word("orange", "die Orange", R.drawable.orange));
        words.add(new Word("strawbery", "die Erdbeere", R.drawable.strawberry));
        words.add(new Word("raspberry", "die Himbeere", R.drawable.raspberry));
        words.add(new Word("grape", "die Traube", R.drawable.grape));
        words.add(new Word("tomato", "die Tomate", R.drawable.tomato));

        words.add(new Word("potato", "die Kartoffel", R.drawable.potato));
        words.add(new Word("carrot", "die Karrotten", R.drawable.carrot));
        words.add(new Word("onion", "die Zwiebel", R.drawable.onion));
        words.add(new Word("pear", "die Birne", R.drawable.pear));
        words.add(new Word("watermelon", "die Wassermelone", R.drawable.watermelon));

        words.add(new Word("cheese", "der Käse", R.drawable.cheese));
        words.add(new Word("milk", "die Milch", R.drawable.milk));
        words.add(new Word("butter", "die Butter", R.drawable.butter));
        words.add(new Word("rice", "der Reis", R.drawable.rice));
        words.add(new Word("pasta", "die Nudeln", R.drawable.pasta));
        words.add(new Word("bread", "das Brot", R.drawable.bread));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_food);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Release the media player if it currently exists because we are about to
                // play a different sound file

                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Request audio focus so in order to play the audio file. The app needs to play a
                // short audio file, so we will request audio focus with a short amount of time
                // with AUDIOFOCUS_GAIN_TRANSIENT.

            }
        });
    }

}