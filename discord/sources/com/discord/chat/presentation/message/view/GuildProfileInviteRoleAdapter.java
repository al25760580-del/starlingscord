package com.discord.chat.presentation.message.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.codedlinks.InviteRole;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.recycler_view.utils.ItemDiffer;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleAdapter$RoleViewHolder;", "<init>", "()V", "roles", "", "Lcom/discord/chat/bridge/codedlinks/InviteRole;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", ViewProps.POSITION, "getItemCount", "setRoles", "newRoles", "RoleViewHolder", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuildProfileInviteRoleAdapter extends RecyclerView.Adapter {

    @NotNull
    private List<InviteRole> roles = n0.f14659d;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleAdapter$RoleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "roleView", "Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleView;", "<init>", "(Lcom/discord/chat/presentation/message/view/GuildProfileInviteRoleView;)V", "bind", "", ViewProps.ROLE, "Lcom/discord/chat/bridge/codedlinks/InviteRole;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RoleViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        private final GuildProfileInviteRoleView roleView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoleViewHolder(@NotNull GuildProfileInviteRoleView roleView) {
            super(roleView);
            Intrinsics.checkNotNullParameter(roleView, "roleView");
            this.roleView = roleView;
        }

        public final void bind(@NotNull InviteRole role) {
            Intrinsics.checkNotNullParameter(role, "role");
            this.roleView.setRole(role);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.roles.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setRoles(@NotNull List<InviteRole> newRoles) {
        Intrinsics.checkNotNullParameter(newRoles, "newRoles");
        List<InviteRole> list = this.roles;
        this.roles = newRoles;
        androidx.recyclerview.widget.u uVarA = androidx.recyclerview.widget.c.a(new ItemDiffer(list, newRoles), false);
        Intrinsics.checkNotNullExpressionValue(uVarA, "calculateDiff(...)");
        uVarA.a(new androidx.recyclerview.widget.b(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RoleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.roles.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RoleViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GuildProfileInviteRoleView guildProfileInviteRoleView = new GuildProfileInviteRoleView(context, null, 0, 6, null);
        ne.e eVar = new ne.e(-2);
        eVar.setMargins(0, 0, SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(8));
        guildProfileInviteRoleView.setLayoutParams(eVar);
        return new RoleViewHolder(guildProfileInviteRoleView);
    }
}
