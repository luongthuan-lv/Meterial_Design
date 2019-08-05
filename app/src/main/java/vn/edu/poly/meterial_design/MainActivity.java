package vn.edu.poly.meterial_design;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Snackbar(View view) {
        Snackbar.make(view, "Hello i'm Snackbar", 5000).setAction("Ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
    }

    public void TextInPutLayout(View view) {
        startActivity(new Intent(MainActivity.this, LoginActivity.class));
    }

    public void FloatingButton(View view) {
        startActivity(new Intent(MainActivity.this, FloatActivity.class));
    }

    public void NavigationView(View view) {
        startActivity(new Intent(this, NavigationView.class));
    }

    public void CollapsingLayout(View view) {
        startActivity(new Intent(this, ScrollingActivity.class));
    }
}
