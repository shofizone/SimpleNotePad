package notepad.shofiul.sk.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private NodesDBAdapter mNodesDBAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNodesDBAdapter = new NodesDBAdapter(MainActivity.this);
        mNodesDBAdapter.open();
    }
}
