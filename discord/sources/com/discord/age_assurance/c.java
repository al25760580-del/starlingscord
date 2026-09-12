package com.discord.age_assurance;

import android.graphics.Bitmap;
import com.discord.appreview.AppRatingRequestModule;
import com.discord.browser_manager.BrowserManagerModule;
import com.discord.image.dominant_color.ImageManagerModule;
import com.discord.intents.LinkingModule;
import com.discord.jank_stats.JankSessionModule;
import com.discord.on_demand_resource.OnDemandResourceModule;
import com.facebook.react.bridge.Promise;
import com.google.android.play.agesignals.AgeSignalsResult;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Promise f3938e;

    public /* synthetic */ c(Promise promise, int i7) {
        this.f3937d = i7;
        this.f3938e = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3937d) {
            case 0:
                return PlayAgeSignalsModule.retrieveAgeSignals$lambda$3(this.f3938e, (AgeSignalsResult) obj);
            case 1:
                return PlayIntegrityModule.requestWithProvider$lambda$4(this.f3938e, (Exception) obj);
            case 2:
                return PlayIntegrityModule.requestWithProvider$lambda$3$lambda$0(this.f3938e, (StandardIntegrityManager.StandardIntegrityToken) obj);
            case 3:
                return AppRatingRequestModule.requestRating$lambda$1(this.f3938e, (Exception) obj);
            case 4:
                return BrowserManagerModule.openTrackedCustomTab$lambda$4$lambda$2(this.f3938e, ((Boolean) obj).booleanValue());
            case 5:
                return BrowserManagerModule.openInChromeURL$lambda$0(this.f3938e, (Exception) obj);
            case 6:
                return BrowserManagerModule.openInAppURL$lambda$1(this.f3938e, (Exception) obj);
            case 7:
                return JankSessionModule.getPendingReports$lambda$1(this.f3938e, (List) obj);
            case 8:
                return OnDemandResourceModule.fetchOnDemandResource$lambda$1$lambda$0(this.f3938e, ((Boolean) obj).booleanValue());
            case 9:
                return ImageManagerModule.getDominantColors$lambda$2(this.f3938e, (Bitmap) obj);
            case 10:
                return ImageManagerModule.getAvatarBase64$lambda$0(this.f3938e, (Bitmap) obj);
            case 11:
                return LinkingModule.tryOpenUrlAsUniversalLink$lambda$1(this.f3938e, (Unit) obj);
            default:
                return LinkingModule.tryOpenScheme$lambda$5(this.f3938e, (Unit) obj);
        }
    }
}
