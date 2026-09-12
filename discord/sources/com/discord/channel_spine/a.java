package com.discord.channel_spine;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.zoom_layout.ZoomLayoutFixed;
import com.google.android.material.carousel.CarouselLayoutManager;
import sm.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4022e;

    public /* synthetic */ a(int i7, Object obj) {
        this.f4021d = i7;
        this.f4022e = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        boolean z5;
        ng.a aVar;
        switch (this.f4021d) {
            case 0:
                ChannelSpineView.configureAsReplySpline$lambda$1((ChannelSpineView) this.f4022e, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            case 1:
                ChatInputRootView._init_$lambda$10((ChatInputRootView) this.f4022e, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            case 2:
                AudioPlayerView._init_$lambda$8((AudioPlayerView) this.f4022e, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            case 3:
                ZoomLayoutFixed.layoutChangeListener$lambda$0((ZoomLayoutFixed) this.f4022e, view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            case 4:
                qg.a aVar2 = (qg.a) this.f4022e;
                View view2 = aVar2.O;
                ImageView imageView = aVar2.Q;
                if (imageView.getVisibility() == 0 && (aVar = aVar2.f8221x0) != null) {
                    Rect rect = new Rect();
                    imageView.getDrawingRect(rect);
                    aVar.setBounds(rect);
                    aVar.k(imageView, null);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar2.N.getLayoutParams();
                int i17 = (i11 - i7) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i18 = (i12 - i10) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z6 = true;
                if (aVar2.f8223y0 == 1 && aVar2.f8213s0 == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (aVar2.f8213s0 != -2 || view2.getMeasuredWidth() == i17) {
                        z5 = false;
                    } else {
                        layoutParams2.width = Math.max(i17, Math.min(aVar2.f8211q0, aVar2.getMeasuredWidth() - (aVar2.f8217v0 * 2)));
                        z5 = true;
                    }
                    if (view2.getMeasuredHeight() < i18) {
                        layoutParams2.height = i18;
                    } else {
                        z6 = z5;
                    }
                    if (z6) {
                        view2.setLayoutParams(layoutParams2);
                    }
                    break;
                }
                break;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f4022e;
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    view.post(new f(3, carouselLayoutManager));
                }
                break;
        }
    }
}
