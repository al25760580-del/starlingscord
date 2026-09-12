package ShiggyXposed.xposed.modules.appearance;

import ShiggyXposed.xposed.Module;
import android.R;
import android.app.AndroidAppHelper;
import android.content.Context;
import android.os.Build;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.card.MaterialCardViewHelper;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;

/* JADX INFO: compiled from: SysColorsModule.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"LShiggyXposed/xposed/modules/appearance/SysColorsModule;", "LShiggyXposed/xposed/Module;", "<init>", "()V", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "isSupported", "", "buildPayload", "", "builder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "convertToColor", "", "id", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SysColorsModule extends Module {
    public static final SysColorsModule INSTANCE = new SysColorsModule();
    private static WeakReference<Context> context;

    private SysColorsModule() {
    }

    private final boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @Override // ShiggyXposed.xposed.Module
    public void buildPayload(JsonObjectBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        context = new WeakReference<>(AndroidAppHelper.currentApplication());
        final String[] strArr = {"accent1", "accent2", "accent3", "neutral1", "neutral2"};
        final Integer[] numArr = {0, 10, 50, 100, Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION), Integer.valueOf(MaterialCardViewHelper.DEFAULT_FADE_ANIM_DURATION), 400, 500, 600, 700, 800, 900, 1000};
        SysColorsModule sysColorsModule = INSTANCE;
        JsonElementBuildersKt.put(builder, "isSysColorsSupported", Boolean.valueOf(sysColorsModule.isSupported()));
        if (sysColorsModule.isSupported()) {
            JsonElementBuildersKt.putJsonObject(builder, "sysColors", new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.SysColorsModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SysColorsModule.buildPayload$lambda$4$lambda$3(strArr, numArr, (JsonObjectBuilder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildPayload$lambda$4$lambda$3(String[] strArr, final Integer[] numArr, JsonObjectBuilder putJsonObject) {
        Intrinsics.checkNotNullParameter(putJsonObject, "$this$putJsonObject");
        for (final String str : strArr) {
            JsonElementBuildersKt.putJsonArray(putJsonObject, str, new Function1() { // from class: ShiggyXposed.xposed.modules.appearance.SysColorsModule$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SysColorsModule.buildPayload$lambda$4$lambda$3$lambda$2(numArr, str, (JsonArrayBuilder) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildPayload$lambda$4$lambda$3$lambda$2(Integer[] numArr, String str, JsonArrayBuilder putJsonArray) {
        Object objM453constructorimpl;
        Intrinsics.checkNotNullParameter(putJsonArray, "$this$putJsonArray");
        for (Integer num : numArr) {
            String str2 = "system_" + str + '_' + num.intValue();
            try {
                Result.Companion companion = Result.INSTANCE;
                objM453constructorimpl = Result.m453constructorimpl(Integer.valueOf(R.color.class.getField(str2).getInt(null)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM453constructorimpl = Result.m453constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m456exceptionOrNullimpl(objM453constructorimpl) != null) {
                objM453constructorimpl = 0;
            }
            JsonElementBuildersKt.add(putJsonArray, INSTANCE.convertToColor(((Number) objM453constructorimpl).intValue()));
        }
        return Unit.INSTANCE;
    }

    private final String convertToColor(int id) {
        int color;
        if (isSupported()) {
            WeakReference<Context> weakReference = context;
            if (weakReference == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                weakReference = null;
            }
            Context context2 = weakReference.get();
            Intrinsics.checkNotNull(context2);
            color = ContextCompat.getColor(context2, id);
        } else {
            color = 0;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(color & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
