package com.example.worldcup2022.data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/worldcup2022/data/Data;", "", "()V", "parseTime", "", "timeInString", "", "app_debug"})
public final class Data {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.worldcup2022.data.Data INSTANCE = null;
    
    private Data() {
        super();
    }
    
    /**
     * Parse [timeInString] to a date and return milliseconds that represent this day.
     * Note that [timeInString] must have format "yyyy-MM-dd'T'HH:mm:ssZ"
     * Example 2022-10-11T10:00:00-0700 -> 10h, 11/10/2022, GMT -07:00
     * @param timeInString a string have format "yyyy-MM-dd'T'HH:mm:ssZ", represent the day in
     * ISO 8601 format
     */
    public final long parseTime(@org.jetbrains.annotations.NotNull()
    java.lang.String timeInString) {
        return 0L;
    }
}