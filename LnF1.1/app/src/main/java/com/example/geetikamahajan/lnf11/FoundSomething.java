package com.example.geetikamahajan.lnf11;

/**
 * Created by Geetika Mahajan on 5/27/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FoundSomething extends Fragment {
    public static String name;
    private String tab;
    private int color;
    public View v1;
    public T1Int delegate = null;

    public interface T1Int {
        public void T1btnClick();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        tab = bundle.getString("tab");
        color = bundle.getInt("color");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            delegate = (T1Int) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v1 = inflater.inflate(R.layout.foundsmthng, container, false);

        Button b1 = (Button)v1.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delegate.T1btnClick();
            }
        });
        v1.setBackgroundResource(color);

        return v1;
    }

}
