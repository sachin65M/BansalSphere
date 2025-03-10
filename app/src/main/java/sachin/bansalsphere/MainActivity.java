package sachin.bansalsphere;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.compose.setContent;
import androidx.compose.foundation.layout.fillMaxSize;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.Surface;
import androidx.compose.material3.Text;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ComponentActivityKt.setContent(this, () -> {
        BansalSphereTheme.INSTANCE.getBansalSphereTheme().getComposeView(MainActivity.this, view -> {
        // A surface container using the 'background' color from the theme
        SurfaceKt.Surface(
            view,
            Modifier.fillMaxSize(),
            MaterialTheme.colorScheme(MaterialThemeKt.getColorScheme()).getBackground()
        );
        Greeting("Android");
    });
    });
    }
}

@Composable
public void Greeting(String name) {
    Text(text = "Hello " + name + "!");
}

@Preview(showBackground = true)
@Composable
public void GreetingPreview() {
    BansalSphereTheme.INSTANCE.getBansalSphereTheme().getComposeView(this, view -> {
        Greeting("Android");
    });
}
