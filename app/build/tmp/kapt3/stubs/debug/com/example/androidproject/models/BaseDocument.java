package com.example.androidproject.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidproject/models/BaseDocument;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "updatedAt", "", "getUpdatedAt", "()J", "setUpdatedAt", "(J)V", "app_debug"})
public abstract class BaseDocument {
    
    public BaseDocument() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    public abstract void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public abstract long getUpdatedAt();
    
    public abstract void setUpdatedAt(long p0);
}