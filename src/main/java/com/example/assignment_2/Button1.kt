package com.example.assignment_2

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView
import androidx.core.widget.TextViewOnReceiveContentListener
import org.w3c.dom.Text

@SuppressLint("RestrictedApi")
class Button() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    fun setOnClickListener(function: () -> Unit) {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Button> {
        override fun createFromParcel(parcel: Parcel): Button {
            return Button(parcel)
        }

        override fun newArray(size: Int): Array<Button?> {
            return arrayOfNulls(size)
        }
    }

}
