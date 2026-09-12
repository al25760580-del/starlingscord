package com.discord.mobile_voice_overlay;

import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MobileVoiceOverlay f4499e;

    public /* synthetic */ a(MobileVoiceOverlay mobileVoiceOverlay, int i7) {
        this.f4498d = i7;
        this.f4499e = mobileVoiceOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4498d) {
            case 0:
                return MobileVoiceOverlay.onTrashVoiceBubble$lambda$26(this.f4499e, (OverlayVoiceBubble) obj);
            case 1:
                return MobileVoiceOverlay.voiceBubbleProvider$lambda$9(this.f4499e, (OverlayViewProvider) obj);
            case 2:
                return MobileVoiceOverlay.trashWrapProvider$lambda$10(this.f4499e, (OverlayViewProvider) obj);
            case 3:
                return MobileVoiceOverlay.menuDialogProvider$lambda$14(this.f4499e, (OverlayViewProvider) obj);
            case 4:
                return MobileVoiceOverlay.selectorDialogProvider$lambda$19(this.f4499e, (OverlayViewProvider) obj);
            case 5:
                return MobileVoiceOverlay.menuDialogProvider$lambda$14$lambda$13$lambda$11(this.f4499e, (OverlayDialog) obj);
            default:
                return MobileVoiceOverlay.selectorDialogProvider$lambda$19$lambda$18$lambda$16(this.f4499e, (String) obj);
        }
    }
}
