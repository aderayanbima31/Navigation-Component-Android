package com.derayanbimaa.myaull.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Created by Aderayanbima on 11/04/22.
 */
data class DataModel(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)