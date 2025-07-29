package com.example.lap32;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.List;





public class MainActivity extends AppCompatActivity {

    private static Arrays Array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public static void main(String[] args) {

        //Note note1 = new Note("Do lab3 and sent in the Google classroom");

        TextNote textNoteA = new TextNote("Do homework", "Finish Lab 3");
        String resultToDoSth = textNoteA.getTextContent();
        textNoteA.setTextContent("Do homework 2 now!");
        textNoteA.display();

        List<String> items = Arrays.asList("go to market","read the bool","sleep");
        CheckListNote note1 = new CheckListNote("To do","20/06/2025",items);
        note1.display();


        // --- Demonstrating OOP with User classes ---

        // 1. Creating instances of concrete subclasses
        BaseUser userJam = new RegularUser("jam", "jam@gmail.com", "password123");
        BaseUser adminSom = new AdminUser("som", "som.admin@gmail.com", "adminpass", "Full Access");

        // 2. Demonstrating Polymorphism
        // Both objects are treated as 'BaseUser', but call their specific 'displayProfile' method.
        System.out.println("Demonstrating Polymorphism:");
        userJam.displayProfile();
        adminSom.displayProfile();

        // 3. Demonstrating Encapsulation
        // We can't access private fields directly, e.g., userJam.username = "new_jam"; // This would cause an error
        // We must use the public setter method
        System.out.println("Updating username via setter...");
        userJam.setUsername("jam_updated");
        userJam.displayProfile();


        /*note1.title="OOP homework";
        note1.context="Do lab3 and sent in the Google classroom";
        note1.getSummary();

        User jam = new User();
        jam.username="jam";
        jam.email="jam@gamail.com";
        jam.password="*********";
        jam.getSummary();*/
    }
}