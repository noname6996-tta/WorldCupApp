package com.example.worldcup2022.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\rJQ\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0016Je\u0010\u001a\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u00110\u001f\u00a2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\t0\u0016H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/worldcup2022/utils/FileUtilsEditor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "SAVED_IMAGE_FORMAT", "", "SAVED_IMAGE_NAME", "addPhotoToGallery", "", "photoPath", "getPathFolder", "isThanQ", "", "saveExternal", "bitmap", "Landroid/graphics/Bitmap;", "fileName", "extention", "type", "folderName", "pathSuccessSave", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "path", "saveImageToStorage", "filename", "mimeType", "directory", "mediaContentUri", "Landroid/net/Uri;", "pathSuccess", "uri", "app_debug"})
public final class FileUtilsEditor {
    private final android.content.Context context = null;
    private final java.lang.String SAVED_IMAGE_FORMAT = ".png";
    private final java.lang.String SAVED_IMAGE_NAME = null;
    
    public FileUtilsEditor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void saveExternal(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    java.lang.String extention, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String folderName, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> pathSuccessSave) {
    }
    
    public final boolean isThanQ() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPathFolder() {
        return null;
    }
    
    @kotlin.Suppress(names = {"DEPRECATION"})
    private final void saveImageToStorage(android.graphics.Bitmap bitmap, java.lang.String filename, java.lang.String mimeType, java.lang.String directory, java.lang.String folderName, android.net.Uri mediaContentUri, kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> pathSuccess) {
    }
    
    public final void addPhotoToGallery(@org.jetbrains.annotations.NotNull()
    java.lang.String photoPath) {
    }
}