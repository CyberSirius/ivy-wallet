package com.ivy.core.ui.amount

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.text.DecimalFormatSymbols

@Composable
fun rememberDecimalSeparator(): Char = remember { localDecimalSeparator() }

fun localDecimalSeparator(): Char {
    return DecimalFormatSymbols.getInstance().decimalSeparator
}