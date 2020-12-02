package decorator;

public class InformationSenderForTennis extends InformationSender {
    @Override
    public void sendInformation(String message) {
        //获取相应的wrapper
        //Tennisnews只是用做字符串参数，该类并未做任何与Tennis有关的额外操作
        String wrapper = getWrapper("Tennisnews", message.length(), "*");

        System.out.println(wrapper);
        System.out.println(message);
        System.out.println(wrapper);
    }
}
