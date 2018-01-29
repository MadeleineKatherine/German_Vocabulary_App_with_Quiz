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

public class CityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("city", "die Stadt", R.drawable.city));
        words.add(new Word("retaurant", "das Restaurant", R.drawable.restaurant));
        words.add(new Word("street", "die Straße", R.drawable.street));
        words.add(new Word("post office", "die Post", R.drawable.post));
        words.add(new Word("airport", "der Flughafen", R.drawable.airport));
        words.add(new Word("ATM", "der Geldautomat", R.drawable.atm));
        words.add(new Word("cinema", "das Kino", R.drawable.cinema));
        words.add(new Word("hospital", "das Krankenhaus", R.drawable.hospital));
        words.add(new Word("museum", "das Museum", R.drawable.museum));
        words.add(new Word("parking", "der Parkplatz", R.drawable.parking));
        words.add(new Word("swimming pool", "das Schwimmbad", R.drawable.pool));
        words.add(new Word("park", "der Park", R.drawable.park));
        words.add(new Word("library", "die Bibliothek", R.drawable.library));
        words.add(new Word("railway station", "der Bahnhof", R.drawable.railway));
        words.add(new Word("bus stop", "die Bushaltestelle", R.drawable.busstop));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_city);

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