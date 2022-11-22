package com.example.worldcup2022.data.dto.recipes;

import android.os.Parcelable;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlinx.android.parcel.Parcelize;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00b7\u0002\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0003\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\r\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0003\u0010 \u001a\u00020!\u0012\u000e\b\u0003\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\u0002\u0010#J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0011H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u001bH\u00c6\u0003J\t\u0010S\u001a\u00020\u000bH\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010W\u001a\u00020!H\u00c6\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u000bH\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u000bH\u00c6\u0003J\u00bb\u0002\u0010`\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\u000e\b\u0003\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0003\u0010\u0017\u001a\u00020\u00032\u000e\b\u0003\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u001b2\b\b\u0003\u0010\u001c\u001a\u00020\u000b2\b\b\u0003\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u001e\u001a\u00020\u00032\u000e\b\u0003\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0003\u0010 \u001a\u00020!2\u000e\b\u0003\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0001J\t\u0010a\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010b\u001a\u00020\u00112\b\u0010c\u001a\u0004\u0018\u00010dH\u00d6\u0003J\t\u0010e\u001a\u00020\u000bH\u00d6\u0001J\t\u0010f\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010*R\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010%R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u001c\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0011\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010*R\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010*\u00a8\u0006l"}, d2 = {"Lcom/example/worldcup2022/data/dto/recipes/RecipesItem;", "Landroid/os/Parcelable;", "calories", "", "carbos", "card", "country", "deliverableIngredients", "", "description", "difficulty", "", "fats", "favorites", "fibers", "headline", "highlighted", "", "id", "image", "incompatibilities", "ingredients", "keywords", "name", "products", "proteins", "rating", "", "ratings", "thumb", "time", "undeliverableIngredients", "user", "Lcom/example/worldcup2022/data/dto/recipes/User;", "weeks", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/example/worldcup2022/data/dto/recipes/User;Ljava/util/List;)V", "getCalories", "()Ljava/lang/String;", "getCarbos", "getCard", "getCountry", "getDeliverableIngredients", "()Ljava/util/List;", "getDescription", "getDifficulty", "()I", "getFats", "getFavorites", "getFibers", "getHeadline", "getHighlighted", "()Z", "getId", "getImage", "getIncompatibilities", "getIngredients", "getKeywords", "getName", "getProducts", "getProteins", "getRating", "()D", "getRatings", "getThumb", "getTime", "getUndeliverableIngredients", "getUser", "()Lcom/example/worldcup2022/data/dto/recipes/User;", "getWeeks", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = false)
public final class RecipesItem implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String calories = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String carbos = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String card = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> deliverableIngredients = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int difficulty = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fats = null;
    private final int favorites = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fibers = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String headline = null;
    private final boolean highlighted = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String image = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String incompatibilities = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> ingredients = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> keywords = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> products = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String proteins = null;
    private final double rating = 0.0;
    private final int ratings = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String thumb = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String time = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> undeliverableIngredients = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.worldcup2022.data.dto.recipes.User user = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> weeks = null;
    public static final android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.recipes.RecipesItem> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.recipes.RecipesItem copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "calories")
    java.lang.String calories, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "carbos")
    java.lang.String carbos, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "card")
    java.lang.String card, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "deliverable_ingredients")
    java.util.List<java.lang.String> deliverableIngredients, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @com.squareup.moshi.Json(name = "difficulty")
    int difficulty, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "fats")
    java.lang.String fats, @com.squareup.moshi.Json(name = "favorites")
    int favorites, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "fibers")
    java.lang.String fibers, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "headline")
    java.lang.String headline, @com.squareup.moshi.Json(name = "highlighted")
    boolean highlighted, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "image")
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "incompatibilities")
    java.lang.String incompatibilities, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "ingredients")
    java.util.List<java.lang.String> ingredients, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "keywords")
    java.util.List<java.lang.String> keywords, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "products")
    java.util.List<java.lang.String> products, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "proteins")
    java.lang.String proteins, @com.squareup.moshi.Json(name = "rating")
    double rating, @com.squareup.moshi.Json(name = "ratings")
    int ratings, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "thumb")
    java.lang.String thumb, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "undeliverable_ingredients")
    java.util.List<java.lang.String> undeliverableIngredients, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "user")
    com.example.worldcup2022.data.dto.recipes.User user, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weeks")
    java.util.List<java.lang.String> weeks) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RecipesItem() {
        super();
    }
    
    public RecipesItem(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "calories")
    java.lang.String calories, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "carbos")
    java.lang.String carbos, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "card")
    java.lang.String card, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "deliverable_ingredients")
    java.util.List<java.lang.String> deliverableIngredients, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @com.squareup.moshi.Json(name = "difficulty")
    int difficulty, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "fats")
    java.lang.String fats, @com.squareup.moshi.Json(name = "favorites")
    int favorites, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "fibers")
    java.lang.String fibers, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "headline")
    java.lang.String headline, @com.squareup.moshi.Json(name = "highlighted")
    boolean highlighted, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "image")
    java.lang.String image, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "incompatibilities")
    java.lang.String incompatibilities, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "ingredients")
    java.util.List<java.lang.String> ingredients, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "keywords")
    java.util.List<java.lang.String> keywords, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "products")
    java.util.List<java.lang.String> products, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "proteins")
    java.lang.String proteins, @com.squareup.moshi.Json(name = "rating")
    double rating, @com.squareup.moshi.Json(name = "ratings")
    int ratings, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "thumb")
    java.lang.String thumb, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "time")
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "undeliverable_ingredients")
    java.util.List<java.lang.String> undeliverableIngredients, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "user")
    com.example.worldcup2022.data.dto.recipes.User user, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "weeks")
    java.util.List<java.lang.String> weeks) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCalories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarbos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCard() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDeliverableIngredients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getDifficulty() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFats() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getFavorites() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFibers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeadline() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getHighlighted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIncompatibilities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getIngredients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getKeywords() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProteins() {
        return null;
    }
    
    public final double component21() {
        return 0.0;
    }
    
    public final double getRating() {
        return 0.0;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int getRatings() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getUndeliverableIngredients() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.recipes.User component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.worldcup2022.data.dto.recipes.User getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWeeks() {
        return null;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.example.worldcup2022.data.dto.recipes.RecipesItem> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.recipes.RecipesItem createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.example.worldcup2022.data.dto.recipes.RecipesItem[] newArray(int size) {
            return null;
        }
    }
}