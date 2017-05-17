package org.superbiz.parallel.runner;

import java.util.concurrent.TimeUnit;
import org.arquillian.cube.HostPort;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestThree {


    @HostPort(containerName = "redis*", value = 6379)
    private int portBinding;


    @Test
    public void should_print_port_binding() throws InterruptedException {
        System.out.println(TestOne.class.getCanonicalName() + " - " + portBinding);
        TimeUnit.SECONDS.sleep(4);
    }

}
