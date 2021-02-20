package dependson.demo.bean;


import dependson.demo.event.EventManager;

/**
 * 事件监听者，可以增加监听器。
 */
public class EventListenerBean {
    private void initialize() {
    	System.out.println("EventListenerBean 初始化完成...");
        EventManager.getInstance().
                addListener(s ->
                        System.out.println("在EventListenerBean中监听的事件 : " + s));
    }
}
