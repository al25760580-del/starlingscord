package com.discord.fastest_list.android.placeholder;

import android.view.ViewGroup;
import androidx.collection.LruCache;
import com.discord.fastest_list.android.FastestListSections;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder;", "", "<init>", "()V", "onPlaceholderShouldBind", "", "view", "Landroid/view/ViewGroup;", "item", "Lcom/discord/fastest_list/android/FastestListSections$Entry;", "onPlaceholderShouldUnbind", "Companion", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeFeedItem;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeNone;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderTypeShape;", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FastestListPlaceholder {
    private static final int PLACEHOLDER_POOL_SIZE = 10;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final LruCache placeholderPool = new LruCache(10);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\bJ\f\u0010\f\u001a\u00020\t*\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder$Companion;", "", "<init>", "()V", "PLACEHOLDER_POOL_SIZE", "", "placeholderPool", "Landroidx/collection/LruCache;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholderType;", "Lcom/discord/fastest_list/android/placeholder/FastestListPlaceholder;", "get", "placeholderType", "create", "fastest_list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final FastestListPlaceholder create(FastestListPlaceholderType fastestListPlaceholderType) {
            if (fastestListPlaceholderType instanceof FastestListPlaceholderType.FeedItem) {
                return new FastestListPlaceholderTypeFeedItem((FastestListPlaceholderType.FeedItem) fastestListPlaceholderType);
            }
            if (fastestListPlaceholderType instanceof FastestListPlaceholderType.Shape) {
                return new FastestListPlaceholderTypeShape((FastestListPlaceholderType.Shape) fastestListPlaceholderType);
            }
            if (fastestListPlaceholderType instanceof FastestListPlaceholderType.None) {
                return FastestListPlaceholderTypeNone.INSTANCE;
            }
            throw new n();
        }

        @NotNull
        public final FastestListPlaceholder get(@NotNull FastestListPlaceholderType placeholderType) {
            Intrinsics.checkNotNullParameter(placeholderType, "placeholderType");
            FastestListPlaceholder fastestListPlaceholder = (FastestListPlaceholder) FastestListPlaceholder.placeholderPool.a(placeholderType);
            if (fastestListPlaceholder != null) {
                return fastestListPlaceholder;
            }
            FastestListPlaceholder fastestListPlaceholderCreate = create(placeholderType);
            FastestListPlaceholder.placeholderPool.b(placeholderType, fastestListPlaceholderCreate);
            return fastestListPlaceholderCreate;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FastestListPlaceholder(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void onPlaceholderShouldBind(@NotNull ViewGroup view, @NotNull FastestListSections.Entry item);

    public abstract void onPlaceholderShouldUnbind(@NotNull ViewGroup view);

    private FastestListPlaceholder() {
    }
}
