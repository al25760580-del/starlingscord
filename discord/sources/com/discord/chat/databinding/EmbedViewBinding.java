package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.EmbedViewResizingMediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class EmbedViewBinding implements ViewBinding {

    @NonNull
    public final SimpleDraweeView authorAvatar;

    @NonNull
    public final LinearLayout authorContainer;

    @NonNull
    public final TextView authorName;

    @NonNull
    public final View border;

    @NonNull
    public final SimpleDraweeSpanTextView description;

    @NonNull
    public final TextView error;

    @NonNull
    public final SimpleDraweeView errorIcon;

    @NonNull
    public final LinearLayout fieldsBottomWrap;

    @NonNull
    public final LinearLayout fieldsContainer;

    @NonNull
    public final LinearLayout fieldsTopWrap;

    @NonNull
    public final SimpleDraweeView footerAvatar;

    @NonNull
    public final LinearLayout footerContainer;

    @NonNull
    public final TextView footerText;

    @NonNull
    public final FrameLayout imageBlurBg;

    @NonNull
    public final ConstraintLayout inlineMediaContainer;

    @NonNull
    public final EmbedViewResizingMediaView inlineMediaView;

    @NonNull
    public final EmbedViewResizingMediaView inlineMediaView2;

    @NonNull
    public final EmbedViewResizingMediaView inlineMediaView3;

    @NonNull
    public final EmbedViewResizingMediaView inlineMediaView4;

    @NonNull
    public final EmbedViewResizingMediaView mediaView;

    @NonNull
    public final SimpleDraweeSpanTextView provider;

    @NonNull
    private final View rootView;

    @NonNull
    public final Space spacer;

    @NonNull
    public final SpoilerView spoiler;

    @NonNull
    public final SimpleDraweeView thumbnail;

    @NonNull
    public final SimpleDraweeSpanTextView title;

    private EmbedViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull View view2, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout5, @NonNull TextView textView3, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull EmbedViewResizingMediaView embedViewResizingMediaView, @NonNull EmbedViewResizingMediaView embedViewResizingMediaView2, @NonNull EmbedViewResizingMediaView embedViewResizingMediaView3, @NonNull EmbedViewResizingMediaView embedViewResizingMediaView4, @NonNull EmbedViewResizingMediaView embedViewResizingMediaView5, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView2, @NonNull Space space, @NonNull SpoilerView spoilerView, @NonNull SimpleDraweeView simpleDraweeView4, @NonNull SimpleDraweeSpanTextView simpleDraweeSpanTextView3) {
        this.rootView = view;
        this.authorAvatar = simpleDraweeView;
        this.authorContainer = linearLayout;
        this.authorName = textView;
        this.border = view2;
        this.description = simpleDraweeSpanTextView;
        this.error = textView2;
        this.errorIcon = simpleDraweeView2;
        this.fieldsBottomWrap = linearLayout2;
        this.fieldsContainer = linearLayout3;
        this.fieldsTopWrap = linearLayout4;
        this.footerAvatar = simpleDraweeView3;
        this.footerContainer = linearLayout5;
        this.footerText = textView3;
        this.imageBlurBg = frameLayout;
        this.inlineMediaContainer = constraintLayout;
        this.inlineMediaView = embedViewResizingMediaView;
        this.inlineMediaView2 = embedViewResizingMediaView2;
        this.inlineMediaView3 = embedViewResizingMediaView3;
        this.inlineMediaView4 = embedViewResizingMediaView4;
        this.mediaView = embedViewResizingMediaView5;
        this.provider = simpleDraweeSpanTextView2;
        this.spacer = space;
        this.spoiler = spoilerView;
        this.thumbnail = simpleDraweeView4;
        this.title = simpleDraweeSpanTextView3;
    }

    @NonNull
    public static EmbedViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.author_avatar;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.author_container;
            LinearLayout linearLayout = (LinearLayout) a.k(i7, view);
            if (linearLayout != null) {
                i7 = R.id.author_name;
                TextView textView = (TextView) a.k(i7, view);
                if (textView != null && (viewK = a.k((i7 = R.id.border), view)) != null) {
                    i7 = R.id.description;
                    SimpleDraweeSpanTextView simpleDraweeSpanTextView = (SimpleDraweeSpanTextView) a.k(i7, view);
                    if (simpleDraweeSpanTextView != null) {
                        i7 = R.id.error;
                        TextView textView2 = (TextView) a.k(i7, view);
                        if (textView2 != null) {
                            i7 = R.id.error_icon;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
                            if (simpleDraweeView2 != null) {
                                i7 = R.id.fields_bottom_wrap;
                                LinearLayout linearLayout2 = (LinearLayout) a.k(i7, view);
                                if (linearLayout2 != null) {
                                    i7 = R.id.fields_container;
                                    LinearLayout linearLayout3 = (LinearLayout) a.k(i7, view);
                                    if (linearLayout3 != null) {
                                        i7 = R.id.fields_top_wrap;
                                        LinearLayout linearLayout4 = (LinearLayout) a.k(i7, view);
                                        if (linearLayout4 != null) {
                                            i7 = R.id.footer_avatar;
                                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.k(i7, view);
                                            if (simpleDraweeView3 != null) {
                                                i7 = R.id.footer_container;
                                                LinearLayout linearLayout5 = (LinearLayout) a.k(i7, view);
                                                if (linearLayout5 != null) {
                                                    i7 = R.id.footer_text;
                                                    TextView textView3 = (TextView) a.k(i7, view);
                                                    if (textView3 != null) {
                                                        i7 = R.id.image_blur_bg;
                                                        FrameLayout frameLayout = (FrameLayout) a.k(i7, view);
                                                        if (frameLayout != null) {
                                                            i7 = R.id.inline_media_container;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                                                            if (constraintLayout != null) {
                                                                i7 = R.id.inline_media_view;
                                                                EmbedViewResizingMediaView embedViewResizingMediaView = (EmbedViewResizingMediaView) a.k(i7, view);
                                                                if (embedViewResizingMediaView != null) {
                                                                    i7 = R.id.inline_media_view2;
                                                                    EmbedViewResizingMediaView embedViewResizingMediaView2 = (EmbedViewResizingMediaView) a.k(i7, view);
                                                                    if (embedViewResizingMediaView2 != null) {
                                                                        i7 = R.id.inline_media_view3;
                                                                        EmbedViewResizingMediaView embedViewResizingMediaView3 = (EmbedViewResizingMediaView) a.k(i7, view);
                                                                        if (embedViewResizingMediaView3 != null) {
                                                                            i7 = R.id.inline_media_view4;
                                                                            EmbedViewResizingMediaView embedViewResizingMediaView4 = (EmbedViewResizingMediaView) a.k(i7, view);
                                                                            if (embedViewResizingMediaView4 != null) {
                                                                                i7 = R.id.media_view;
                                                                                EmbedViewResizingMediaView embedViewResizingMediaView5 = (EmbedViewResizingMediaView) a.k(i7, view);
                                                                                if (embedViewResizingMediaView5 != null) {
                                                                                    i7 = R.id.provider;
                                                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView2 = (SimpleDraweeSpanTextView) a.k(i7, view);
                                                                                    if (simpleDraweeSpanTextView2 != null) {
                                                                                        i7 = R.id.spacer;
                                                                                        Space space = (Space) a.k(i7, view);
                                                                                        if (space != null) {
                                                                                            i7 = R.id.spoiler;
                                                                                            SpoilerView spoilerView = (SpoilerView) a.k(i7, view);
                                                                                            if (spoilerView != null) {
                                                                                                i7 = R.id.thumbnail;
                                                                                                SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.k(i7, view);
                                                                                                if (simpleDraweeView4 != null) {
                                                                                                    i7 = R.id.title;
                                                                                                    SimpleDraweeSpanTextView simpleDraweeSpanTextView3 = (SimpleDraweeSpanTextView) a.k(i7, view);
                                                                                                    if (simpleDraweeSpanTextView3 != null) {
                                                                                                        return new EmbedViewBinding(view, simpleDraweeView, linearLayout, textView, viewK, simpleDraweeSpanTextView, textView2, simpleDraweeView2, linearLayout2, linearLayout3, linearLayout4, simpleDraweeView3, linearLayout5, textView3, frameLayout, constraintLayout, embedViewResizingMediaView, embedViewResizingMediaView2, embedViewResizingMediaView3, embedViewResizingMediaView4, embedViewResizingMediaView5, simpleDraweeSpanTextView2, space, spoilerView, simpleDraweeView4, simpleDraweeSpanTextView3);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static EmbedViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.embed_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
