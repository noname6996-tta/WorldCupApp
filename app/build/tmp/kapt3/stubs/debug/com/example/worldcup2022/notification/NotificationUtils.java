package com.example.worldcup2022.notification;

import android.app.*;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.example.worldcup2022.R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u000bJH\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J4\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0007J@\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/worldcup2022/notification/NotificationUtils;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "channelId", "", "getBitmapFromURL", "Landroid/graphics/Bitmap;", "strURL", "playNotificationSound", "", "showBigNotification", "bitmap", "mBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "icon", "", "title", "message", "timeStamp", "resultPendingIntent", "Landroid/app/PendingIntent;", "alarmSound", "Landroid/net/Uri;", "showNotificationMessage", "intent", "Landroid/content/Intent;", "imageUrl", "showSmallNotification", "Companion", "app_debug"})
public final class NotificationUtils {
    private final android.content.Context mContext = null;
    private final java.lang.String channelId = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.notification.NotificationUtils.Companion Companion = null;
    
    public NotificationUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @kotlin.jvm.JvmOverloads()
    public final void showNotificationMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    private final void showSmallNotification(androidx.core.app.NotificationCompat.Builder mBuilder, int icon, java.lang.String title, java.lang.String message, java.lang.String timeStamp, android.app.PendingIntent resultPendingIntent, android.net.Uri alarmSound) {
    }
    
    private final void showBigNotification(android.graphics.Bitmap bitmap, androidx.core.app.NotificationCompat.Builder mBuilder, int icon, java.lang.String title, java.lang.String message, java.lang.String timeStamp, android.app.PendingIntent resultPendingIntent, android.net.Uri alarmSound) {
    }
    
    /**
     * Downloading push notification image before displaying it in
     * the notification tray
     */
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getBitmapFromURL(@org.jetbrains.annotations.NotNull()
    java.lang.String strURL) {
        return null;
    }
    
    public final void playNotificationSound() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/notification/NotificationUtils$Companion;", "", "()V", "getTimeMilliSec", "", "timeStamp", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final long getTimeMilliSec(@org.jetbrains.annotations.NotNull()
        java.lang.String timeStamp) {
            return 0L;
        }
    }
}