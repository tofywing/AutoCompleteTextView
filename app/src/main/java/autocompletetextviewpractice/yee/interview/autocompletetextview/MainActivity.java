package autocompletetextviewpractice.yee.interview.autocompletetextview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by Yee on 12/28/15.
 */
public class MainActivity extends Activity {

    AutoCompleteTextView mAutoText;
    ArrayAdapter<String> mAdapter;
    public static final String[] DATA_SET = new String[]{"aa", "aab", "aac", "bba", "bb"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        mAutoText = (AutoCompleteTextView) findViewById(R.id.autoText);
        mAdapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, DATA_SET);
        mAutoText.setAdapter(mAdapter);
    }
}
