package ar;

import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.presentation.message.MessageAccessoriesAdapter;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.fastest_list.android.FastestListSections;
import com.discord.fastest_list.android.FastestListView;
import com.discord.fastest_list.react.FastestListViewManager;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.react_strings.RenderContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2931e;

    public /* synthetic */ j(int i7, Object obj) {
        this.f2930d = i7;
        this.f2931e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f2930d) {
            case 0:
                ((co.s) this.f2931e).invoke((Throwable) obj);
                return Unit.f14616a;
            case 1:
                return MessageAccessoriesAdapter.onBindViewHolder$lambda$13((MessageAccessoriesAdapter) this.f2931e, ((Integer) obj).intValue(), (MessageAccessory) obj2, (MessagePartViewHolder) obj3);
            case 2:
                return MediaGalleryDisplayComponentView._init_$lambda$0((MediaGalleryDisplayComponentView) this.f2931e, (MediaGalleryDisplayComponent) obj, (MediaGalleryItem) obj2, (MessagePartViewHolder) obj3);
            case 3:
                jr.b bVar = (jr.b) this.f2931e;
                jr.b.f14071g.set(bVar, null);
                bVar.b(null);
                return Unit.f14616a;
            case 4:
                ((jr.f) this.f2931e).d();
                return Unit.f14616a;
            case 5:
                return I18nUtilsKt.i18nFormat$lambda$5((RenderContext) this.f2931e, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue());
            default:
                return FastestListViewManager.createViewInstance$lambda$4((FastestListViewManager) this.f2931e, (FastestListView) obj, (FastestListSections.Entry) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ j(jr.b bVar, jr.a aVar) {
        this.f2930d = 3;
        this.f2931e = bVar;
    }
}
