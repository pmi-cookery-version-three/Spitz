package com.natalia.spitz_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Natalia on 05.06.2017.
 */

public class DialogInfo extends DialogFragment {

    private TextView text;
    private ImageView image;

    public DialogInfo() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dialog,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        text = (TextView)view.findViewById(R.id.dialogText);
        image = (ImageView)view.findViewById(R.id.dialogPicture);

        int number = getArguments().getInt("number");
        switch (number){
            case 0:
                text.setText(getResources().getText(R.string.nem));
                image.setImageDrawable(ContextCompat.getDrawable(getContext(),R.drawable.test));
                break;
        }
    }

    public static DialogInfo newInstance(int number) {

        Bundle args = new Bundle();
        args.putInt("number",number);
        DialogInfo fragment = new DialogInfo();
        fragment.setArguments(args);
        return fragment;
    }
}
