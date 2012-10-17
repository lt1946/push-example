package cn.jpush.android.example;

import java.util.HashSet;
import java.util.Set;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import cn.jpush.android.api.InstrumentedActivity;
import cn.jpush.android.api.JPushInterface;

public class MainActivity extends InstrumentedActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ((Button) findViewById(R.id.register)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JPushInterface.init(getApplicationContext());
            }
        });
        
        ((Button) findViewById(R.id.setTagsAndAlias)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	  Set<String> s = new HashSet<String>();
                  s.add("tag");
                  s.add("fruit");
                  JPushInterface.setAliasAndTags(getApplicationContext(), "alais1", s);
            }
        });
        

        ((Button) findViewById(R.id.setPushTime)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	   Set<Integer> days = new HashSet<Integer>();
                   days.add(0);
                   days.add(1);
                   days.add(2);
                   days.add(3);
                   days.add(4);
                   days.add(5);
                   JPushInterface.enableNotification(getApplicationContext(), true);
                   JPushInterface.setPushTime(getApplicationContext(), days, 10, 23);
            }
        });
        TextView tx = (TextView)findViewById(R.id.label);
        tx.setText("IEMI: " + JPushInterface.getIMEI(getApplicationContext()));
        
    }
}
