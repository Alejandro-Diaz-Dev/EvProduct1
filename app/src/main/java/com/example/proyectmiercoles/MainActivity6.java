import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
    }

    // Método para abrir MainActivity8
    public void openMainActivity8(View view) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
}
