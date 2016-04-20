package Lab3_tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.wlw003.lab3.MainActivity;
import com.example.wlw003.lab3.R;

/**
 * Created by wlw003 on 4/19/2016.
 */
public class lab_tests extends ActivityInstrumentationTestCase2<MainActivity>{
    MainActivity mainActivity;
    public lab_tests(){
        super(MainActivity.class);
    }

    public void test_sum(){
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        int result = Integer.parseInt(textView.getText().toString());

        EditText nu1 = (EditText) mainActivity.findViewById(R.id.editText2);
        EditText nu2 = (EditText) mainActivity.findViewById(R.id.editText3);

        int a = Integer.parseInt(nu1.getEditableText().toString());
        int b = Integer.parseInt(nu2.getEditableText().toString());

        assertEquals(a+b, result);
    }

}
