package com.example.jetpackcomposebasics.ui.theme

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasics.R


@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(value = "", onValueChange = {}, leadingIcon = {
        Icon(
            imageVector = Icons.Default.Search, contentDescription = null
        )
    },

        placeholder = {
            Text(text = stringResource(R.string.placeholder_search))
        }, modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}

@Preview
@Composable
fun SearchPreview() {
    SearchBar()
}
