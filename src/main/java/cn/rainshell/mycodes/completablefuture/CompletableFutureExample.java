package cn.rainshell.mycodes.completablefuture;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
@Slf4j
public class CompletableFutureExample {

    @Resource
    private List<HelpService> helpServiceList;

    public BuildParams buildParamsWithFuture( Long id )  {
        BuildParams param = new BuildParams();
        try {
            CompletableFuture.allOf(helpServiceList.stream()
                    .map(helpServiceList -> CompletableFuture.supplyAsync(() ->
                            helpServiceList.getParam(param, id))).toArray(CompletableFuture[]::new)).get();
        } catch (InterruptedException | ExecutionException e) {
            log.error("线程池获取数据异，入参：{}", id,e);
            throw new RuntimeException("线程池获取数据异",e);
        }
        return param;
    }
}
