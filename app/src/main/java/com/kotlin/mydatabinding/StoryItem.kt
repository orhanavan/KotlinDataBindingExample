package com.kotlin.mydatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.BindingAdapter
import android.net.Uri
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequestBuilder

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

    companion object {
        @JvmStatic
        @BindingAdapter("android:profileImage")
        fun loadImage(view: SimpleDraweeView, url: String) {
            val imageURI: Uri = Uri.parse(url)
            val request = ImageRequestBuilder.newBuilderWithSource(imageURI).build()
            view.setImageRequest(request)
        }

    }

}
