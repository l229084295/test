package bwf.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MakeXml makeXml  = new MakeXml();
        init();
    }

    private void init() {

        ViewPager viewPager = new ViewPager(this);
    }

}
