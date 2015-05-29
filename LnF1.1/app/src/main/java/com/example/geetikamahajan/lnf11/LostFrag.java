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

public class LostFrag extends Fragment {
    public static String name;
    private String tab;
    private int color;
    public View v0;
    public TextView tv0;
    public T0Int delegate = null;

    public interface T0Int {
        public void T0btnClick();
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
            delegate = (T0Int) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v0 = inflater.inflate(R.layout.lost, container, false);

        Button b0 = (Button)v0.findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delegate.T0btnClick();
            }
        });
        v0.setBackgroundResource(color);

        return v0;
    }


}
