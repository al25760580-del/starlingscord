package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.codedlinks.VoiceUser;
import com.discord.chat.databinding.VoiceChannelListInviteUserItemBinding;
import com.discord.chat.presentation.message.utils.DisplayNameStylesUtils;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/VoiceUserAdapter;", "Landroidx/recyclerview/widget/o0;", "Lcom/discord/chat/presentation/message/view/VoiceUserItem;", "Lcom/discord/chat/presentation/message/view/VoiceUserAdapter$ViewHolder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/view/VoiceUserAdapter$ViewHolder;", "holder", ViewProps.POSITION, "", "onBindViewHolder", "(Lcom/discord/chat/presentation/message/view/VoiceUserAdapter$ViewHolder;I)V", "Companion", "ViewHolder", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VoiceUserAdapter extends o0 {

    @NotNull
    private static final VoiceUserAdapter$Companion$DIFF_CALLBACK$1 DIFF_CALLBACK = new androidx.recyclerview.widget.v() { // from class: com.discord.chat.presentation.message.view.VoiceUserAdapter$Companion$DIFF_CALLBACK$1
        @Override // androidx.recyclerview.widget.v
        public boolean areContentsTheSame(VoiceUserItem oldItem, VoiceUserItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.v
        public boolean areItemsTheSame(VoiceUserItem oldItem, VoiceUserItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getUser().getUserId(), newItem.getUser().getUserId());
        }
    };

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/view/VoiceUserAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/discord/chat/databinding/VoiceChannelListInviteUserItemBinding;", "<init>", "(Lcom/discord/chat/databinding/VoiceChannelListInviteUserItemBinding;)V", "bind", "", "item", "Lcom/discord/chat/presentation/message/view/VoiceUserItem;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nVoiceUserAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoiceUserAdapter.kt\ncom/discord/chat/presentation/message/view/VoiceUserAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,89:1\n1#2:90\n257#3,2:91\n*S KotlinDebug\n*F\n+ 1 VoiceUserAdapter.kt\ncom/discord/chat/presentation/message/view/VoiceUserAdapter$ViewHolder\n*L\n74#1:91,2\n*E\n"})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        private final VoiceChannelListInviteUserItemBinding binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull VoiceChannelListInviteUserItemBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
            GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) binding.userAvatar.getHierarchy();
            i9.b bVar = new i9.b();
            bVar.f11403b = true;
            genericDraweeHierarchy.p(bVar);
            TextView textView = binding.userName;
            textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
            Intrinsics.checkNotNull(textView);
            SetTextSizeSpKt.setTextSizeSp(textView, 16.0f);
            TextView textView2 = binding.liveBadge;
            textView2.setTextColor(ThemeManagerKt.getTheme().getWhite());
            Intrinsics.checkNotNull(textView2);
            SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
            DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryBold);
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(textView2, ThemeManagerKt.getTheme().getStatusDanger(), Integer.MAX_VALUE, null, 0, 12, null);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0066  */
        public final void bind(@NotNull VoiceUserItem item) {
            DiscordFont displayNameFont;
            Intrinsics.checkNotNullParameter(item, "item");
            VoiceUser user = item.getUser();
            SimpleDraweeView simpleDraweeView = this.binding.userAvatar;
            String avatarUrl = user.getAvatarUrl();
            if (avatarUrl == null || avatarUrl.length() == 0) {
                simpleDraweeView.setImageURI((String) null);
                Intrinsics.checkNotNull(simpleDraweeView);
                ViewBackgroundUtilsKt.setBackgroundOval$default(simpleDraweeView, ThemeManagerKt.getTheme().getBackgroundBaseLow(), 0, 2, null);
            } else {
                Context context = simpleDraweeView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                simpleDraweeView.setImageURI(ReactAssetUtilsKt.inflateUrl(context, user.getAvatarUrl()));
                simpleDraweeView.setBackground(null);
            }
            TextView textView = this.binding.userName;
            textView.setText(user.getDisplayName());
            Intrinsics.checkNotNull(textView);
            Integer fontId = user.getFontId();
            if (fontId != null) {
                displayNameFont = DisplayNameStylesUtils.INSTANCE.getDisplayNameFont(fontId.intValue());
                if (displayNameFont == null) {
                    displayNameFont = DiscordFont.PrimaryMedium;
                }
            } else {
                displayNameFont = DiscordFont.PrimaryMedium;
            }
            DiscordFontUtilsKt.setDiscordFont(textView, displayNameFont);
            TextView liveBadge = this.binding.liveBadge;
            Intrinsics.checkNotNullExpressionValue(liveBadge, "liveBadge");
            liveBadge.setVisibility(user.isStreaming() ? 0 : 8);
            if (user.isStreaming()) {
                this.binding.liveBadge.setText(item.getStreamingLabel());
            }
        }
    }

    public VoiceUserAdapter() {
        super(DIFF_CALLBACK);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind((VoiceUserItem) item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        VoiceChannelListInviteUserItemBinding voiceChannelListInviteUserItemBindingInflate = VoiceChannelListInviteUserItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(voiceChannelListInviteUserItemBindingInflate, "inflate(...)");
        return new ViewHolder(voiceChannelListInviteUserItemBindingInflate);
    }
}
