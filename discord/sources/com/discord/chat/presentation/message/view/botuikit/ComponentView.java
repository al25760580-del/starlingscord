package com.discord.chat.presentation.message.view.botuikit;

import com.discord.chat.bridge.botuikit.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "T", "Lcom/discord/chat/bridge/botuikit/Component;", "", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "(Lcom/discord/chat/bridge/botuikit/Component;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;)V", "onRecycle", "getComponentType", "Lkotlin/reflect/KClass;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ComponentView<T extends Component> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T extends Component> void onRecycle(@NotNull ComponentView<T> componentView, @NotNull ComponentProvider componentProvider) {
            Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        }
    }

    void configure(@NotNull T component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext);

    @NotNull
    KClass getComponentType();

    void onRecycle(@NotNull ComponentProvider componentProvider);
}
