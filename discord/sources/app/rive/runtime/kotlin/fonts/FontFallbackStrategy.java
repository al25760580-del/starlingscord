package app.rive.runtime.kotlin.fonts;

import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;", "", "getFont", "", "", "Lapp/rive/runtime/kotlin/fonts/FontBytes;", "weight", "Lapp/rive/runtime/kotlin/fonts/Fonts$Weight;", "Companion", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FontFallbackStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\f\u001a\u00020\rH\u0086 J\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy$Companion;", "", "()V", "value", "Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;", "stylePicker", "getStylePicker", "()Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;", "setStylePicker", "(Lapp/rive/runtime/kotlin/fonts/FontFallbackStrategy;)V", "stylePickerRef", "Ljava/lang/ref/WeakReference;", "cppResetFontCache", "", "pickFont", "", "", "Lapp/rive/runtime/kotlin/fonts/FontBytes;", "uWeight", "", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFontFallbackStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFallbackStrategy.kt\napp/rive/runtime/kotlin/fonts/FontFallbackStrategy$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static WeakReference<FontFallbackStrategy> stylePickerRef;

        private Companion() {
        }

        public final native void cppResetFontCache();

        public final FontFallbackStrategy getStylePicker() {
            WeakReference<FontFallbackStrategy> weakReference = stylePickerRef;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @NotNull
        public final List<byte[]> pickFont(int uWeight) {
            FontFallbackStrategy stylePicker = getStylePicker();
            return stylePicker == null ? n0.f14659d : stylePicker.getFont(Fonts.Weight.INSTANCE.fromInt(uWeight));
        }

        public final void setStylePicker(FontFallbackStrategy fontFallbackStrategy) {
            if (getStylePicker() != fontFallbackStrategy) {
                stylePickerRef = fontFallbackStrategy != null ? new WeakReference<>(fontFallbackStrategy) : null;
                cppResetFontCache();
            }
        }
    }

    @NotNull
    List<byte[]> getFont(@NotNull Fonts.Weight weight);
}
