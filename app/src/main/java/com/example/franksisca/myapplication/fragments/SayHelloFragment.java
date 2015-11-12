package com.example.franksisca.myapplication.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.franksisca.myapplication.R;

/**
 * Created by franksisca on 11/11/15.
 */
public class SayHelloFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = SayHelloFragment.class.getCanonicalName();

    public static final int BUTTON_ACTION = R.id.GenericButton;
    public static final int EDIT_TEXT_ACTION = R.id.GenericEditText;
    public static final int TEXT_VIEW__ACTION = R.id.GenericText;

    private Button button;
    private EditText editText;
    private TextView textView;

    public static SayHelloFragment newInstance() {
        return new SayHelloFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.say_hello_fragment_layout, container, false);
    }

    private void initListeners() {
        button.setOnClickListener(this);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                String testo = String.valueOf(editText.getText());
                if (!testo.isEmpty()) {
                    textView.setText(testo);
                } else {
                    textView.clearComposingText();
                    textView.setHint("Nessun carattere inserito");


                }

            }
        });
    }

    private void initViews(View view) {
        button = (Button) view.findViewById(this.BUTTON_ACTION);
        editText = (EditText) view.findViewById(this.EDIT_TEXT_ACTION);
        textView = (TextView) view.findViewById(this.TEXT_VIEW__ACTION);


    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        initListeners();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case BUTTON_ACTION:
                changeText();
                break;
        }
    }

    private void changeText() {
        String testo = String.valueOf(editText.getText());
        if (!testo.isEmpty()) {
            textView.setText(testo);
        } else {
            textView.setText("");
            textView.setHint("Nessun carattere inserito");
        }

    }
}
