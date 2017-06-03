import javax.management.MBeanNotificationInfo;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;

/**
 * Created by bespa on 20.05.2017.
 */
public interface InterfaseForBean{

        public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback);

        public abstract String getName();

        public abstract int getCacheSize();

        public abstract void setCacheSize(int size);

        public abstract void sayHello();

        public abstract int add(int x, int y);

        public abstract MBeanNotificationInfo[] getNotificationInfo();

        public String getIdentification();

        public void initialize(Object paramObject);
}
