package dependson.demo.bean;


import dependson.demo.event.EventManager;

/**
 * 事件发布类，通过EventManager类发布事件。
 */
public class EventPublisherBean {
    public void initialize() {
        System.out.println("EventPublisherBean 初始化完成...");
        EventManager.getInstance().publish("从EventPublisherBean中发布了某事件");
    }
}