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
package com.example.miwok;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView numbersView;
    TextView colorsView;
    TextView phrasesView;
    TextView familyMembersView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        numbersView = findViewById(R.id.numbers);
        colorsView = findViewById(R.id.colors);
        phrasesView = findViewById(R.id.phrases);
        familyMembersView = findViewById(R.id.family);

        numbersView.setOnClickListener(v -> openNumbers());
        colorsView.setOnClickListener(v -> openColors());
        phrasesView.setOnClickListener(v -> openPhrases());
        familyMembersView.setOnClickListener(v -> openFamilyMembers());

    }

    private void openNumbers(){
        Intent intent = new Intent(getApplicationContext(), NumbersActivity.class);
        startActivity(intent);
    }

    private void openFamilyMembers(){
        Intent intent = new Intent(getApplicationContext(), FamilyMembersActivity.class);
        startActivity(intent);
    }

    private void openPhrases(){
        Intent intent = new Intent(getApplicationContext(), PhrasesActivity.class);
        startActivity(intent);
    }

    private void openColors(){
        Intent intent = new Intent(getApplicationContext(), ColorsActivity.class);
        startActivity(intent);
    }
}
