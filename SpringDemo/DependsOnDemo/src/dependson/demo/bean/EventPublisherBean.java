package dependson.demo.bean;


import dependson.demo.event.EventManager;

/**
 * �¼������࣬ͨ��EventManager�෢���¼���
 */
public class EventPublisherBean {
    public void initialize() {
        System.out.println("EventPublisherBean ��ʼ�����...");
        EventManager.getInstance().publish("��EventPublisherBean�з�����ĳ�¼�");
    }
}