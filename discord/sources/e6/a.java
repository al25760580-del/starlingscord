package e6;

import android.view.View;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.bridge.spoiler.SpoilerableData;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentAdapter;
import com.discord.chat.presentation.message.view.polls.PollMediaView;
import kotlin.jvm.functions.Function6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLongClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8089e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8090i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ SpoilerableData f8091v;

    public /* synthetic */ a(Object obj, Object obj2, SpoilerableData spoilerableData, int i7) {
        this.f8088d = i7;
        this.f8089e = obj;
        this.f8090i = obj2;
        this.f8091v = spoilerableData;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f8088d) {
            case 0:
                return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$1((MediaGalleryDisplayComponentAdapter) this.f8089e, (MediaGalleryDisplayComponent) this.f8090i, (MediaGalleryItem) this.f8091v, view);
            case 1:
                return MediaGalleryDisplayComponentAdapter.onBindViewHolder$lambda$6((MediaGalleryDisplayComponentAdapter) this.f8089e, (MediaGalleryDisplayComponent) this.f8090i, (MediaGalleryItem) this.f8091v, view);
            default:
                return PollMediaView.setMedia$lambda$6((PollMediaView) this.f8089e, (Function6) this.f8090i, (Attachment) this.f8091v, view);
        }
    }
}
