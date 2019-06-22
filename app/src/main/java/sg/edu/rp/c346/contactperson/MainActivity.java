package sg.edu.rp.c346.contactperson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mNum, wNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNum = findViewById(R.id.tvMobileNum);
        wNum = findViewById(R.id.tvWorkNum);

        registerForContextMenu(mNum);
        registerForContextMenu(wNum);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        //Dynamic add
        menu.add(0, 0, 0, "Call");
        menu.add(0, 1, 1, "Text");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getItemId() == 0) {
            Toast.makeText(MainActivity.this, "Call ", Toast.LENGTH_SHORT).show();

            return true;
        } else if (item.getItemId() == 1) {
            Toast.makeText(MainActivity.this, "Text", Toast.LENGTH_SHORT).show();

            return true;
        }
        return super.onContextItemSelected(item);


    }
}
