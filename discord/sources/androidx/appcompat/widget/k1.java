package androidx.appcompat.widget;

import android.adservices.measurement.MeasurementManager;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.fonts.FontFamily;
import android.media.MediaCodecInfo;
import android.util.Base64;
import androidx.arch.core.util.Function;
import androidx.metrics.performance.FrameData;
import androidx.metrics.performance.JankStats;
import co.discord.media_engine.DiscordVideoEncoderFactory;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.crash_reporting.CrashReporting;
import com.discord.jank_stats.JankStatsAggregator;
import com.discord.networking.ReactNetworking;
import com.discord.react_fork_overrides.forks.CustomFontFamilyOverride;
import com.discord.react_fork_overrides.forks.ImageSourceOverride;
import com.facebook.react.common.assets.CreateTypefaceObject;
import com.facebook.react.modules.network.CustomClientBuilder;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.h5;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import org.webrtc.Predicate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements cc.f, Predicate, androidx.core.util.Predicate, h5, JankStats.OnFrameListener, CustomClientBuilder, Function {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1011d;

    public /* synthetic */ k1(int i7) {
        this.f1011d = i7;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ FontFamily f(Object obj) {
        return (FontFamily) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return MeasurementManager.class;
    }

    @Override // androidx.metrics.performance.JankStats.OnFrameListener
    public void a(FrameData frameData) {
        JankStatsAggregator.listener$lambda$0(frameData);
    }

    @Override // com.facebook.react.modules.network.CustomClientBuilder
    public void apply(OkHttpClient.Builder builder) {
        switch (this.f1011d) {
            case 21:
                ReactNetworking.patchReactNetworking$lambda$0(builder);
                break;
            default:
                ReactNetworking.patchReactNetworking$lambda$1(builder);
                break;
        }
    }

    @Override // io.sentry.h5
    public Breadcrumb execute(Breadcrumb breadcrumb, Hint hint) {
        return CrashReporting.init$lambda$3$lambda$2(breadcrumb, hint);
    }

    @Override // org.webrtc.Predicate, androidx.core.util.Predicate
    public boolean test(Object obj) {
        switch (this.f1011d) {
            case 12:
                return DiscordVideoEncoderFactory.lambda$new$0((MediaCodecInfo) obj);
            default:
                return ChatInputRootView.lambda$8$lambda$6((ClipData.Item) obj);
        }
    }

    @Override // cc.f
    public Object apply(Object obj) {
        switch (this.f1011d) {
            case 11:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        n8.f fVarA = vb.i.a();
                        fVarA.h0(cursorRawQuery.getString(1));
                        fVarA.f16511i = fc.a.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        fVarA.f16512v = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(fVarA.J());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 24:
                return CustomFontFamilyOverride.override$lambda$0((CreateTypefaceObject) obj);
            default:
                return ImageSourceOverride.override$lambda$0((String) obj);
        }
    }
}
