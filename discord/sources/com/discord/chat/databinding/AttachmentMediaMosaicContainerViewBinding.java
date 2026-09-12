package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class AttachmentMediaMosaicContainerViewBinding implements ViewBinding {

    @NonNull
    public final RecyclerView mosaic;

    @NonNull
    private final View rootView;

    private AttachmentMediaMosaicContainerViewBinding(@NonNull View view, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.mosaic = recyclerView;
    }

    @NonNull
    public static AttachmentMediaMosaicContainerViewBinding bind(@NonNull View view) {
        int i7 = R.id.mosaic;
        RecyclerView recyclerView = (RecyclerView) a.k(i7, view);
        if (recyclerView != null) {
            return new AttachmentMediaMosaicContainerViewBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static AttachmentMediaMosaicContainerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.attachment_media_mosaic_container_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
