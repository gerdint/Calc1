package com.example.Calc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends Activity {
    TextView log;
    EditText val, op;

    private View.OnTouchListener valueListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent e) {
            log.append(op.getText());
            op.setText("");
            return false;
        }
    };

    private View.OnTouchListener operatorListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent e) {
            log.append(val.getText());
            val.setText("");
            return false;
        }
    };

//    public boolean onTouch(View v, MotionEvent event) {
//        log.append(event.);
//        return false;
//    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        log = (TextView) findViewById(R.id.log);
        val = (EditText) findViewById(R.id.value);
        val.setOnTouchListener(valueListener);
        op = (EditText) findViewById(R.id.operator);
        op.setOnTouchListener(operatorListener);
    }
}
