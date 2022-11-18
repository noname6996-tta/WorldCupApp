package com.example.worldcup2022.usecase.errors;

import com.example.worldcup2022.data.error.Error;
import com.example.worldcup2022.data.error.mapper.ErrorMapper;
import javax.inject.Inject;

/**
 * Created by TruyenIT
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/worldcup2022/usecase/errors/ErrorManager;", "Lcom/example/worldcup2022/usecase/errors/ErrorUseCase;", "errorMapper", "Lcom/example/worldcup2022/data/error/mapper/ErrorMapper;", "(Lcom/example/worldcup2022/data/error/mapper/ErrorMapper;)V", "getError", "Lcom/example/worldcup2022/data/error/Error;", "errorCode", "", "app_devDebug"})
public final class ErrorManager implements com.example.worldcup2022.usecase.errors.ErrorUseCase {
    private final com.example.worldcup2022.data.error.mapper.ErrorMapper errorMapper = null;
    
    @javax.inject.Inject()
    public ErrorManager(@org.jetbrains.annotations.NotNull()
    com.example.worldcup2022.data.error.mapper.ErrorMapper errorMapper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.worldcup2022.data.error.Error getError(int errorCode) {
        return null;
    }
}