package com.kotlin.mydatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable

class StoryItem(name: String?, email: String?, url: String?) : BaseObservable() {

    var name: String? = name
        @Bindable
        get() = field
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    var email: String? = email
        @Bindable
        get() = field
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

    var profileImageUrl: String? = url



}
