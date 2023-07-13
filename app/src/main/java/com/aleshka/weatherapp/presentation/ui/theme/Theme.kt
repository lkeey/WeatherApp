package com.aleshka.weatherapp.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.aleshka.weatherapp.presentation.ui.theme.Shapes
import com.aleshka.weatherapp.presentation.ui.theme.Typography

@Composable
fun WeatherAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}