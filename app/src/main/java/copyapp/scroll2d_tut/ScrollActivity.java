package copyapp.scroll2d_tut;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import copyapp.scroll2d_tut.databinding.ActivityScrollBinding;

public class ScrollActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScrollBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_scroll);
        binding.horizontal.scrollView = binding.vertical;
    }
}
