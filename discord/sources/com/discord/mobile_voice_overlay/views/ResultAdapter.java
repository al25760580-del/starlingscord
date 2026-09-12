package com.discord.mobile_voice_overlay.views;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult;
import com.discord.primitives.ChannelId;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/ResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;", "onChannelSelected", "Lkotlin/Function1;", "Lcom/discord/primitives/ChannelId;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "results", "", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", ViewProps.POSITION, "getItemCount", "setResults", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ResultAdapter extends RecyclerView.Adapter {

    @NotNull
    private final Function1<ChannelId, Unit> onChannelSelected;

    @NotNull
    private List<MobileVoiceOverlaySelectorResult> results;

    /* JADX WARN: Multi-variable type inference failed */
    public ResultAdapter(@NotNull Function1<? super ChannelId, Unit> onChannelSelected) {
        Intrinsics.checkNotNullParameter(onChannelSelected, "onChannelSelected");
        this.onChannelSelected = onChannelSelected;
        this.results = n0.f14659d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.results.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setResults(@NotNull List<MobileVoiceOverlaySelectorResult> results) {
        Intrinsics.checkNotNullParameter(results, "results");
        this.results = results;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ResultViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.results.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ResultViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ResultViewHolder(parent, this.onChannelSelected, null, 4, null);
    }
}
