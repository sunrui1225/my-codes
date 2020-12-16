package cn.rainshell.mycodes.completablefuture.servicImpl;

import cn.rainshell.mycodes.completablefuture.BuildParams;
import cn.rainshell.mycodes.completablefuture.HelpService;
import org.springframework.stereotype.Service;

@Service
public class IdService implements HelpService {
    @Override
    public Boolean getParam(BuildParams param, Long id) {

        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        throw new RuntimeException("超时");
//        param.setId(3L);
//        return true;
    }
}
