package dependson.demo.bean;


import dependson.demo.event.EventManager;

/**
 * �¼������ߣ��������Ӽ�������
 */
public class EventListenerBean {
    private void initialize() {
    	System.out.println("EventListenerBean ��ʼ�����...");
        EventManager.getInstance().
                addListener(s ->
                        System.out.println("��EventListenerBean�м������¼� : " + s));
    }
}
