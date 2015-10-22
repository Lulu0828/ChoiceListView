package com.lulu.choicelistview;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/**
 * 单选listview item
 * Created by Lu on 2015/10/22.
 */
public class ChoiceView extends FrameLayout implements Checkable{

    private RadioButton radioButton;
    private TextView textView;

    public ChoiceView(Context context) {
        super(context);
        View.inflate(context, R.layout.item_single_choice, this);
        radioButton = (RadioButton) findViewById(R.id.rb_choiceview);
        textView = (TextView) findViewById(R.id.tv_choicetext);
    }

    public void setText(String text) {
        textView.setText(text);
    }

    @Override
    public void setChecked(boolean checked) {
        radioButton.setChecked(checked);
    }

    @Override
    public boolean isChecked() {
        return radioButton.isChecked();
    }

    @Override
    public void toggle() {
        radioButton.toggle();
    }
}
