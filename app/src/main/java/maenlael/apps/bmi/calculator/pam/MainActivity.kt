package maenlael.apps.bmi.calculator.pam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import maenlael.apps.bmi.calculator.pam.theme.BmiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BmiTheme {
                App()
            }
        }

        WindowCompat.setDecorFitsSystemWindows(window, false)
    }
}
