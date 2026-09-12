package com.discord.chat.presentation.root;

import android.view.View;
import com.discord.emoji_picker.EmojiPickerScroller;
import com.discord.fastest_list.android.FastestListView;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4323e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4324i;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f4322d = i7;
        this.f4323e = obj;
        this.f4324i = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f4322d) {
            case 0:
                ChatView.attachPortalViewToChatList$lambda$5((View) this.f4323e, (ChatView) this.f4324i, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            case 1:
                EmojiPickerScroller.scrollViewLayoutChanged$lambda$5((EmojiPickerScroller) this.f4323e, (Function2) this.f4324i, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            case 2:
                FastestListView.onLayoutChangeListener$lambda$4((FastestListView) this.f4323e, (Function5) this.f4324i, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            default:
                mm.a aVar = (mm.a) this.f4323e;
                Screen screen = ((e0) this.f4324i).a();
                Intrinsics.checkNotNullParameter(screen, "screen");
                aVar.f15885a = true;
                if (aVar.f15886b) {
                    screen.requestTriggeringPostponedEnterTransition$react_native_screens_release();
                    screen.triggerPostponedEnterTransitionIfNeeded$react_native_screens_release();
                    break;
                }
                break;
        }
    }
}
