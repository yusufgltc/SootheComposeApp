import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasics.R

@Composable
fun AlignYourBodyElement(
    @DrawableRes drawableRes: Int, @StringRes text: Int, modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier
    ) {
        Image(
            painter = painterResource(drawableRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(text), modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            ), style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyElementPreview() {
    AlignYourBodyElement(
        text = R.string.ab1_inversions,
        drawableRes = R.drawable.ab1_inversions,
        modifier = Modifier.padding(8.dp)
    )
}
