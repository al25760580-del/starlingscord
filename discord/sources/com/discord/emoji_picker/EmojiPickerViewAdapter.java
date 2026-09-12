package com.discord.emoji_picker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.emoji_picker.databinding.PremiumInlineRoadblockFooterBinding;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u001c\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010#J\u0015\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\u000f¢\u0006\u0004\b)\u0010&J\u0015\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010 J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0005¢\u0006\u0004\b-\u0010 J\u0015\u0010.\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b.\u0010&J\u0015\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u0004\u0018\u00010\u00052\u0006\u0010/\u001a\u00020\u0005¢\u0006\u0004\b2\u00103J\u001d\u00106\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005¢\u0006\u0004\b:\u00107J\u001d\u0010;\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u0005¢\u0006\u0004\b;\u00107J\u001f\u0010?\u001a\u00020\u00022\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u0005H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0005H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0005H\u0016¢\u0006\u0004\bH\u0010IR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010JR\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010JR*\u0010\n\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010KR(\u0010\r\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010KR(\u0010\u000e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010KR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010LR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010LR\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010L¨\u0006Q"}, d2 = {"Lcom/discord/emoji_picker/EmojiPickerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/emoji_picker/EmojiPickerViewHolder;", "Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;", "coreData", "", "emojiSize", "emojiMargin", "Lkotlin/Function2;", "", "onItemsChanged", "", "", "onPressEmoji", "onLongPressEmoji", "", "useTier0UpsellContent", "Lcom/discord/emoji_picker/EmojiPickerView$Config;", "config", "<init>", "(Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLcom/discord/emoji_picker/EmojiPickerView$Config;)V", "setConfig", "(Lcom/discord/emoji_picker/EmojiPickerView$Config;)V", "setCoreData", "(Lcom/discord/emoji_picker/EmojiPickerItemData$CoreData;)V", "", "Lcom/discord/emoji_picker/EmojiPickerItem;", "emojis", "emojisUnicode", "setEmojis", "(Ljava/util/List;Ljava/util/List;)V", "setEmojiSize", "(I)V", "setEmojiMargin", "getScrolling", "()Z", "scrolling", "setScrolling", "(Z)V", "getScrollingFast", "scrollingFast", "setScrollingFast", "spacerTopHeight", "setSpacerTopHeight", "spacerBottomHeight", "setSpacerBottomHeight", "setUseTier0UpsellContent", ViewProps.POSITION, "getItem", "(I)Lcom/discord/emoji_picker/EmojiPickerItem;", "getItemIndex", "(I)Ljava/lang/Integer;", "positionFrom", "positionTo", "getEstimatedDistance", "(II)I", "index", "itemType", "getItemPositionAtIndex", "findFirstItemPositionAboveOrBelowPosition", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/discord/emoji_picker/EmojiPickerViewHolder;", "getItemCount", "()I", "getItemId", "(I)J", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Lcom/discord/emoji_picker/EmojiPickerViewHolder;I)V", "I", "Lkotlin/jvm/functions/Function2;", "Z", "Lcom/discord/emoji_picker/EmojiPickerView$Config;", "Lcom/discord/emoji_picker/EmojiPickerItemData;", "itemData", "Lcom/discord/emoji_picker/EmojiPickerItemData;", "emoji_picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmojiPickerViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiPickerViewAdapter.kt\ncom/discord/emoji_picker/EmojiPickerViewAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n1803#2,3:263\n1869#2,2:266\n*S KotlinDebug\n*F\n+ 1 EmojiPickerViewAdapter.kt\ncom/discord/emoji_picker/EmojiPickerViewAdapter\n*L\n111#1:263,3\n152#1:266,2\n*E\n"})
public final class EmojiPickerViewAdapter extends RecyclerView.Adapter {

    @NotNull
    private EmojiPickerView.Config config;
    private int emojiMargin;
    private int emojiSize;

    @NotNull
    private final EmojiPickerItemData itemData;

    @NotNull
    private final Function2<Integer, Integer, Unit> onItemsChanged;

    @NotNull
    private final Function2<Long, String, Unit> onLongPressEmoji;

