package ShiggyXposed.xposed.modules.LogBox;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* JADX INFO: compiled from: LogBoxConstants.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"LShiggyXposed/xposed/modules/LogBox/LogBoxConstants;", "", "<init>", "()V", "TAG", "", "FLAVOR_COLORS", "", "Lkotlin/Pair;", "getFLAVOR_COLORS", "()Ljava/util/Map;", "APPEARANCE_MODES", "", "getAPPEARANCE_MODES", "()Ljava/util/List;", "FLAVORS", "getFLAVORS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LogBoxConstants {
    public static final String TAG = "LogBoxModule";
    public static final LogBoxConstants INSTANCE = new LogBoxConstants();
    private static final Map<String, Pair<String, String>> FLAVOR_COLORS = MapsKt.mapOf(TuplesKt.to("blue", new Pair("#0D47A1", "#82B1FF")), TuplesKt.to("green", new Pair("#1B5E20", "#A5D6A7")), TuplesKt.to("mocha", new Pair("#3E2723", "#BCAAA4")), TuplesKt.to("vanilla", new Pair("#F9A825", "#FFF59D")), TuplesKt.to("purple", new Pair("#6A1B9A", "#E1BEE7")), TuplesKt.to("amber", new Pair("#FF6F00", "#FFE0B2")), TuplesKt.to("teal", new Pair("#004D40", "#80CBC4")));
    private static final List<String> APPEARANCE_MODES = CollectionsKt.listOf((Object[]) new String[]{"system", "light", "dark"});
    private static final List<String> FLAVORS = CollectionsKt.listOf((Object[]) new String[]{"blue", "green", "mocha", "vanilla", "purple", "amber", "teal"});

    private LogBoxConstants() {
    }

    public final Map<String, Pair<String, String>> getFLAVOR_COLORS() {
        return FLAVOR_COLORS;
    }

    public final List<String> getAPPEARANCE_MODES() {
        return APPEARANCE_MODES;
    }

    public final List<String> getFLAVORS() {
        return FLAVORS;
    }
}
