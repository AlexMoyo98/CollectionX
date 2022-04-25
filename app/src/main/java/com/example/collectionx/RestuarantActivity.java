package com.example.collectionx;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class RestuarantActivity extends AppCompatActivity {
    FloatingActionButton actionButton;
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;
    ImageView Menu;
    Button food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restuarant);
//data to populate the recyclerView with
        ArrayList<String> items = new ArrayList<>();
        items.add("First CardView Item");
        items.add("Second CardView Item");
        items.add("Third CardView Item");
        items.add("Forth CardView Item");
        items.add("Fifth CardView Item");
        items.add("Sixth CardView Item");

        actionButton = findViewById(R.id.add_btn);
        Menu = findViewById(R.id.menu);
        food.findViewById(R.id.RecyFood);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, items);
        recyclerView.setAdapter(adapter);


        recyclerView = findViewById(R.id.recyclerView);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addPhraseDialogBox();
            }
        });
    }
    /**
     * alert dialogbox for add new item to recycleview
     */
    private void addPhraseDialogBox(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getApplicationContext(),
                R.style.dialogBox);
        alertDialog.setTitle("Add Category");
        final EditText input = new EditText(getApplicationContext());
        alertDialog.setIcon(R.drawable.ic_category);

        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String item = input.getText().toString();
                items.add(item);
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "Item Added",
                        Toast.LENGTH_SHORT).show();
            }
        }).create();

        alertDialog.setPositiveButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }).create();
        alertDialog.show();

    }
}