package cn.rainshell.mycodes.completablefuture.servicImpl;

import cn.rainshell.mycodes.completablefuture.BuildParams;
import cn.rainshell.mycodes.completablefuture.HelpService;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements HelpService {

    @Override
    public Boolean getParam(BuildParams param, Long id) {

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        param.setAddress("Address 3");

        return true;
    }
}
