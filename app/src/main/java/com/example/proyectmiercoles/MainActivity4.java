import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    // Método para abrir MainActivity6
    public void openMainActivity6(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}
