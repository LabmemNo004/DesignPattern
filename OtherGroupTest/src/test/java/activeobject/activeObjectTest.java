package activeobject;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.junit.Test;

/**
 * @Author: wjm
 * @Date: Created in 2020/12/01
 **/
public class activeObjectTest {
    @Test
    public void activeObjectTest() {
        System.out.println("===========ActiveObject Test===========");
        SecuritySystem system = new SecuritySystem();
        Alarm carnivoreAreaAlarm = new Alarm(2000, "Carnivorous  Alarm", system);
        Alarm herbivoreAreaAlarm = new Alarm(5000, "plant-eating", system);

        system.addAlarm(carnivoreAreaAlarm);
        system.addAlarm(herbivoreAreaAlarm);
        Alarm.ShutCommand shutCommand = new Alarm.ShutCommand();
        system.addCommand(new SleepCommand(10100, system, shutCommand));
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        System.out.println("Security system open"+df.format(new Date()));
        system.run();
        System.out.println("===========ActiveObject Test End===========");
    }
}
