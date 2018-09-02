package com.kotlin.mydatabinding

import android.databinding.BindingAdapter
import android.net.Uri
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequestBuilder

class Adapter {
    companion object {
        @JvmStatic
        @BindingAdapter("android:Image")
        fun loadImage(view: SimpleDraweeView, url: String) {
            val imageURI: Uri = Uri.parse(url)
            val request = ImageRequestBuilder.newBuilderWithSource(imageURI).build()
            view.setImageRequest(request)
        }

    }
}
