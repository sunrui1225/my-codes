package cn.rainshell.mycodes.completablefuture.servicImpl;

import cn.rainshell.mycodes.completablefuture.BuildParams;
import lombok.Data;

@Data
public class ResultParams {

    private Long id;

    private BuildParams params;
}
