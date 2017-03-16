package dekz.traviscoveralls;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import dekz.traviscoveralls.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        final Calculator calculator = new Calculator();

        binding.btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!TextUtils.isEmpty(binding.etNum1.getText())){
                    binding.tvHasil.setText(String.valueOf(
                            calculator.add(
                                    Double.parseDouble(binding.etNum1.getText().toString()),
                                    Double.parseDouble(binding.etNum2.getText().toString()))));
                }
            }
        });
    }
}
