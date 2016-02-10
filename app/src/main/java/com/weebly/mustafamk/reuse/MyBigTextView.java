package com.weebly.mustafamk.reuse;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Shop on 09-Feb-16.
 */
public class MyBigTextView extends TextView {


    public MyBigTextView(Context context){
        super(context);

        setText("Hello Universe");
        setTextSize(30);
        setBackgroundColor(Color.DKGRAY);
        setTextColor(Color.WHITE);
        RelativeLayout.LayoutParams relativParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        relativParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
    }
}
