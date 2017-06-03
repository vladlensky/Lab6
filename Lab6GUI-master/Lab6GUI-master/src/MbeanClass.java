import javax.management.*;
import java.lang.management.ManagementFactory;
public class MbeanClass{
    private MBeanServer mbs = null;
    public MbeanClass()
    {
        mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName InterfaceName = null;
        try {
            InterfaceName = new ObjectName("MbeanClass:type=Interface");
            mbs.registerMBean(new Interface(), InterfaceName);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
