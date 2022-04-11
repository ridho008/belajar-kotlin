package com.surya.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class SuperHero (
    val imgSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String
) : Parcelable