    @NotNull
    private final Function2<Long, String, Unit> onPressEmoji;
    private boolean scrolling;
    private boolean scrollingFast;
    private boolean useTier0UpsellContent;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmojiPickerItem.ItemType.values().length];
            try {
                iArr[EmojiPickerItem.ItemType.EMOJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmojiPickerItem.ItemType.PLACEHOLDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmojiPickerItem.ItemType.CATEGORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmojiPickerItem.ItemType.SPACER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EmojiPickerItem.ItemType.FOOTER_UPSELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EmojiPickerItem.ItemType.PREMIUM_INLINE_ROADBLOCK_HEADER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EmojiPickerItem.ItemType.PREMIUM_INLINE_ROADBLOCK_FOOTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiPickerViewAdapter(@NotNull EmojiPickerItemData.CoreData coreData, int i7, int i10, @NotNull Function2<? super Integer, ? super Integer, Unit> onItemsChanged, @NotNull Function2<? super Long, ? super String, Unit> onPressEmoji, @NotNull Function2<? super Long, ? super String, Unit> onLongPressEmoji, boolean z5, @NotNull EmojiPickerView.Config config) {
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        Intrinsics.checkNotNullParameter(onItemsChanged, "onItemsChanged");
        Intrinsics.checkNotNullParameter(onPressEmoji, "onPressEmoji");
        Intrinsics.checkNotNullParameter(onLongPressEmoji, "onLongPressEmoji");
        Intrinsics.checkNotNullParameter(config, "config");
        this.emojiSize = i7;
        this.emojiMargin = i10;
        this.onItemsChanged = onItemsChanged;
        this.onPressEmoji = onPressEmoji;
        this.onLongPressEmoji = onLongPressEmoji;
        this.useTier0UpsellContent = z5;
        this.config = config;
        this.itemData = new EmojiPickerItemData(coreData);
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCoreData$lambda$0(EmojiPickerViewAdapter emojiPickerViewAdapter) {
        emojiPickerViewAdapter.onItemsChanged.invoke(null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmojis$lambda$1(EmojiPickerViewAdapter emojiPickerViewAdapter) {
        emojiPickerViewAdapter.onItemsChanged.invoke(null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSpacerBottomHeight$lambda$3(EmojiPickerViewAdapter emojiPickerViewAdapter, int i7) {
        emojiPickerViewAdapter.onItemsChanged.invoke(Integer.valueOf(i7), null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setSpacerTopHeight$lambda$2(EmojiPickerViewAdapter emojiPickerViewAdapter, int i7) {
        emojiPickerViewAdapter.onItemsChanged.invoke(Integer.valueOf(i7), null);
        return Unit.f14616a;
    }

    public final int findFirstItemPositionAboveOrBelowPosition(int position, int itemType) {
        int itemCount = getItemCount();
        for (int i7 = position; i7 >= 0; i7--) {
            if (getItemViewType(i7) == itemType) {
                return i7;
            }
        }
        while (position < itemCount) {
            if (getItemViewType(position) == itemType) {
                return position;
            }
            position++;
        }
        return -1;
    }

    public final int getEstimatedDistance(int positionFrom, int positionTo) {
        Iterable aVar;
        boolean z5 = positionFrom <= positionTo;
        if (z5) {
            aVar = new IntRange(positionFrom, positionTo, 1);
        } else {
            kotlin.ranges.a.f14687v.getClass();
            aVar = new kotlin.ranges.a(positionFrom, positionTo, -1);
        }
        Iterator it = aVar.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            EmojiPickerItem item = getItem(((s0) it).nextInt());
            if ((item instanceof EmojiPickerItem.Emoji) || (item instanceof EmojiPickerItem.EmojiPlaceholder)) {
                if (i10 == 0) {
                    i10++;
                    i7 = i7 + this.emojiSize + this.emojiMargin;
                } else {
                    i10 = i10 < this.itemData.getRowSize() - 1 ? i10 + 1 : 0;
                }
            } else if (item instanceof EmojiPickerItem.Category) {
            }
        }
        return z5 ? i7 : -i7;
    }

    @NotNull
    public final EmojiPickerItem getItem(int position) {
        return this.itemData.getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemData.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return getItem(position).itemId();
    }

    public final Integer getItemIndex(int position) {
        return this.itemData.getItemIndex(position);
    }

    public final int getItemPositionAtIndex(int index, int itemType) {
        int i7 = 0;
        Iterator it = new IntRange(0, this.itemData.getItemCount(), 1).iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            if (getItem(iNextInt).itemType() == itemType) {
                if (i7 == index) {
                    return iNextInt;
                }
                i7++;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return getItem(position).itemType();
    }

    public final boolean getScrolling() {
        return this.scrolling;
    }

    public final boolean getScrollingFast() {
        return this.scrollingFast;
    }

    public final void setConfig(@NotNull EmojiPickerView.Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.areEqual(this.config, config)) {
            return;
        }
        this.config = config;
        this.onItemsChanged.invoke(null, null);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setCoreData(@NotNull EmojiPickerItemData.CoreData coreData) {
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        this.itemData.setCoreData(coreData, new f(this, 1));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setEmojiMargin(int emojiMargin) {
        if (this.emojiMargin != emojiMargin) {
            this.emojiMargin = emojiMargin;
            this.onItemsChanged.invoke(null, null);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setEmojiSize(int emojiSize) {
        if (this.emojiSize != emojiSize) {
            this.emojiSize = emojiSize;
            this.onItemsChanged.invoke(null, null);
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setEmojis(@NotNull List<? extends EmojiPickerItem> emojis, @NotNull List<? extends EmojiPickerItem> emojisUnicode) {
        Intrinsics.checkNotNullParameter(emojis, "emojis");
        Intrinsics.checkNotNullParameter(emojisUnicode, "emojisUnicode");
        this.itemData.setEmojis(emojis, emojisUnicode, new f(this, 0));
    }

    public final void setScrolling(boolean scrolling) {
        this.scrolling = scrolling && this.config.getDisableAnimationsOnScroll();
    }

    public final void setScrollingFast(boolean scrollingFast) {
        this.scrollingFast = scrollingFast && this.config.getScrollFastOptimizationEnabled();
    }

    public final void setSpacerBottomHeight(int spacerBottomHeight) {
        this.itemData.setSpacerBottomHeight(spacerBottomHeight, new g(this, 1));
    }

    public final void setSpacerTopHeight(int spacerTopHeight) {
        this.itemData.setSpacerTopHeight(spacerTopHeight, new g(this, 0));
    }

    public final void setUseTier0UpsellContent(boolean useTier0UpsellContent) {
        if (this.useTier0UpsellContent != useTier0UpsellContent) {
            this.useTier0UpsellContent = useTier0UpsellContent;
            this.onItemsChanged.invoke(null, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull EmojiPickerViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof EmojiPickerViewHolder.Category) {
            EmojiPickerItem item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Category");
            ((EmojiPickerViewHolder.Category) holder).onBindViewHolder((EmojiPickerItem.Category) item);
            return;
        }
        if (holder instanceof EmojiPickerViewHolder.EmojiPlaceholder) {
            ((EmojiPickerViewHolder.EmojiPlaceholder) holder).onBindViewHolder(this.emojiSize, this.emojiMargin);
            return;
        }
        if (holder instanceof EmojiPickerViewHolder.Emoji) {
            EmojiPickerViewHolder.Emoji emoji = (EmojiPickerViewHolder.Emoji) holder;
            EmojiPickerItem item2 = getItem(position);
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Emoji");
            emoji.onBindViewHolder((EmojiPickerItem.Emoji) item2, this.config.getAnimateEmoji(), this.emojiSize, this.emojiMargin, this.scrolling, this.scrollingFast);
            return;
        }
        if (holder instanceof EmojiPickerViewHolder.Spacer) {
            EmojiPickerItem item3 = getItem(position);
            Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.Spacer");
            ((EmojiPickerViewHolder.Spacer) holder).onBindViewHolder((EmojiPickerItem.Spacer) item3);
        } else if (holder instanceof EmojiPickerViewHolder.FooterUpsell) {
            EmojiPickerItem item4 = getItem(position);
            Intrinsics.checkNotNull(item4, "null cannot be cast to non-null type com.discord.emoji_picker.EmojiPickerItem.FooterUpsell");
            ((EmojiPickerViewHolder.FooterUpsell) holder).onBindViewHolder((EmojiPickerItem.FooterUpsell) item4);
        } else if (holder instanceof EmojiPickerViewHolder.PremiumInlineRoadblockFooter) {
            ((EmojiPickerViewHolder.PremiumInlineRoadblockFooter) holder).onBindViewHolder(this.useTier0UpsellContent);
        } else {
            if (!(holder instanceof EmojiPickerViewHolder.PremiumInlineRoadblockHeader)) {
                throw new n();
            }
            ((EmojiPickerViewHolder.PremiumInlineRoadblockHeader) holder).onBindViewHolder(this.useTier0UpsellContent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public EmojiPickerViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i7 = 2;
        PremiumInlineRoadblockFooterBinding premiumInlineRoadblockFooterBinding = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (WhenMappings.$EnumSwitchMapping$0[EmojiPickerItem.ItemType.INSTANCE.create(viewType).ordinal()]) {
            case 1:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new EmojiPickerViewHolder.Emoji(context, this.onPressEmoji, this.onLongPressEmoji);
            case 2:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new EmojiPickerViewHolder.EmojiPlaceholder(context2);
            case 3:
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new EmojiPickerViewHolder.Category(context3);
            case 4:
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                return new EmojiPickerViewHolder.Spacer(context4);
            case 5:
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                return new EmojiPickerViewHolder.FooterUpsell(context5);
            case 6:
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return new EmojiPickerViewHolder.PremiumInlineRoadblockHeader(context6, objArr2 == true ? 1 : 0, i7, objArr == true ? 1 : 0);
            case 7:
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                return new EmojiPickerViewHolder.PremiumInlineRoadblockFooter(context7, premiumInlineRoadblockFooterBinding, i7, objArr3 == true ? 1 : 0);
            default:
                throw new n();
        }
    }
}
